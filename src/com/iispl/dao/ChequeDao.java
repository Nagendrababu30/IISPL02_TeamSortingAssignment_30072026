package com.iispl.dao;

import java.util.List;

import com.iispl.enums.ChequeStatus;
import com.iispl.model.Cheque;

public interface ChequeDao {

	public List<Cheque> getAllCheques();

	public void updateStatusAndRemarks(String chequeNumber, ChequeStatus status, String statusRemarks);
	

	
}
