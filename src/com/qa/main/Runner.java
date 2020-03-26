package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer amount = 713;

		Number num = new Number();

		System.out.println("the two digits added together is: " + num.sum(amount));

		System.out.println(amount % 100);

		num.singleDigitToWord(amount);

//		num.numbersOverOneHundred(amount);

	}

}
