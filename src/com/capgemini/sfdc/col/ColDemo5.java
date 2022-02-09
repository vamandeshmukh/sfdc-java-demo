package com.capgemini.sfdc.col;

import java.util.Vector;

public class ColDemo5 {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();

		System.out.println(vector.size());
		System.out.println(vector.capacity());
		System.out.println(vector);
		vector.add(10);
		vector.add(20);
		vector.add(30);
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		System.out.println(vector);
		vector.remove(1);
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		System.out.println(vector);
		
		// Stack 
		

	}

}
