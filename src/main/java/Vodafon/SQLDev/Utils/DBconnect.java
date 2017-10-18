package Vodafon.SQLDev.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import static java.lang.System.err;

/**
 * Created by Grzegorz Gałuszka on 08.08.2017.
 */
public class DBconnect {
    public static Connection connection;

    public static void initConnection() throws SQLException {
        //public static void initConnection() throws SQLException {

        if (connection!=null){
            return;
        }
        try{
            String host = "jdbc:oracle:thin:@localhost:1521/xe";
            String uzytkownik = "hybrisuser";
            String haslo = "hybris";
            connection = DriverManager.getConnection(host,uzytkownik,haslo);
        } catch(SQLException err){
            System.out.println(err.getMessage());
        }
    }

    public static void closeConnection() throws SQLException {
        //public static void initConnection() throws SQLException {

        if (connection==null){
            return;
        }

        connection.close();
    }

    public static Connection getConnection() {
        return connection;
    }
}
