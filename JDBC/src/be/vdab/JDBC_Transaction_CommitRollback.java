package be.vdab;
// enkele imports

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Transaction_CommitRollback {

    private static final String URL = "jdbc:mysql://localhost/tuincentrum";
    private static final String USER = "cursist";
    private static final String PASSWORD = "cursist";
    private static final String SQL_UPDATE1 = "update planten set verkoopprijs ="
            + "verkoopprijs*1.1 where verkoopprijs >= 100";
    private static final String SQL_UPDATE2 = "update planten set verkoopprijs ="
            + " verkoopprijs*1.05 where verkoopprijs < 100";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement statement = connection.createStatement()) {
            connection.setAutoCommit(false); //required for execution of sql query groups
            statement.execute(SQL_UPDATE1);
            statement.execute(SQL_UPDATE2);
            connection.commit();            // rolls back transaction if not reached due to any error 
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
