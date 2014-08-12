package be.vdab;
// enkele imports

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_TransactionIsolation_Serializable {

    private static final String URL = "jdbc:mysql://localhost/tuincentrum";
    private static final String USER = "cursist";
    private static final String PASSWORD = "cursist";
    private static final String SQL_SELECT
            = "select verkoopprijs from planten where id=?";
    private static final String SQL_UPDATE
            = " update planten set verkoopprijs=? where id=?";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Id:");
            int id = scanner.nextInt();
            System.out.print("Verkoopprijs:");
            BigDecimal nieuwePrijs = scanner.nextBigDecimal();
            try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                    PreparedStatement statementSelect
                    = connection.prepareStatement(SQL_SELECT);
                    PreparedStatement statementUpdate
                    = connection.prepareStatement(SQL_UPDATE)) {
                connection.setTransactionIsolation(
                        Connection.TRANSACTION_SERIALIZABLE);
                connection.setAutoCommit(false);
                statementSelect.setInt(1, id);
                try (ResultSet resultSet = statementSelect.executeQuery()) {
                    if (resultSet.next()) {
                        BigDecimal oudePrijs = resultSet.getBigDecimal("verkoopprijs");
                        if (nieuwePrijs.compareTo(
                                oudePrijs.multiply(new BigDecimal("1.1"))) <= 0) {
                            statementUpdate.setBigDecimal(1, nieuwePrijs);
                            statementUpdate.setInt(2, id);
                            statementUpdate.execute();
                            connection.commit();
                        } else {
                            System.out.println("Nieuwe verkoopprijs te hoog");
                        }
                    } else {
                        System.out.println("Plant niet gevonden");
                    }
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }
}
