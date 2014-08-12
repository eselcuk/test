/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab;
// enkele imports

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_example_SelectMetParam2 {

    private static final String URL = "jdbc:mysql://localhost/bieren";
    private static final String USER = "cursist";
    private static final String PASSWORD = "cursist";
    private static final String SELECT_SQL
            = "SELECT verkochtsinds, naam FROM bieren\n"
            + "where {fn month(verkochtsinds)} = ? \n"
            + "order by verkochtsinds;";

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Maandnumber:");
            int maand = scanner.nextInt();
            if (maand >= 1 && maand <= 12) {
                try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                        PreparedStatement prepStatement = connection.prepareStatement(SELECT_SQL)) {
                    prepStatement.setInt(1, maand);
                    try (ResultSet resultSet = prepStatement.executeQuery()) {
                        while (resultSet.next()) {
                            System.out.println(resultSet.getDate("VerkochtSinds") + "\t" + resultSet.getString("naam"));
                        }
                    }
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            } else {
                System.out.println("Tik een getal tussen 1 en 12");
            }
        }
    }
}
