package com.iispl.validations;

import com.iispl.model.Cheque;

public class ChequeNumberValidator implements ChequeValidator{

	@Override
	public boolean validate(Cheque cheque) {
		if(!cheque.getChequeNumber().startsWith("CHQ"))
		  return false;
		return true;
		
	}

}
