package com.myapp.cloud.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="Payment")
public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long trxnid;
	private double amount;
	
	@Temporal(TemporalType.DATE)
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
