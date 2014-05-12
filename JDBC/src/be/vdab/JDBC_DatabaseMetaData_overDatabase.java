package be.vdab;
// enkele imports

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_DatabaseMetaData_overDatabase {

    private static final String URL = "jdbc:mysql://localhost/tuincentrum";
    private static final String USER = "cursist";
    private static final String PASSWORD = "cursist";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            DatabaseMetaData metaData = connection.getMetaData();
            System.out.println(metaData.getDriverName() + ' '
                    + metaData.getDriverMajorVersion() + ' '
                    + metaData.getDriverMinorVersion());
            System.out.println(metaData.getDatabaseProductName() + ' '
                    + metaData.getDatabaseMajorVersion() + ' '
                    + metaData.getDatabaseMinorVersion());
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
