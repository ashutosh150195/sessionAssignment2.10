package com.java;

public class HighestAmong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 1 , number2 = 4, number3 = 3;
		System.out.println((number1 > number2 && number1 > number3) ? number1 : ((number2 > number1 && number2 > number3) ? number2 : number3));

	}

}
