package com.iispl.service;

import java.util.List;

import com.iispl.enums.ChequeStatus;
import com.iispl.model.Cheque;

public interface ChequeService {

	public List<Cheque> getAllCheques();

	public boolean isStatusUpdated(String chequeNumber, ChequeStatus status, String statusRemarks);
	
	public boolean isChequeExists(Cheque cheque);
	
	public List<Cheque> sortByChequeNumber();
	
	public List<Cheque> sortByAmountAscending();
	
	public List<Cheque> sortByAmountDescending();
	
	public List<Cheque> sortByChequeDate();
	
	public List<Cheque> sortByPresentedDate();
	
	public List<Cheque> sortByBankAndAmount();
	
	public List<Cheque> sortByPriorityAndStatus();
	
	public List<Cheque> getHighValueCheque();
	
}
