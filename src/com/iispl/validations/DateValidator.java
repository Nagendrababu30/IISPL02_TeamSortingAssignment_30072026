package com.iispl.validations;

import com.iispl.model.Cheque;

public class DateValidator implements ChequeValidator{

	@Override
	public boolean validate(Cheque cheque) {
		if(cheque.getPresentedDate().isBefore(cheque.getChequeDate())) {
			return false;
		}
		if (cheque.getPresentedDate().isAfter(cheque.getChequeDate().plusMonths(3))) {
		    return false;
		}
		return true;
		
	}

}
