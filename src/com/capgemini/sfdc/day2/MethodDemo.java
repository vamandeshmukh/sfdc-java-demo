package com.capgemini.sfdc.day2;

public class MethodDemo {

	public static void printHello() { // method - no arguments and no return value- NANR
		System.out.println("printHello Hi! Have a nice day!");
	}


	public static void printHelloWithName(String name) { // method - with arguments and no return value- WANR
		System.out.println("printHelloWithName Hi " + name + "! Have a nice day!");
	}

	
	public static String returnHello() { // method - no arguments and with return value- NAWR
		return "returnHello Hi! Have a nice day!";
	}

	
	public static String returnHelloWithName(String name) { // method - with arguments and with return value- WAWR
		return "returnHelloWithName Hi!" + name + "Have a nice day!";
	}

	public static void main(String[] args) {
		System.out.println("main");
		printHello();
//		printHello(10); // CE 
		printHelloWithName("Sonu");
//		printHelloWithName(); // CE		
		String output = returnHello();
		System.out.println(output);
		String output2 = returnHelloWithName("Monu"); 
		System.out.println(output2);
	}

}
