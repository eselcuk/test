/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_getConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/tuincentrum";
    private static final String USER = "cursist";
    private static final String PASSWORD = "cursist";

    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connectie geopend");
        } catch (SQLException ex) {
            System.out.println(ex);
            /*   not necessarily since AutoCloseable from Java 7 on...
             } finally {
             if (connection != null) {
             try {
             connection.close();
             } catch (SQLException ex) {
             System.out.println(ex);
             }
             }
             */
        }

    }
}
