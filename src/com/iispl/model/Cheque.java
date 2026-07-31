package com.iispl.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.iispl.enums.ChequePriority;
import com.iispl.enums.ChequeStatus;

public class Cheque implements Comparable<Cheque>{

	private String chequeNumber;
	private String accountNumber;
	private String drawerName;
	private String presentingBank;
	private BigDecimal chequeAmount;
	private LocalDate chequeDate;
	private LocalDate presentedDate;
	private ChequePriority chequePriority;
	private ChequeStatus chequeStatus;
	private String statusRemarks;

	@Override
	public String toString() {
		return chequeNumber + "    " + accountNumber + "    " + drawerName + "    " + presentingBank + "    "
				+ chequeAmount + "    " + chequeDate + "    " + presentedDate + "    " + chequePriority + "    "
				+ chequeStatus + "    " + statusRemarks;
	}
	public Cheque(String chequeNumber, String accountNumber, String drawerName, String presentingBank,
			BigDecimal chequeAmount, LocalDate chequeDate, LocalDate presentedDate, ChequePriority chequePriority,
			ChequeStatus chequeStatus, String statusRemarks) {
		this.chequeNumber = chequeNumber;
		this.accountNumber = accountNumber;
		this.drawerName = drawerName;
		this.presentingBank = presentingBank;
		this.chequeAmount = chequeAmount;
		this.chequeDate = chequeDate;
		this.presentedDate = presentedDate;
		this.chequePriority = chequePriority;
		this.chequeStatus = chequeStatus;
		this.statusRemarks = statusRemarks;
	}

	public String getChequeNumber() {
		return chequeNumber;
	}

	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getDrawerName() {
		return drawerName;
	}

	public void setDrawerName(String drawerName) {
		this.drawerName = drawerName;
	}

	public String getPresentingBank() {
		return presentingBank;
	}

	public void setPresentingBank(String presentingBank) {
		this.presentingBank = presentingBank;
	}

	public BigDecimal getChequeAmount() {
		return chequeAmount;
	}

	public void setChequeAmount(BigDecimal chequeAmount) {
		this.chequeAmount = chequeAmount;
	}

	public LocalDate getChequeDate() {
		return chequeDate;
	}

	public void setChequeDate(LocalDate chequeDate) {
		this.chequeDate = chequeDate;
	}

	public LocalDate getPresentedDate() {
		return presentedDate;
	}

	public void setPresentedDate(LocalDate presentedDate) {
		this.presentedDate = presentedDate;
	}

	public ChequePriority getChequePriority() {
		return chequePriority;
	}

	public void setChequePriority(ChequePriority chequePriority) {
		this.chequePriority = chequePriority;
	}

	public ChequeStatus getChequeStatus() {
		return chequeStatus;
	}

	public void setChequeStatus(ChequeStatus chequeStatus) {
		this.chequeStatus = chequeStatus;
	}

	public String getStatusRemarks() {
		return statusRemarks;
	}

	public void setStatusRemarks(String statusRemarks) {
		this.statusRemarks = statusRemarks;
	}
  
	@Override
	public int compareTo(Cheque o) {
		 
		return this.chequeNumber.compareTo(o.chequeNumber);
	}

}
