
/* JDBC Date and Time functions
     curdate() huidige datum
     curtime() huidige tijd
     now() huidige datum en tijd
     dayofmonth(eenDatum) dag in de maand van eenDatum (getal tussen 1 en 31)
     dayofweek(eenDatum) dag in de week van eenDatum (getal tussen 1:zondag en 7)
     dayofyear(eenDatum) dag in het jaar van eenDatum (getal tussen 1 en 366)
     month(eenDatum) maand in eenDatum (getal tussen 1 en 12)
     week(eenDatum) week van eenDatum (getal tussen 1 en 53)
     year(eenDatum) jaartal van eenDatum
     hour(eenTijd) uur van eenTijd (getal tussen 0 en 23)
     minute(eenTijd) minuten van eenTijd (getal tussen 0 en 59)
     second(eenTijd) seconden van eenTijd (getal tussen 0 en 59)
*/

package be.vdab;
// enkele imports

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_PrepareStatement_functions_DateTime {
    private static final String URL = "jdbc:mysql://localhost/tuincentrum";
    private static final String USER = "cursist";
    private static final String PASSWORD = "cursist";
    private static final String SELECT_SQL = "select geboorte,voornaam,familienaam"
            + " from werknemers where {fn month(geboorte)}="
            + "{fn month({fn curdate()})} order by {fn dayofmonth(geboorte)}";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(SELECT_SQL)) {
            while (resultSet.next()) {
                System.out.println(resultSet.getDate("geboorte") + " "
                        + resultSet.getString("voornaam") + ' '
                        + resultSet.getString("familienaam"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
