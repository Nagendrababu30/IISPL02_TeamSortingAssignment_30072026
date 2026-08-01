package com.iispl.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.iispl.connectionpool.ConnectionPool;
import com.iispl.enums.ChequePriority;
import com.iispl.enums.ChequeStatus;
import com.iispl.model.Cheque;

public class ChequeDaoImpl implements ChequeDao {

    @Override
    public List<Cheque> getAllCheques() {

        List<Cheque> chequeList = new ArrayList<>();

        String sql = "SELECT * FROM cheque";

        try (
                Connection connection = ConnectionPool.getDataSource().getConnection();
                PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()
        ) {

            while (rs.next()) {

            	while (rs.next()) {

            	    chequeList.add(
            	        new Cheque(
            	            rs.getString("cheque_number"),
            	            rs.getString("account_number"),
            	            rs.getString("drawer_name"),
            	            rs.getString("presenting_bank"),
            	            rs.getBigDecimal("cheque_amount"),
            	            rs.getDate("cheque_date").toLocalDate(),
            	            rs.getDate("presented_date").toLocalDate(),
            	            ChequePriority.valueOf(rs.getString("cheque_priority")),
            	            ChequeStatus.valueOf(rs.getString("cheque_status")),
            	            rs.getString("status_remarks")
            	        )
            	    );
            	}
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return chequeList;
    }

    @Override
    public void updateStatusAndRemarks(String chequeNumber,
                                       ChequeStatus status,
                                       String statusRemarks) {

        String sql = """
                UPDATE cheque
                SET cheque_status = CAST(? AS cheque_status),
                    status_remarks = ?
                WHERE cheque_number = ?
                """;

        try (
                Connection connection = ConnectionPool.getDataSource().getConnection();
                PreparedStatement ps = connection.prepareStatement(sql)
        ) {

            ps.setString(1, status.name());
            ps.setString(2, statusRemarks);
            ps.setString(3, chequeNumber);

            int rows = ps.executeUpdate();

            if (rows == 0) {
                System.out.println("No cheque found with number : " + chequeNumber);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}