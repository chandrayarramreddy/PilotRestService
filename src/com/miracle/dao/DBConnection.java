package com.miracle.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.miracle.util.Constants;
import com.sun.istack.logging.Logger;

public class DBConnection {
	static Logger log = Logger.getLogger(DBConnection.class);
	public static Connection getDbConnection() {
		Connection connection = null;
		
		System.out.println("-------- MySQL JDBC Connection  ------------");
		try {
			Class.forName(Constants.JDBC_DRIVER);
			connection = DriverManager.getConnection(Constants.JDBC_URL, Constants.USER_NAME, Constants.PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			System.out.println("Connection error");
			e.printStackTrace();

		}

		return connection;

	}
	public static void close(Connection connection, java.sql.PreparedStatement stmt, ResultSet resultSet){
        try {
            if(resultSet!=null) resultSet.close();
            if(stmt!=null) stmt.close();
            if(connection!=null) connection.close();
        } catch(Exception e){}
    }

}
