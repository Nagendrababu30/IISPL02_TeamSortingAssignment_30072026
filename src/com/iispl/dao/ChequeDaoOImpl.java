package com.iispl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.iispl.connectionpool.ConnectionPool;
import com.iispl.enums.ChequePriority;
import com.iispl.enums.ChequeStatus;
import com.iispl.model.Cheque;

public class ChequeDaoOImpl implements ChequeDao {

	@Override
	public List<Cheque> getAllCheques() {
		
		List<Cheque> chequeList = new ArrayList<Cheque>();
		
		try {
			DataSource dataSource = ConnectionPool.getDataSource();
			Connection connection = dataSource.getConnection();
			String selectSQL = "SELECT * FROM cheque";
			PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				
				chequeList.add(new Cheque(resultSet.getString(1), resultSet.getString(2),
						resultSet.getString(3), resultSet.getString(4), resultSet.getBigDecimal(5), 
						resultSet.getDate(6).toLocalDate(), resultSet.getDate(7).toLocalDate(),
						ChequePriority.valueOf(resultSet.getString(8)), ChequeStatus.valueOf(resultSet.getString(9)), 
						resultSet.getString(10)));
				
			}
			
			
		} catch(Exception ex) {

			ex.printStackTrace();
			
		}
		
		return chequeList;
	}

	@Override
	public boolean isChequeExists(Cheque cheque) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateStatusAndRemarks(String chequeNumber, ChequeStatus status, String statusRemarks) {
		
		try {
			DataSource dataSource = ConnectionPool.getDataSource();
			Connection connection = dataSource.getConnection();
			String selectSQL = "UPDATE cheque SET cheque_status = ? , cheque_priority = ? WHERE cheque_number = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
			
			preparedStatement.setString(1, status.name());
			preparedStatement.setString(2, statusRemarks);
			preparedStatement.setString(3, chequeNumber);
			
			int noOfRowsAffected = preparedStatement.executeUpdate();
			
		} catch(Exception ex) {

			ex.printStackTrace();
			
		}
		
	}

}
