/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab;
// enkele imports

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_example_UpdateMetTransaction {

    private static final String URL = "jdbc:mysql://localhost/bieren";
    private static final String USER = "cursist";
    private static final String PASSWORD = "cursist";
    private static final String UPDATE_SQL1
            = "update bieren set brouwerid=2 where brouwerid=1 and alcohol>=8.5";
    private static final String UPDATE_SQL2
            = "update bieren set brouwerid=3 where brouwerid=1";
    private static final String DELETE_SQL
            = "delete from brouwers where id=1";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement statement = connection.createStatement()) {
            connection.setAutoCommit(false);
            statement.addBatch(UPDATE_SQL1);
            statement.addBatch(UPDATE_SQL2);
            statement.addBatch(DELETE_SQL);
            statement.executeBatch();
            connection.commit();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
