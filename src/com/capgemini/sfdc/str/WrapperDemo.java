package com.capgemini.sfdc.str;

// wrapper classes 
// int - Integer
// byte - Byte
// char - Character 


public class WrapperDemo {

	public static void main(String[] args) {

//		String str = "abc";
////		str.
//		int num = 10;
////		num.

//		Integer num = 10;
//		System.out.println(num.intValue());

		String str = "100";
		String str2 = "200";
		String str3;

		int num1 = Integer.parseInt(str);
		int num2 = Integer.parseInt(str2);
		int num3 = num1 + num2;
		str3 = Integer.toString(num3);
		System.out.println(str3);

	}

}
