package com.demo.introduction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

	public static void main(String[] args) {
		String line = "This order was placed for QT3000! OK?";
		String pattern = "(.*)(\\d+)(.*)";

		Pattern pt = Pattern.compile(pattern);
		Matcher mc = pt.matcher(line);

		if (mc.find()) {
			System.out.println("Found value: " + mc.group(0));
			System.out.println("Found value: " + mc.group(1));
			System.out.println("Found value: " + mc.group(2));
		} else {
			System.out.println("NO MATCH");
		}
	}

}
