package com.iispl.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.iispl.dao.ChequeDao;
import com.iispl.dao.ChequeDaoOImpl;
import com.iispl.enums.ChequeStatus;
import com.iispl.exceptions.InvalidAmountException;
import com.iispl.model.Cheque;
import com.iispl.validations.AccountNumberValidator;
import com.iispl.validations.ChequeAmountValidator;
import com.iispl.validations.ChequeNumberValidator;
import com.iispl.validations.ChequeValidator;
import com.iispl.validations.DateValidator;
import com.iispl.validations.DrawerNameValidator;
import com.iispl.validations.PresentingBankValidator;
import com.iispl.validations.PriorityValidator;

public class ChequeServiceImpl implements ChequeService {

	ChequeDao chequeDao = new ChequeDaoOImpl();
	List<ChequeValidator> validationRules = null;

	public ChequeServiceImpl() {

		validationRules = new ArrayList<ChequeValidator>();
		validationRules.add(new AccountNumberValidator());
		validationRules.add(new ChequeAmountValidator());
		validationRules.add(new ChequeNumberValidator());
		validationRules.add(new DateValidator());
		validationRules.add(new PriorityValidator());
		validationRules.add(new DrawerNameValidator());
		validationRules.add(new PresentingBankValidator());

		

	}

	public void validateCheques(List<Cheque> chequeList) {

		chequeList.forEach(cheque -> {

			validationRules.forEach(rule -> {
        
				try {
					if(!rule.validate(cheque)) {
						if(rule instanceof AccountNumberValidator) {
							chequeDao.updateStatusAndRemarks(cheque.getChequeNumber(), ChequeStatus.REJECTED, "Account Number Cannot Be Blank");
							
						}else if(rule instanceof ChequeAmountValidator) {
							chequeDao.updateStatusAndRemarks(cheque.getChequeNumber(), ChequeStatus.REJECTED, "Invalid Cheque Amount");

						}else if(rule instanceof ChequeNumberValidator) {
							chequeDao.updateStatusAndRemarks(cheque.getChequeNumber(), ChequeStatus.REJECTED, "Invalid Cheque Number");

						}else if(rule instanceof DateValidator) {
							chequeDao.updateStatusAndRemarks(cheque.getChequeNumber(), ChequeStatus.REJECTED,  "Presented Date Cannot Be Before Cheque Date");

						}else if(rule instanceof PriorityValidator) {
							chequeDao.updateStatusAndRemarks(cheque.getChequeNumber(), ChequeStatus.REJECTED, "Invalid Cheque Priority");

						}else if(rule instanceof DrawerNameValidator) {
							chequeDao.updateStatusAndRemarks(cheque.getChequeNumber(), ChequeStatus.REJECTED, "Drawer Name Cannot Be Empty");

						}else if(rule instanceof PresentingBankValidator) {
							chequeDao.updateStatusAndRemarks(cheque.getChequeNumber(), ChequeStatus.REJECTED, "Presenting Bank Name Cannot Be Empty");

						}
						
					}
				} catch (InvalidAmountException e) {
					 
					 System.out.println(e.getMessage());
				}  
			});

		});

	}

	@Override
	public List<Cheque> getAllCheques() {

		return chequeDao.getAllCheques();
	}

	@Override
	public boolean isChequeExists(Cheque cheque) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Cheque> sortByChequeNumber() {
		// TODO Auto-generated method stub
		List<Cheque> chequeList =chequeDao.getAllCheques();
		Collections.sort(chequeList);
		return  chequeList;
	}

	@Override
	public List<Cheque> sortByAmountAscending() {
		List<Cheque> chequeList =chequeDao.getAllCheques();
		Collections.sort(chequeList,(o1,o2) -> o1.getChequeAmount().compareTo(o2.getChequeAmount()));
		return chequeList;

	}

	@Override
	public List<Cheque> sortByAmountDescending() {
		List<Cheque> chequeList = chequeDao.getAllCheques();
		Collections.sort(chequeList,(c1,c2)-> c2.getChequeAmount().compareTo(c1.getChequeAmount()));
		
		return chequeList;
	}

	@Override
	public List<Cheque> sortByChequeDate() {
		List<Cheque> chequeList = chequeDao.getAllCheques();
		Collections.sort(chequeList,(c1,c2)-> c1.getChequeDate().compareTo(c2.getChequeDate()));
		return chequeList;
	}

	@Override
	public List<Cheque> sortByPresentedDate() {
		List<Cheque> chequeList = chequeDao.getAllCheques();
		Collections.sort(chequeList,(c1,c2)-> c1.getPresentedDate().compareTo(c2.getPresentedDate()));
		return chequeList;
	}

	@Override
	public List<Cheque> sortByBankAndAmount() {

		List<Cheque> chequeList = chequeDao.getAllCheques();

		chequeList.sort(Comparator.comparing(Cheque::getPresentingBank).thenComparing(Cheque::getChequeAmount, Comparator.reverseOrder()));

		return chequeList;
	}

	@Override
	public List<Cheque> sortByPriorityAndStatus() {
		List<Cheque> chequeList = chequeDao.getAllCheques();
		chequeList.sort(Comparator.comparing(Cheque::getChequePriority).thenComparing(Cheque::getChequeStatus));
		return chequeList;

	}

	@Override
	public List<Cheque> getHighValueCheque() {
		// TODO Auto-generated method stub
		List<Cheque>chequeList = chequeDao.getAllCheques();
	    List<Cheque> highValueChequeList = new ArrayList<>();
	       chequeList.forEach(cheque ->{
	    	   if (cheque.getChequeAmount().compareTo(new BigDecimal("200000")) > 0) {
		            highValueChequeList.add(cheque);
		        }  
	       }); 
	    return highValueChequeList;
	}

}
