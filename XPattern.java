package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XPattern {
	
	private static BufferedReader br ;
	private static String input ;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		br = new BufferedReader(new InputStreamReader(System.in));
		int  rightSide ;
		
		input = br.readLine();
		rightSide = Integer.parseInt(input) ;
		
		for (int i = 1; i <= (Integer.parseInt(input)/2)+1; i++) {
			for (int j = 1; j <= Integer.parseInt(input); j++) {
				if (i == j || j == rightSide) {
					System.out.print("*");
					if (j == rightSide) {
						--rightSide;
					}
				}if (i != j && j < rightSide) {
					System.out.print("_");
				}
			}
			System.out.println();
		}
		int temp = (Integer.parseInt(input)/2)+1 ;
		for (int i = 1; i <= Integer.parseInt(input)/2; i++) {
			for (int j = 1; j <= Integer.parseInt(input); j++) {
				if (j == temp - i || j == temp + i) {
					System.out.print("*");
				}if (j != temp - i && j < temp + i) {
					System.out.print("_");
				}
			}
			System.out.println();
		}
	}

}
