package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer amount = 120;

		Number num = new Number();

		System.out.println("the two digits added together is: " + num.sum(amount));

		System.out.println(amount / 10);
//        line 14 is to prove show 'amount / 10' returns 5 as it is an integer

		num.singleDigitToWord(amount);

	}

}
