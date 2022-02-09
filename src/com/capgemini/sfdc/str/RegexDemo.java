package com.capgemini.sfdc.str;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		String regex = "[A-Z]"; // 
     	Pattern pattern = Pattern.compile(regex);
//		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		for (int i = 33; i <= 126; i++) {
			String testString = Character.toString((char) i);
			Matcher matcher = pattern.matcher(testString);
			System.out.println(i + " " + testString + " " + matcher.matches());
		}
	}

//	public static void main(String[] args) {
//
//		System.out.println("Start");
//
//		String regex = "abc"; // what to search
//		String input = "abcdef"; // where to search in?
//
//		Pattern p = Pattern.compile(regex);
//
//		Matcher m = p.matcher(input);
//
//		System.out.println(m.find()); // anywhere in the input - true
//		System.out.println(m.lookingAt()); // in the beginning in the input - true
//		System.out.println(m.matches()); // exact match - false
//
//		System.out.println("End");
//	}

}
