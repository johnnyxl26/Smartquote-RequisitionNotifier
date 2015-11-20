package java.com.pernix.smartquote.mysql.connector;
import java.sql.*;

public class MySqlConnector {

    private Connection mysqlConnection;

    public MySqlConnector(Connection mysqlConnection) {
        this.mysqlConnection = mysqlConnection;
    }

    public MySqlConnector(){
        mysqlConnection = null;
    }

    public Connection getMysqlConnection() {
        return mysqlConnection;
    }

    public void setMysqlConnection(Connection mysqlConnection) {
        this.mysqlConnection = mysqlConnection;
    }

    public void connectToDb() throws SQLException {
        loadMySqlDriver();
        mysqlConnection = DriverManager.getConnection("jdbc:mysql://localhost/feedback? user=root&password=root");
    }

    public void loadMySqlDriver(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {

        }
    }


}