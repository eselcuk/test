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

public class JDBC_example_SelectMetParam {

    private static final String URL = "jdbc:mysql://localhost/bieren";
    private static final String USER = "cursist";
    private static final String PASSWORD = "cursist";
    private static final String SELECT_SQL
            = "select alcohol, naam from bieren\n"
            + "WHERE alcohol between ? AND ?\n"
            + "order by alcohol, naam";

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Minimum alcohol%:");
            BigDecimal minimum = scanner.nextBigDecimal() ;
            System.out.println("Maximum alcohol%:");
            BigDecimal maximum = scanner.nextBigDecimal();

            try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                    PreparedStatement prepStatement = connection.prepareStatement(SELECT_SQL)) {
                prepStatement.setBigDecimal(1, minimum);
                prepStatement.setBigDecimal(2, maximum);
                try (ResultSet resultSet = prepStatement.executeQuery()) {
                    while (resultSet.next()) {
                        System.out.println(resultSet.getBigDecimal(1) + "\t" + resultSet.getString(2));
                        //System.out.println(resultSet.getBigDecimal("alcohol") + "\t" + resultSet.getString("naam"));
                    }
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
