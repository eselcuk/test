package be.vdab;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_example_StoredProcedure {

    private static final String URL
            = "jdbc:mysql://localhost/bieren?noAccessToProcedureBodies=true";
    private static final String USER = "cursist";
    private static final String PASSWORD = "cursist";
    private static final String CALL = "{CALL bieren.BierenMetMinMaxAlcohol(?,?)}";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Minimum alcohol:");
            BigDecimal minimum = scanner.nextBigDecimal();
            System.out.print("Maximum alcohol:");
            BigDecimal maximum = scanner.nextBigDecimal();
            try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                    CallableStatement callableStatement = connection.prepareCall(CALL)) {
                callableStatement.setBigDecimal(1, minimum);
                callableStatement.setBigDecimal(2, maximum);
                try (ResultSet resultSet = callableStatement.executeQuery()) {
                    while (resultSet.next()) {
                        System.out.println(resultSet.getString("biernaam")
                                + " " + resultSet.getString("brouwersnaam")
                                + " " + resultSet.getBigDecimal("alcohol"));
                    }
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }
}
