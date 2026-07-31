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
		List<Cheque> chequeList = chequeService.sortByPresentedDate();
		System.out.println("ChequeNumber" + "\t" + "AccountNumber" + "\t" + "DrawerName"+ "\t"+"PresentingBank" + "\t"+ "ChequeAmount" + "\t"+"ChequeDate" + "\t"+ "PresentedDate" + "\t"+ "ChequePriority" + "\t"+"ChequeStatus"+ "\t"+ "StatusRemarks");
		chequeList.forEach(System.out::println);
	}

	public static void sortByBankAndAmount() {
		
	}

	
	public static void sortByPriorityAndStatus() {
		
	}

	public static void getHighValueCheque() {
		
	}
	
}
