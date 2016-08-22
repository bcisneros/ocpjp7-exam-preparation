package org.developersdelicias.pretest;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.SQLException;

public class JdbcRowSetExample {

    public static void main(String[] args) throws SQLException {
        //RowSetProvider rowSetProvider = RowSetFactory.newProvider();
        //JdbcRowSet rowSet = rowSetProvider.createJdbcRowSet();

        RowSetFactory rowSetFactory = RowSetProvider.newFactory();
        JdbcRowSet rowSet = rowSetFactory.createJdbcRowSet();

        //JdbcRowSet rowset2 = RowSetProvider.newFactory().getJdbcRowSetInstance();

        //JdbcRowSet rowset2 = RowSetFactory.newProvider().getInstance(new Connection(), "JdbcRowSet");

    }
}
