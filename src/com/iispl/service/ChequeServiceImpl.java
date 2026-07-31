package com.iispl.service;

import java.util.List;

import com.iispl.enums.ChequeStatus;
import com.iispl.model.Cheque;

public class ChequeServiceImpl implements ChequeService {

	@Override
	public List<Cheque> getAllCheques() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isStatusUpdated(String chequeNumber, ChequeStatus status, String statusRemarks) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isChequeExists(Cheque cheque) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Cheque> sortByChequeNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cheque> sortByAmountAscending() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cheque> sortByAmountDescending() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cheque> sortByChequeDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cheque> sortByPresentedDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cheque> sortByBankAndAmount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cheque> sortByPriorityAndStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cheque> getHighValueCheque() {
		// TODO Auto-generated method stub
		return null;
	}

}
