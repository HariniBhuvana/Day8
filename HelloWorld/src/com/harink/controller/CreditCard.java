package com.harink.controller;

import java.sql.Date;

public class CreditCard {
	private long cardNumber;
	private String holderName;
	private String bankName;
	private Date expiryDate;
	public CreditCard(long cardNumber, String holderName, String bankName, Date expiryDate) {
		super();
		this.cardNumber = cardNumber;
		this.holderName = holderName;
		this.bankName = bankName;
		this.expiryDate = expiryDate;
	}
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
}
