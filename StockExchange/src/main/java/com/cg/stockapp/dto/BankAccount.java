package com.cg.stockapp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BankAccount {

	@Id
	@GeneratedValue
	private long accountNo;
	private String branchName;
	private String bankName;
	private String ifscCode;
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", branchName=" + branchName + ", bankName=" + bankName
				+ ", ifscCode=" + ifscCode + "]";
	}
	
	
}
