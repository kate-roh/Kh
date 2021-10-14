package com.example;
import java.util.Scanner;


public class Example {

	public static void main(String[] args) {
		
		
	}
	
	public void example1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수"); 
		int A = sc.nextInt();
				
		System.out.println("나머지 정수"); 
		int B = sc.nextInt();
		
		System.out.println("입력한 두 변수의 사칙연산을 진행한다."); 
		System.out.println("더하기 :" + (A + B ));
		System.out.println("빼기 :" + (A - B ));
		System.out.println("곱하기 :" + (A * B ));
		System.out.println("나누기 :" + (A / B ));
		System.out.println("나누기 나머지결과 :" + (A % B ));
		
	}

	public void example2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로"); 
		int A = sc.nextInt();
				
		System.out.println("세로"); 
		int B = sc.nextInt();
		
		System.out.println("사각형의 면적과 둘레를 계산하여 출력한다."); 
		System.out.println("면적 :" + (A * B ));
		System.out.println("더하기 :" + (A + B )*2);
		}
	
	public void example3() {
		System.out.println("[연습문제3]"); 
		
		Scanner sc = new Scanner(System.in);
		
			
		System.out.println("문자열을 입력하시오 : "); 
			
		String value = sc.nextLine();
		
		char ch1 = value.charAt(0);
		char ch2 = value.charAt(1);
		char ch3 = value.charAt(2);
		
		System.out.println("첫 번째 문자 " + ch1); 
		System.out.println("두 번째 문자 " + ch2); 
		System.out.println("세 번째 문자 " + ch3); 

		}
		
	
	
	
}
