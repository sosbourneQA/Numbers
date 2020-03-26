package com.qa.main;

public class Number {

	int sum(int number) {

		int second_digit = number % 10;
		int first_digit = number / 10;

		System.out.println(first_digit);

		return first_digit + second_digit;

	}

	void singleDigitToWord(int num) {

		if (num < 20) {
			switch (num) {
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
				break;
			case 5:
				System.out.println("five");
				break;
			case 6:
				System.out.println("six");
				break;
			case 7:
				System.out.println("seven");
				break;
			case 8:
				System.out.println("eight");
				break;
			case 9:
				System.out.println("nine");
				break;
			case 10:
				System.out.println("ten");
				break;
			case 11:
				System.out.println("eleven");
				break;
			case 12:
				System.out.println("twelve");
				break;
			case 13:
				System.out.println("thirteen");
				break;
			case 14:
				System.out.println("fourteen");
				break;
			case 15:
				System.out.println("fifteen");
				break;
			case 16:
				System.out.println("sixteen");
				break;
			case 17:
				System.out.println("seventeen");
				break;
			case 18:
				System.out.println("eighteen");
				break;
			case 19:
				System.out.println("nineteen");
				break;
			}

		} else {
			biggerNumberToWord(num);
		}

	}

	void biggerNumberToWord(int num) {

		if (num < 100) {

			int first_digit = num / 10;
			int second_digit = num % 10;

			switch (first_digit) {

			case 2:
				System.out.print("twenty ");
				break;
			case 3:
				System.out.print("thirty ");
				break;
			case 4:
				System.out.print("fourty ");
				break;
			case 5:
				System.out.print("fifty ");
				break;
			case 6:
				System.out.print("sixty ");
				break;
			case 7:
				System.out.print("seventy ");
				break;
			case 8:
				System.out.print("eighty ");
				break;
			case 9:
				System.out.print("ninety ");
				break;

			}

			singleDigitToWord(second_digit);
		} else {
			System.out.println("too big");
		}

	}

}
