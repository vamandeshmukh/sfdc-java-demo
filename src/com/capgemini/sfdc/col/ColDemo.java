package com.capgemini.sfdc.col;

import java.util.ArrayList;

public class ColDemo {

	public static void main(String[] args) {

////		int[] arr = { 10, 20, 30.5 };
//		int[] arr = { 10, 20, 30 };
//		for (int a : arr) {
//			System.out.println(a);
//		}
//		arr[2] = 35;
//		arr[3] = 40;

		ArrayList list = new ArrayList();

		System.out.println(list.size());
		System.out.println(list);

		list.add(10); // not int , it is Integer 
		list.add(10.5);
		list.add("abc");

		System.out.println(list.size());
		System.out.println(list);

		list.add(20);

		System.out.println(list.size());
		System.out.println(list);

		list.remove(1);

		System.out.println(list.size());
		System.out.println(list);

	}

}
