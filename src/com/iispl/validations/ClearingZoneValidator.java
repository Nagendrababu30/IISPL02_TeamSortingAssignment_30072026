package com.iispl.validations;

import com.iispl.model.Cheque;

public class ClearingZoneValidator implements ChequeValidator {

	@Override
	public boolean validate(Cheque cheque){
		
		if(cheque.getClearingZone().equals("NORTH") || cheque.getClearingZone().equals("SOUTH") || cheque.getClearingZone().equals("CENTRAL")) {
			return true;
		}
		
		return false;
	}

}
