package com.iispl.main;

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
		
		List<Cheque> chequeList = chequeService.getAllCheques();
		
		System.out.println("Cheque Number\tAccount Number\tDrawer Name\tPresenting Bank\tCheque Amount"
				+ "\tCheque Date\tPresented Date\tCheque Priority\tCheque Status\tStatus Remarks");
		
		chequeList.forEach(System.out::println);
		
	}

	public static void isStatusUpdated(String chequeNumber, ChequeStatus status, String statusRemarks) {
		
	}

	public static void isChequeExists(Cheque cheque) {
		
	}

	public static void sortByChequeNumber() {
		
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
