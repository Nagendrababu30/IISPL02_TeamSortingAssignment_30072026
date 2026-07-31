package com.iispl.validations;

import com.iispl.enums.ChequePriority;
import com.iispl.model.Cheque;

public class PriorityValidator implements ChequeValidator {

	@Override
	public boolean validate(Cheque cheque) {

		if (cheque.getChequePriority() != ChequePriority.HIGH || cheque.getChequePriority() != ChequePriority.NORMAL
				|| cheque.getChequePriority() != ChequePriority.LOW) {

			return false;

		}

		return true;

	}
}
