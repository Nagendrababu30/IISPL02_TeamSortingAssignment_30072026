package com.iispl.validations;

import com.iispl.model.Cheque;

public class DrawerNameValidator implements ChequeValidator {

	@Override
	public boolean validate(Cheque cheque) {
		if(cheque.getDrawerName() == null || cheque.getDrawerName() == "") {
			return false;
		}
		
		return true;
	}

}
