package com.DMANTZ1.Package2;

import com.DMANTZ1.Package.BankCustomer;

public class BankOperations {

	public float addAmount(BankCustomer customer, int amount) {
		customer.setTotalAmount(customer.getTotalAmount() + amount);
		System.out.println("money credited:" + customer.getTotalAmount());
		System.out.println(customer.toString());
		return customer.getTotalAmount();
	}

	public float debitAmount(BankCustomer customer, int amount) {
		if (customer.getTotalAmount() > amount) {
			customer.setTotalAmount(customer.getTotalAmount() - amount);
			System.out.println("money debited:" + customer.getTotalAmount());
			System.out.println(customer.toString());
			return customer.getTotalAmount();

		} else {
			System.out.println(
					"no bro you have " + customer.getTotalAmount() + "nut you want" + amount + "go eat and sleep");
			return customer.getTotalAmount();
		}

	}

	public float transferAmount(BankCustomer customer1, BankCustomer customer2, int amount) {
		if (customer1.getTotalAmount() < amount) {
			System.out.println("insuffient balance check your balance and try again!");
			return amount;
		} else {
			customer1.setTotalAmount(customer1.getTotalAmount() - amount);
			System.out.println("money transfered from accountno:" + customer1.getBankAccountNumber() + "to"
					+ customer2.getBankAccountNumber() + " Amount:" + amount + "  Available bal is"
					+ customer1.getTotalAmount());
			System.out.println(customer1.toString());
			return customer1.getTotalAmount();
		}
	}
}
