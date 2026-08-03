package com.iispl.main;

import java.util.List;
import java.util.Scanner;

import com.iispl.exceptions.DuplicateChequeException;
import com.iispl.model.Cheque;
import com.iispl.service.ChequeService;
import com.iispl.service.ChequeServiceImpl;

public class ChequeSortingApplication {

	static ChequeService chequeService = new ChequeServiceImpl();

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Welcome to the Cheque Clearing System");
		
		ChequeServiceImpl chequeServiceImpl=(ChequeServiceImpl)chequeService;
		try {
			chequeServiceImpl.validateCheques(chequeService.getAllCheques());
		} catch (DuplicateChequeException e) {
			System.out.println("Duplicate Cheque Found");
		}
			
		

		
		
		do {
			System.out.println("1. Display all Cheques\r\n"
					+ "2. Sort by Cheque Number\r\n"
					+ "3. Sort by Cheque Amount (Ascending)\r\n"
					+ "4. Sort by Cheque Amount (Descending)\r\n"
					+ "5. Sort by Cheque Date\r\n"
					+ "6. Sort by Presenting Bank and Amount\r\n"
					+ "7. Sort by Priority and Status\r\n"
					+ "8. Display High Value Cheques\r\n"
					+ "9. Sort by Presented date\r\n"
					+ "10. Sort by clearing zone and amount\r\n"
					+ "11. Exit");
			
			System.out.print("Enter your choice ");
			int choice=scanner.nextInt();
			
			switch(choice) {
				case 1->{
					getAllCheques();
				}
				case 2->{
					sortByChequeNumber();
				}case 3->{
					sortByAmountAscending();
				}case 4->{
					sortByAmountDescending();
				}case 5->{
					sortByChequeDate();
				}case 6->{
					sortByBankAndAmount();
				}case 7->{
					sortByPriorityAndStatus();
				}case 8->{
					getHighValueCheque();
				}case 9->{
					sortByPresentedDate();
				}case 10->{
					sortByClearingZoneAndAmount();
				}case 11->{
					return;
				}default ->{
					System.out.println("Choose the Correct Option");
				}

			}
			
			
		}while(true);
		

	}

	private static void getAllCheques() {
		
		List<Cheque> chequeList = chequeService.getAllCheques();
		
		System.out.printf("%-12s %-15s %-20s %-20s %-12s %-15s %-15s %-10s %-10s %-20s %-15s%n",
		        "Cheque No",
		        "Account No",
		        "Drawer Name",
		        "Presenting Bank",
		        "Amount",
		        "Cheque Date",
		        "Presented Date",
		        "Priority",
		        "Status",
		        "Remarks",
		        "Clearing Zone");
		
		chequeList.forEach(System.out::println);

	}


	private static void sortByChequeNumber() {
		List<Cheque> sortedChequeList=chequeService.sortByChequeNumber();
		 
		System.out.printf("%-12s %-15s %-20s %-20s %-12s %-15s %-15s %-10s %-10s %-20s %-15s%n",
		        "Cheque No",
		        "Account No",
		        "Drawer Name",
		        "Presenting Bank",
		        "Amount",
		        "Cheque Date",
		        "Presented Date",
		        "Priority",
		        "Status",
		        "Remarks",
		        "Clearing Zone");
		sortedChequeList.forEach(System.out:: println);

		
	}

	private static void sortByAmountAscending() {
    
	List<Cheque> chequeList=	chequeService.sortByAmountAscending();
	System.out.printf("%-12s %-15s %-20s %-20s %-12s %-15s %-15s %-10s %-10s %-20s %-15s%n",
	        "Cheque No",
	        "Account No",
	        "Drawer Name",
	        "Presenting Bank",
	        "Amount",
	        "Cheque Date",
	        "Presented Date",
	        "Priority",
	        "Status",
	        "Remarks",
	        "Clearing Zone");	
	chequeList.forEach(System.out::println);
    
	}

	private static void sortByAmountDescending() {
    
		List<Cheque> chequeList = chequeService.sortByAmountDescending();
		System.out.printf("%-12s %-15s %-20s %-20s %-12s %-15s %-15s %-10s %-10s %-20s %-15s%n",
		        "Cheque No",
		        "Account No",
		        "Drawer Name",
		        "Presenting Bank",
		        "Amount",
		        "Cheque Date",
		        "Presented Date",
		        "Priority",
		        "Status",
		        "Remarks",
		        "Clearing Zone");
		chequeList.forEach(System.out :: println);
		
	}

	private static void sortByChequeDate() {
		List<Cheque> chequeList = chequeService.sortByChequeDate();
		System.out.printf("%-12s %-15s %-20s %-20s %-12s %-15s %-15s %-10s %-10s %-20s %-15s%n",
		        "Cheque No",
		        "Account No",
		        "Drawer Name",
		        "Presenting Bank",
		        "Amount",
		        "Cheque Date",
		        "Presented Date",
		        "Priority",
		        "Status",
		        "Remarks",
		        "Clearing Zone");
		chequeList.forEach(System.out::println);

	}

	private static void sortByPresentedDate() {
		List<Cheque> chequeList = chequeService.sortByPresentedDate();
		System.out.printf("%-12s %-15s %-20s %-20s %-12s %-15s %-15s %-10s %-10s %-20s %-15s%n",
		        "Cheque No",
		        "Account No",
		        "Drawer Name",
		        "Presenting Bank",
		        "Amount",
		        "Cheque Date",
		        "Presented Date",
		        "Priority",
		        "Status",
		        "Remarks",
		        "Clearing Zone");
		chequeList.forEach(System.out::println);
	}

	private static void sortByBankAndAmount() {
		List<Cheque> chequeList =chequeService.sortByBankAndAmount();
		System.out.printf("%-12s %-15s %-20s %-20s %-12s %-15s %-15s %-10s %-10s %-20s %-15s%n",
		        "Cheque No",
		        "Account No",
		        "Drawer Name",
		        "Presenting Bank",
		        "Amount",
		        "Cheque Date",
		        "Presented Date",
		        "Priority",
		        "Status",
		        "Remarks",
		        "Clearing Zone");
		for(Cheque cheque : chequeList) {
			System.out.println(cheque);
		}
		


	}

	private static void sortByPriorityAndStatus() {
		
		List<Cheque> chequeList =chequeService.sortByPriorityAndStatus();
		System.out.printf("%-12s %-15s %-20s %-20s %-12s %-15s %-15s %-10s %-10s %-20s %-15s%n",
		        "Cheque No",
		        "Account No",
		        "Drawer Name",
		        "Presenting Bank",
		        "Amount",
		        "Cheque Date",
		        "Presented Date",
		        "Priority",
		        "Status",
		        "Remarks",
		        "Clearing Zone");
		for(Cheque cheque : chequeList) {
			System.out.println(cheque);
		}

	}

	private static void getHighValueCheque() {
    
		List<Cheque>chequeList = chequeService.getHighValueCheque();
		System.out.printf("%-12s %-15s %-20s %-20s %-12s %-15s %-15s %-10s %-10s %-20s %-15s%n",
		        "Cheque No",
		        "Account No",
		        "Drawer Name",
		        "Presenting Bank",
		        "Amount",
		        "Cheque Date",
		        "Presented Date",
		        "Priority",
		        "Status",
		        "Remarks",
		        "Clearing Zone");
		chequeList.forEach(System.out::println);

	}
	
	private static void sortByClearingZoneAndAmount() {
		 
		List<Cheque> sortedChequesList=chequeService.sortByClearingZoneAndAmount();
		System.out.printf("%-12s %-15s %-20s %-20s %-12s %-15s %-15s %-10s %-10s %-20s %-15s%n",
		        "Cheque No",
		        "Account No",
		        "Drawer Name",
		        "Presenting Bank",
		        "Amount",
		        "Cheque Date",
		        "Presented Date",
		        "Priority",
		        "Status",
		        "Remarks",
		        "Clearing Zone");
		sortedChequesList.forEach(System.out :: println);
	   
	}

}
