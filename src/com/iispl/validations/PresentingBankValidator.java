package com.iispl.validations;

import com.iispl.model.Cheque;

public class PresentingBankValidator implements ChequeValidator {

	@Override
	public boolean validate(Cheque cheque) {
		if(cheque.getPresentingBank() == null || cheque.getPresentingBank() == "") {
			return false;
		}
		
		return true;
	}

}
