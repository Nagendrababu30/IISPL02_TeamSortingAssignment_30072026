package com.iispl.validations;

import com.iispl.model.Cheque;

public class AccountNumberValidator implements ChequeValidator{

	@Override
	public boolean validate(Cheque cheque) {
		if(cheque.getAccountNumber()==null || cheque.getAccountNumber().length()<5) {
			return false;
		}
		return true;
	}

}
