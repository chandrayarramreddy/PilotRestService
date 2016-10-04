package com.miracle.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.miracle.bean.TurnipBean;
import com.miracle.util.Constants;
import com.sun.istack.logging.Logger;

public class TurnipDAOService {

	static Logger log = Logger.getLogger(TurnipDAOService.class);
	private ResultSet rs = null;
	private Connection connection = null;
	private java.sql.PreparedStatement preparedStatement;
	List<TurnipBean> resultList = null;
	List<TurnipBean> orgList = null;
	TurnipBean bean = null;

	public List<TurnipBean> getVendorCustomersList(TurnipBean bean) {
		System.out.println("getVendorCustomersList :::");

		// DBConnection conn= new DBConnection();
		connection = DBConnection.getDbConnection();
		resultList = new ArrayList<TurnipBean>();
		try {
			preparedStatement = connection.prepareStatement(Constants.CUSTOMER_LIST);
			preparedStatement.setInt(1, bean.getVendorId());
			rs = preparedStatement.executeQuery();
			resultList = customerResultSet(rs);
			
			System.out.println("customerList : : " + resultList.size());

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DBConnection.close(connection, preparedStatement, rs);
		}

		//return resultList;

	
		return resultList;
	}

	private List<TurnipBean> customerResultSet(ResultSet resultSet) throws Exception {
		resultList = new ArrayList<TurnipBean>();
		while (resultSet.next()) {			
			bean = new TurnipBean();		
			bean.setCustomerId(resultSet.getInt(Constants.CUSTOMER_ID));
			bean.setCustomerName(resultSet.getString(Constants.CUSTOMER_NAME));			
			resultList.add(bean);
		}
		return resultList;
	}
	

}
