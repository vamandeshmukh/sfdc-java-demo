package com.capgemini.sfdc.day2;

class BankCustomer {

	static String ifsc;
	int acNo;
	String customerName;
	double balance;
	// other fields
	
//	checkBalance() {}
//	withdraw() {}
//	deposit() {}
//	static viewInterestRates() {} 
//	static openNewAccount() {}	
}

public class DemoClass {
	
	public static void main(String[] args) {
		BankCustomer.ifsc = "BOB0001245";
		System.out.println(BankCustomer.ifsc); // access static member with ClassName
		BankCustomer obj = new BankCustomer();
		obj.acNo = 521265411;
		System.out.println(obj.acNo); // access nonstatic member with objectName
//		System.out.println(BankCustomer.acNo); // CE 
	}	
}
