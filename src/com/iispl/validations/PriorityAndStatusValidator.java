package com.iispl.validations;

import com.iispl.model.Cheque;

public class PriorityAndStatusValidator implements ChequeValidator{

	@Override
	public boolean validate(Cheque cheque) {
		if(cheque.getPresentedDate().isBefore(cheque.getChequeDate())) {
			return false;
		}
		return true;
		
	}

}
