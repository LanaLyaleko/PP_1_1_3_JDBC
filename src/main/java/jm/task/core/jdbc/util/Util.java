package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;

public class Util {
    private static final String Connection_Url = "jdbc:mysql://localhost:3306/test?" +
            "&serverTimeZone=Europe/Moscow&useSSL=false&allowPublicKeyRetrieval=true";
    private static final String User = "root";
    private static final String Password = "admin";

    public static Connection getConnection() {

        Connection connection = null;

        try
        {
            connection = DriverManager.getConnection( Connection_Url,User,Password);
            connection.setAutoCommit(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}