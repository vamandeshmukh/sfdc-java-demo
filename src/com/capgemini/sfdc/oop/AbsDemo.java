package com.capgemini.sfdc.oop;

// abstract - 

abstract class Rbi {

	abstract void doKyc();

//	void doKyc2() {
//		// code - aadhaar, pan, voter
//	}

}

class HdfcBank extends Rbi {

	@Override
	void doKyc() {
		// specify the process 
	}

	void giveLoans() {
		// code
	}

	void takeDeposits() {
		// code
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