package jdbctest;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BankMain {

    private static final String URL = "jdbc:mysql://localhost/bank";
    private static final String USER = "cursist";
    private static final String PASSWORD = "cursist";
    //private static final String SQL_SELECT = "select rekeningnr, saldo from bank\n";

    public static void main(String[] args) {
        //DecimalFormat fmt = new DecimalFormat("#,##0.00");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Kies actie <1=nieuwe rekening, 2=saldo, 3=overschrijving> :");

            int menuItem = scanner.nextInt();
            try {
                if (menuItem == 1) {
                    System.out.print("geef rekeningnummer <12 cijfers uit 0-9> :");

                    String rekening = scanner.next();
                    if (isRekNrOk(rekening)) {
                        openNieuweRekening(rekening);
                    } else {
                       throw new Exception("De rekeningnr is ongeldig! Opdracht is niet uitgevoerd!...");
                    }

                } else if (menuItem == 2) {
                    System.out.print("geef rekeningnummer <12 cijfers uit 0-9> :");
                    String rekening = scanner.next();
                    if (isRekNrOk(rekening)) {
                        boolean bol = toonSaldo(rekening);
                        if (bol == false) {
                            throw new Exception("rekeningnr bestaat niet");
                        }
                    } else {
                        throw new Exception("De rekeningnr is ongeldig!");
                    }
                } else if (menuItem == 3) {
                    System.out.print("Rekeningnummer opdrachtgever <12 cijfers uit 0-9> : ");
                    String reknrOpdrachtGvr = scanner.next();
                    if (isRekNrOk(reknrOpdrachtGvr) == false) {
                        throw new Exception("De rekeningnr opdrachtgever is ongeldig!");
                    }
                    
                    System.out.print("Rekeningnummer begunstige <12 cijfers uit 0-9> : ");
                    String reknrBegunstige = scanner.next();
                    if (isRekNrOk(reknrBegunstige) == false) {
                        throw new Exception("De rekeningnr begunstige is ongeldig!");
                    } else if (reknrOpdrachtGvr.equals(reknrBegunstige)) {
                        throw new Exception("Onjuist: rekening opdracht gever is zelf aan begunstige");
                    }
                    
                    System.out.print("Bedrag : ");
                    BigDecimal bedrag = scanner.nextBigDecimal();
                    System.out.println(doeOverschrijving(reknrOpdrachtGvr, reknrBegunstige, bedrag));
                } else {
                    System.out.println("Tik een getal tussen 1 en 3");
                }

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private static void openNieuweRekening(String reknr) {
        String SQL_INSERT = "INSERT INTO rekeningen (rekeningnr,saldo) VALUES(" + reknr + ",DEFAULT);\n";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement statement = connection.createStatement()) {
            System.out.println(statement.executeUpdate(SQL_INSERT));
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private static boolean toonSaldo(String rekening) throws SQLException {
        String SQL_SELECT = "SELECT rekeningnr, saldo FROM rekeningen where rekeningnr=" + rekening;
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(SQL_SELECT)) {
            if (resultSet.first()) {
                //while (resultSet.next()) {
                System.out.println(resultSet.getString("rekeningnr") + "\t" + resultSet.getBigDecimal("saldo"));
                return true;
                //}
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    private static String doeOverschrijving(String reknrVan, String reknrNaar, BigDecimal bedrag) {
        String SQL_UPDATE1 = "update rekeningen set saldo=saldo-" + bedrag
                + " where rekeningnr = " + reknrVan + " and saldo >= " + bedrag;
        String SQL_UPDATE2 = "update rekeningen set saldo=saldo+" + bedrag
                + " where rekeningnr = " + reknrNaar;

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement statement = connection.createStatement()) {
            //check rekeningnr en saldo
            ResultSet rs1 = statement.executeQuery("SELECT rekeningnr, saldo FROM rekeningen where rekeningnr=" + reknrVan);

            if (!rs1.first()) { // rekening1 does not exists
                return "Rekeningnr opdrachtgever bestaat niet";
            } else if (rs1.getBigDecimal("saldo").compareTo(bedrag) < 0) { // not enough saldo
                return "Saldo niet genoeg";
            }
            ResultSet rs2 = statement.executeQuery("SELECT rekeningnr, saldo FROM rekeningen where rekeningnr=" + reknrNaar);
            if (!rs2.first()) { // rekening2 does not exists
                return "Rekeningnr begunstige bestaat niet";
            }
            connection.setAutoCommit(false); //required for execution of sql query groups
            statement.addBatch(SQL_UPDATE1); //batch update speeds up the transaction
            statement.addBatch(SQL_UPDATE2);
            statement.executeBatch();
            connection.commit();// rolls back transaction if not reached due to any error 
            return "Overschrijving is OK!";
        } catch (SQLException ex) {
            return "SQLException: " + ex.getMessage();
        }
    }

    private static boolean isRekNrOk(String reknr) {
        if (reknr.length() == 12) {
            int d1 = Integer.parseInt(reknr.substring(0, 10));
            int d2 = Integer.parseInt(reknr.substring(10, 12));
            int rest = (int) (d1 % 97);

            if (rest == d2) {
                return true;
            }
            return false;
        }
        return false;
    }
}
