package com.myapp.cloud.model;

import java.util.Date;



public class Payment {

	private long trxnid;
	private double amount;
	

	private Date trxndate;

	public long getTrxnid() {
		return trxnid;
	}

	public void setTrxnid(long trxnid) {
		this.trxnid = trxnid;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getTrxndate() {
		return trxndate;
	}

	public void setTrxndate(Date trxndate) {
		this.trxndate = trxndate;
	}
	
	

}
