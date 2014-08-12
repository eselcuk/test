package be.vdab;
// enkele imports

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_StoredProcedure {

    private static final String URL
            = "jdbc:mysql://localhost/tuincentrum?noAccessToProcedureBodies=true";
    private static final String USER = "cursist";
    private static final String PASSWORD = "cursist";
    private static final String CALL = "{call PlantenMetEenWoord(?)}";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Woord:");
            String woord = scanner.nextLine();
            try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                    CallableStatement statement = connection.prepareCall(CALL)) {
                statement.setString(1, '%' + woord + '%');
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        System.out.println(resultSet.getString("naam"));
                    }
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }
}
