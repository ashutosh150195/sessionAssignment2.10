package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintPattern {
	
	private static BufferedReader br ;
	private static String input ;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter any non-negative ODD Integer greater than 3 : ");
		br = new BufferedReader(new InputStreamReader(System.in));
		input = br.readLine();
		int counter = 0;
		int character = 65 + counter;
		for (int i = 0; i < (Integer.parseInt(input)/2)+1; i++) {
			for (int j = 0; j < (Integer.parseInt(input)/2)-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i+1; j++) {
				if (j < (2*i+1)/2) {
					character = 97 + counter ;
					System.out.print((char)character);
					++counter;
				} else {
					character = 97 + counter ;
					System.out.print((char)character);
					--counter;
				}
			}
			System.out.println();
			character = 97 ;
			counter = 0;
		}
		int temp = 0 ;
		for (int i = 0; i < Integer.parseInt(input)/2; i++) {
			++temp ;
			for (int j = 0; j < i+1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < Integer.parseInt(input)- 2*temp; j++) {
				if (j < (Integer.parseInt(input)- 2*temp)/2) {
					character = 97 + counter ;
					System.out.print((char)character);
					++counter;
				} else {
					character = 97 + counter ;
					System.out.print((char)character);
					--counter;
				}
			}
			System.out.println();
			character = 97 ;
			counter = 0;
		}

	}

}
