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

		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Number division App\nEnter num1");
		int num1 = sc.nextInt();
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		int num3 = 0;

		try {
			num3 = num1 / num2; // 10, 5, no exception , 10,0 - exception
		} catch (ArithmeticException objectName) {
//			objectName.printStackTrace();
			System.out.println("Do not divide by zero.");
		}
		finally {
			System.out.println("Done");
		}

		System.out.println(num3); // infinity
		System.out.println("End");
	}
}