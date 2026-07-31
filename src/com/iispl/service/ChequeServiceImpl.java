package com.iispl.service;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

import com.iispl.dao.ChequeDao;
import com.iispl.dao.ChequeDaoOImpl;
import com.iispl.model.Cheque;
import com.iispl.validations.AccountValidator;
import com.iispl.validations.ChequeAmountValidator;
import com.iispl.validations.ChequeNumberValidator;
import com.iispl.validations.ChequeValidator;
import com.iispl.validations.DateValidator;
import com.iispl.validations.PriorityValidator;

public class ChequeServiceImpl implements ChequeService {

	ChequeDao chequeDao = new ChequeDaoOImpl();
	List<ChequeValidator> validationRules = null;

	public ChequeServiceImpl() {

		validationRules = new ArrayList<ChequeValidator>();
		validationRules.add(new AccountValidator());
		validationRules.add(new ChequeAmountValidator());
		validationRules.add(new ChequeNumberValidator());
		validationRules.add(new DateValidator());
		validationRules.add(new PriorityValidator());

	}

	public void validateCheques(List<Cheque> chequeList) {

		chequeList.forEach(cheque -> {

			validationRules.forEach(rule -> {
				if (!rule.validate(cheque)) {

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
		return chequeDao.getAllCheques();
	}

	@Override
	public List<Cheque> sortByAmountAscending() {
		return chequeDao.getAllCheques();
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
		// TODO Auto-generated method stub
		return null;
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
