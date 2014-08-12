/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab;
// enkele imports

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_example_Select {

    private static final String URL = "jdbc:mysql://localhost/bieren";
    private static final String USER = "cursist";
    private static final String PASSWORD = "cursist";
    private static final String SELECT_SQL
            = "select brouwers.naam, count(bieren.naam) aantal from bieren\n"
            + "inner join brouwers on brouwers.id=bieren.brouwerid\n"
            + "group by brouwers.id, brouwers.naam\n"
            + "order by brouwers.naam";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(SELECT_SQL)) {
            while (resultSet.next()) {
                //System.out.println(resultSet.getString(1) + "\t" + resultSet.getInt(2));
                System.out.println(resultSet.getString("naam") + "\t" + resultSet.getInt("aantal"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
