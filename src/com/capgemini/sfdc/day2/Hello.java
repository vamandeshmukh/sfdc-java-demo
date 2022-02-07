package com.capgemini.sfdc.day2;

public class Hello {

	public static void calculateAndPrintIncome(double salary, double bonus) {
		double professionalTax = 250;
		double totalIncome = salary + bonus - professionalTax;
		System.out.println(salary);
		System.out.println(bonus);
		System.out.println(totalIncome);
	}

	public static void main(String[] args) {

		double salary, bonus;

		System.out.println("Suresh pay info");
		salary = 50000;
		bonus = 10000;
		calculateAndPrintIncome(salary, bonus);

		System.out.println("Duresh pay info");
		salary = 60000;
		bonus = 15000;
		calculateAndPrintIncome(salary, bonus);

		System.out.println("Pooja pay info");
		salary = 70000;
		bonus = 20000;
		calculateAndPrintIncome(salary, bonus);

		calculateAndPrintIncome(100, 10);
//		calculateAndPrintIncome(100); // CE 
//		calculateAndPrintIncome(100, 10, 12); // CE 
	}

}
