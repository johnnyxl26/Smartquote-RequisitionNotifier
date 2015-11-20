package java.com.pernix.smartquote.services;

import java.com.pernix.smartquote.mysql.connector.MySqlConnector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlService {

    public static final String SELECT_NEW_REQUISITIONS = "SELECT id FROM requisitions WHERE status=0;";
    private MySqlConnector mySqlConnector;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public MySqlService(MySqlConnector mySqlConnector, Statement statement, PreparedStatement preparedStatement, ResultSet resultSet) {
        this.mySqlConnector = mySqlConnector;
        this.statement = statement;
        this.preparedStatement = preparedStatement;
        this.resultSet = resultSet;
    }

    public MySqlService(){
        mySqlConnector =  null;
        statement = null;
        preparedStatement = null;
        resultSet = null;
    }

    public ResultSet getNewRequisitions () throws SQLException {
        statement = mySqlConnector.getMysqlConnection().createStatement();
        return statement.executeQuery(SELECT_NEW_REQUISITIONS);
    }
}
