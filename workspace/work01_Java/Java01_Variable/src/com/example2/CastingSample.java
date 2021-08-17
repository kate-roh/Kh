package com.example2;

import java.util.Scanner;


public class CastingSample {

	
	
//	public void printUnicode() {
//
//		Scanner sc = new Scanner(System.in);
//				
//		System.out.println("문자를 하나 입력하세요: ") ;
//		char ch = sc.next().charAt(0);
//		
//		int unicode = ch;
//		
//		System.out.println(ch + " is unicod: " + unicode);
//	
//}

	public void calculatorScore() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 : ") ;
		double kor = sc.nextDouble();

		System.out.println("영어 : ") ;
		double eng = sc.nextDouble();

		System.out.println("수학 : ") ;
		double math = sc.nextDouble();

		int sum = (int)(kor + eng + math);
		int avg = sum/3;
		
		System.out.println("sum: " + sum);
		
		System.out.println("avg: " + avg);
				
		
	}
}