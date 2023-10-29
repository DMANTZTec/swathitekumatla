package com.DMANTZ1.Package;

import java.util.List;

import com.DMANTZ1.Package2.BankOperations;

public class Bank {

	public static void main(String[] args) 
	{
		BankCustomer swathi=new BankCustomer();
        swathi.setBankAccountNumber(1234);
        swathi.setCustomerId(1);
        swathi.setCustomerName("swathi");
        swathi.setTotalAmount(2000);
        
        BankCustomer vamshi=new BankCustomer();
        vamshi.setBankAccountNumber(12345);
        vamshi.setCustomerId(2);
        vamshi.setCustomerName("vamshi");
        vamshi.setTotalAmount(20000);
        
        BankOperations test=new BankOperations() ;
        test.addAmount(swathi, 1000);
       test.debitAmount(vamshi, 23000);
        test.transferAmount(swathi, vamshi, 200);
        
	}

}
