package com.test01;

import java.util.Scanner;

public class IfTest02 {
	//둘중에 한개를 선택하는 조건문, 조건이 참인 경우와 참이 아닌 경우에 수행하는 명령어를
	//따로 작성하는 경우에 사용
	
	public void test() {
		int i = 20;
		
		if(i<10) {
			System.out.println(i+"은 10보다 작습니다.");
			}else {
				System.out.println(i+"은 10보다 크거나 같습니다.");
			}
	}
	
	public void test2() {
		//숫자를 하나 입력받아 홀수짝수인지 출력함.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요:");
		int num = sc.nextInt();
		
		//조건식은 반드시 true, false가 나오도록 작성!!
		if(num %2 == 0) {
			//조건이 true일때 수행할 구문
			System.out.println("짝수입니다!");
		}else {
			//조건이 false일때 수행할 구문
			System.out.println("홀수입니다!!");
		}			
	}
	
	public void test3() {
		//숫자를 하나 입력받아
		//1)50보다 큰 수라면? ->짝수인지 홀수인지 판단해 출력한다.
		//2)50보다 작은 수라면? -> '작다'라고 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("0보다 큰 정수 입력: ");
		int no = sc.nextInt();
	
 		if(no >= 50) {
			
 			if(no%2==0) {
 				System.out.println("i는 50보다 큰 짝수");
 				
 			}else {
 				System.out.println("i는 50보다 큰 홀수");
 			}
 			
		}else {
			System.out.println("i는 50보다 작다");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
