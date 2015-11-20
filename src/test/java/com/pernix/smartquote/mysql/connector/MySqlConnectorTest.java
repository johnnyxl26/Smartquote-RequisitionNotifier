package test.java.com.pernix.smartquote.mysql.connector;

import org.junit.Test;

import java.com.pernix.smartquote.mysql.connector.MySqlConnector;

public class MySqlConnectorTest {

    private MySqlConnector mySqlConnector;

    @Test
    public void testConnectToDb(){
        mySqlConnector = new MySqlConnector();
    }

}
