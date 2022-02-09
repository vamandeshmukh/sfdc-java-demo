package com.capgemini.sfdc.str;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {

		System.out.println("Start");

		String regex = "abc"; // what to search
		String input = "abcdef"; // where to search in?

		Pattern p = Pattern.compile(regex);

		Matcher m = p.matcher(input);

		System.out.println(m.find()); // anywhere in the input - true
		System.out.println(m.lookingAt()); // in the beginning in the input - true
		System.out.println(m.matches()); // exact match - false

		System.out.println("End");
	}

}
