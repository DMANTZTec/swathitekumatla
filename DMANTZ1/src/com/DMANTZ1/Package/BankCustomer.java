package com.DMANTZ1.Package;

public class BankCustomer {
	private int customerId;
	private String customerName;
	private int bankAccountNumber;
	private float totalAmount;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "BankCustomer [customerId=" + customerId + ", customerName=" + customerName + ", bankAccountNumber="
				+ bankAccountNumber + ", totalAmount=" + totalAmount + "]";
	}
	
	

}
