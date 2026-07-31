package com.iispl.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.iispl.dao.ChequeDao;
import com.iispl.dao.ChequeDaoOImpl;
import com.iispl.enums.ChequeStatus;
import com.iispl.model.Cheque;
import com.iispl.validations.AccountValidator;
import com.iispl.validations.ChequeAmountValidator;
import com.iispl.validations.ChequeNumberValidator;
import com.iispl.validations.ChequeValidator;
import com.iispl.validations.DateValidator;
import com.iispl.validations.PriorityAndStatusValidator;

public class ChequeServiceImpl implements ChequeService {

	ChequeDao chequeDao = new ChequeDaoOImpl();
	List<ChequeValidator> validationRules = null;
	
	
	public ChequeServiceImpl() {
		
		validationRules = new ArrayList<ChequeValidator>();
		validationRules.add(new AccountValidator());
		validationRules.add(new ChequeAmountValidator());
		validationRules.add(new ChequeNumberValidator());
		validationRules.add(new DateValidator());
		validationRules.add(new PriorityAndStatusValidator());
		
	}
	
	public void validateCheques(List<Cheque> chequeList) {
		
		chequeList.forEach(cheque -> {
			
			validationRules.forEach(rule -> {
				if(!rule.validate(cheque)) {
					
				}  
			});
			
		});
		
	}
	
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
