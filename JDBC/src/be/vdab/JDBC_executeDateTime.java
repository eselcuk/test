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

public class JDBC_executeDateTime {

    private static final String URL = "jdbc:mysql://localhost/tuincentrum";
    private static final String USER = "cursist";
    private static final String PASSWORD = "cursist";
    private static final String SELECT_SQL = "select indienst,voornaam, familienaam"
            + " from werknemers where indienst >= {d '2001-1-1'} order by indienst";
    //execute time: {t '12:35:00'}, execute DateTime: {ts '2001-1-31 12:35:00'}
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(SELECT_SQL)) {
            while (resultSet.next()) {
                System.out.println(resultSet.getDate("indienst") + " "
                        + resultSet.getString("voornaam") + " "
                        + resultSet.getString("familienaam"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
