package com.qa.main;

public class Number {

	int sum(int number) {

//		if (10 < number && number < 99) {
//
//			String num = String.valueOf(number);
//			for (int i = 0; i < num.length(); i++) {
//				int j = Character.digit(num.charAt(i), 10);
//			}
//			return 7;
//
//		} else {
//			return 0;
//		}

		int second_digit = number % 10;
		int first_digit = number / 10;

		System.out.println(first_digit);

		return first_digit + second_digit;

	}

}
