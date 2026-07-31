package com.iispl.validations;

import java.math.BigDecimal;

import com.iispl.exceptions.InvalidAmountException;
import com.iispl.model.Cheque;

public class ChequeAmountValidator implements ChequeValidator{

	@Override
	public boolean validate(Cheque cheque) throws InvalidAmountException {
		if(cheque.getChequeAmount().compareTo(BigDecimal.ZERO) < 0 || cheque.getChequeAmount().compareTo(BigDecimal.ZERO) == 0  ) {
			 throw new InvalidAmountException();
		}
		return true;
	 
		
	}

}
