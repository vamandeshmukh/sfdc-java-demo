package com.capgemini.sfdc.str;

public class TypeCastingDemo {

	public static void main(String[] args) {

//		byte short int long char 
//		byte short int char 

		byte b1 = 10, b2 = 20, b3 = (byte) (b1 + b2);

//		System.out.println(b3);

		byte b4 = -128; // -128 to 127

//		System.out.println("byte range- ");
//		System.out.println(Byte.SIZE);
//		System.out.println(Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
//		System.out.println("short range- ");
//		System.out.println(Short.SIZE);
//		System.out.println(Short.MIN_VALUE + " to " + Short.MAX_VALUE);
//		System.out.println("int range- ");
//		System.out.println(Integer.SIZE);
//		System.out.println(Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
//		System.out.println("long range- ");
//		System.out.println(Long.SIZE);
//		System.out.println(Long.MIN_VALUE + " to " + Long.MAX_VALUE);

//		int num = 10;
//		char ch = 'a';
//		System.out.println(num + ch);

		for (int i = 0; i < 256; i++) {
			System.out.println(i + " - " + (char) i);
		}
	}
}
