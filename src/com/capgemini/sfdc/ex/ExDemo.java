package com.capgemini.sfdc.ex;

import java.util.Scanner;

public class ExDemo {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Number division App\nEnter num1");
//		int num1 = sc.nextInt();
//		System.out.println("Enter num2");
//		int num2 = sc.nextInt();
//		int num3 = 0;
//		
//		num3 = num1 / num2;
//		
//		System.out.println(num3); // infinity 

		Scanner sc = new Scanner(System.in);
		System.out.println("Number division App\nEnter num1");
		int num1 = sc.nextInt();
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		int num3 = 0;

		try {
			num3 = num1 / num2;
		} catch (ArithmeticException ae) {
			System.out.println("Do not divide by zero.");
		}
		System.out.println(num3); // infinity
	}
}