package com.assisstedPractices.section2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp17 {

	public static void main(String[] args) {
		regExp();
	}
	public static void regExp() {
		String pattern = "[a-zA-Z]";
		String check = "Manu";
		
		Pattern pat = Pattern.compile(pattern);
		Matcher match = pat.matcher(check);
		
//		System.out.println(match);
		
		while(match.find()) System.out.println(check.substring(match.start(),match.end()));
	}
}
