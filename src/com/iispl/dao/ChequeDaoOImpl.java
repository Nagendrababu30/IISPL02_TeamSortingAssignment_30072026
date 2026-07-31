package com.iispl.dao;

import java.util.List;

import com.iispl.enums.ChequeStatus;
import com.iispl.model.Cheque;

public class ChequeDaoOImpl implements ChequeDao {

	@Override
	public List<Cheque> getAllCheques() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isChequeExists(Cheque cheque) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateStatusAndRemarks(String chequeNumber, ChequeStatus status, String statusRemarks) {
		// TODO Auto-generated method stub
		
	}

}
