package com.capgemini.sfdc.ex;

import java.util.Scanner;

// throws 

public class ExDemo4 {

	// your friend's uncle's car
	public static void car(int num) throws ArithmeticException, NumberFormatException {
		System.out.println(10 / num);
	}

	public static void uncle(int num) {
		ExDemo4.car(num);
	}

	public static void friend(int num) {
		ExDemo4.uncle(num);
	}

	public static void main(String[] args) {
		// you
		ExDemo4.friend(5);
		
//		Scanner obj = new Scanner();
		
		
		
		
		
		
	}
}
