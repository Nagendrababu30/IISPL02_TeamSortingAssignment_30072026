package com.iispl.main;

import java.util.Collections;
import java.util.List;

import com.iispl.enums.ChequeStatus;
import com.iispl.model.Cheque;
import com.iispl.service.ChequeService;
import com.iispl.service.ChequeServiceImpl;

public class ChequeSortingApplication {

	static ChequeService chequeService = new ChequeServiceImpl();
	
	public static void main(String[] args) {
		
		//dont code here
		
	}
	
	public static void getAllCheques() {
		
	}

	public static void isStatusUpdated(String chequeNumber, ChequeStatus status, String statusRemarks) {
		
	}

	public static void isChequeExists(Cheque cheque) {
		
	}

	public static void sortByChequeNumber() {
		List<Cheque> sortedChequeList=chequeService.sortByChequeNumber();
		 
		System.out.println("Cheque No\tAccount No\tDrawer Name\tPresenting Bank\t"
				+ "Amount\tCheque Date\tPresented Date\tPriority\tStatus\tRemarks");
		sortedChequeList.forEach(System.out:: println);
		
	}

	public static void sortByAmountAscending() {
		
	}

	public static void sortByAmountDescending() {
		
	}

	public static void sortByChequeDate() {
		
	}

	public static void sortByPresentedDate() {
		
	}

	public static void sortByBankAndAmount() {
		
	}

	
	public static void sortByPriorityAndStatus() {
		
	}

	public static void getHighValueCheque() {
		
	}
	
}
