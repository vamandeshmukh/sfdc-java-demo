package com.capgemini.sfdc.oop;

// abstract - 
// interface - enables multiple inheritance 

interface SomeInterface {

}

interface StateGovt {

}

interface GovtOfIndia {

	void paySalaries();

}

abstract class Rbi {

	abstract void doKyc();

	void payInterest() {

	}
}

class HdfcBank extends Rbi implements GovtOfIndia, StateGovt {

	@Override
	void doKyc() {
		// specify the process - aadhaar, pan, voter
	}

	void giveLoans() {
		// code
	}

	void takeDeposits() {
		// code
	}

	@Override
	public void paySalaries() {
		// TODO Auto-generated method stub

	}

}

public class AbsDemo {
	public static void main(String[] args) {
		HdfcBank obj = new HdfcBank();
		obj.giveLoans();
		obj.takeDeposits();
		obj.doKyc();
	}
}