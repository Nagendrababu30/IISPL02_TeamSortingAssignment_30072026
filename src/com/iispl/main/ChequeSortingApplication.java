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

		// dont code here

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
    
		List<Cheque> chequeList=chequeService.sortByChequeNumber();
		Collections.sort(chequeList);
		System.out.println("Cheque No\tAccount No\tDrawer Name\tPresenting Bank\t"
				+ "Amount\tCheque Date\tPresented Date\tPriority\tStatus\tRemarks");
		chequeList.forEach(System.out:: println);
    
		
	}

	public static void sortByAmountAscending() {
    
	List<Cheque> chequeList=	chequeService.sortByAmountAscending();
	System.out.println("Cheque No\tAccount No\tDrawer Name\tPresenting Bank\tAmount"
			+ "\tCheque Date\tPresented Date\tPriority\tStatus\tRemarks");	
	chequeList.forEach(System.out::println);
    
	}

	public static void sortByAmountDescending() {
    
		List<Cheque> chequeList = chequeService.sortByAmountDescending();
		System.out.println("ChequeNumber" + "\t" +
				"AccountNumber" + "\t" +
				"DrawerName" + "\t" +
				"PresentingBank" + "\t" +
				"ChequeAmount" + "\t" +
				"ChequeDate" + "\t" +
				"PresentedDate" + "\t" +
				"ChequePriority" + "\t" +
				"ChequeStatus" + "\t" +
				"StatusRemarks");
		chequeList.forEach(System.out :: println);
		
	}

	public static void sortByChequeDate() {
		List<Cheque> chequeList = chequeService.sortByChequeDate();
		System.out.println("ChequeNumber" + "\t" + "AccountNumber" + "\t" + "DrawerName" + "\t" + "PresentingBank"
				+ "\t" + "ChequeAmount" + "\t" + "ChequeDate" + "\t" + "PresentedDate" + "\t" + "ChequePriority" + "\t"
				+ "ChequeStatus" + "\t" + "StatusRemarks");
		chequeList.forEach(System.out::println);

	}

	public static void sortByPresentedDate() {
		List<Cheque> chequeList = chequeService.sortByPresentedDate();
		System.out.println("ChequeNumber" + "\t" + "AccountNumber" + "\t" + "DrawerName"+ "\t"+"PresentingBank" + "\t"+ "ChequeAmount" + "\t"+"ChequeDate" + "\t"+ "PresentedDate" + "\t"+ "ChequePriority" + "\t"+"ChequeStatus"+ "\t"+ "StatusRemarks");
		chequeList.forEach(System.out::println);
	}

	public static void sortByBankAndAmount() {
		List<Cheque> chequeList =chequeService.sortByBankAndAmount();
		for(Cheque cheque : chequeList) {
			System.out.println(cheque);
		}
		


	}

	public static void sortByPriorityAndStatus() {
		
		List<Cheque> chequeList =chequeService.sortByPriorityAndStatus();
		for(Cheque cheque : chequeList) {
			System.out.println(cheque);
		}

	}

	public static void getHighValueCheque() {
    
		List<Cheque>chequeList = chequeService.getHighValueCheque();
		System.out.println("ChequeNumber"+ "\t"+"AccountNumber"+ "\t"+ "DrawerName"+ "\t"+ "PresentingBank" + "\t"+ "ChequeAmount"+ "\t"+ "ChequeDate" + "\t"+"PresentedDate" + "\t"+ "ChequePriority"+ "\t"+ "ChequeStatus"+ "\t"+ "StatusRemarks");
		chequeList.forEach(System.out::println);

	}

}
