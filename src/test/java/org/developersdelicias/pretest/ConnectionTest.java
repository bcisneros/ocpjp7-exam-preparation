package org.developersdelicias.pretest;


import org.junit.Ignore;
import org.junit.Test;

import java.sql.*;

import static java.sql.ResultSet.CONCUR_UPDATABLE;
import static java.sql.ResultSet.TYPE_SCROLL_SENSITIVE;
import static org.mockito.Mockito.mock;

public class ConnectionTest {

    Connection connection = mock(Connection.class);
    Statement statement;
    ResultSet resultSet;
    @Test
    @Ignore("Pending to implement with DBUnit")
    public void test_connection_creation_and_result_sets() throws Exception {
        connection.setAutoCommit(true);

        statement = connection.createStatement(TYPE_SCROLL_SENSITIVE, CONCUR_UPDATABLE);

        resultSet = statement.executeQuery("SELECT * FROM TempSensor");

        // Assume that the initial value of temp is "0" in the table

        Savepoint firstSavepoint = updateAndCreateSavePoint("100");
        Savepoint secondSavepoint = updateAndCreateSavePoint("200");
        Savepoint thirdSavepoint = updateAndCreateSavePoint("300");

        connection.rollback(secondSavepoint);

        connection.commit();


    }

    private Savepoint updateAndCreateSavePoint(String actualTempValue) throws SQLException {
        resultSet.moveToInsertRow();
        resultSet.updateString("temp", actualTempValue);
        resultSet.insertRow();
        return connection.setSavepoint();
    }


}
