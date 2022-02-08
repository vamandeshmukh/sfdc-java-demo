package com.capgemini.sfdc.ex;

public class CheckedDemo {

	public static void main(String[] args) {

//		System.out.println("Start");
//		Thread.sleep(2000);
//		System.out.println("End");

		System.out.println("Start");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End");

	}

}
