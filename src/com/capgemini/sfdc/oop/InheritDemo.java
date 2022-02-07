package com.capgemini.sfdc.oop;

//inheritance - a subclass (child class) accesses members of superclass (parent class)
//acquire properties from parents 
// private members are not accessible 
// static members are not accessible 

class Parent {
	int num;
}

class Child extends Parent {
	int num2;
}

public class InheritDemo {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.num2 = 20;
		System.out.println(ch.num2);
		ch.num = 10;
		System.out.println(ch.num);
	}
}
