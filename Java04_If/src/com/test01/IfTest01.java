package com.test01;

import java.util.Scanner;

public class IfTest01 {
	
	//단독 if문 , 아니면 건너뛴다...
	//1) 조건문의 결과 값이 참(true)면 {}안에 있는 코드를 실행
	//2) 조건식의 결과 값이 거짓(false)면 {}안에 있는 코드를 무시하고 넘어간다.
	
	public void testIf(){
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요: ");
		int num = sc.nextInt();
		
		//짝수인지 조건을 확인
		if(num %2 == 0 ) {
			//참일경우 수행함(true)
			System.out.println("입력하신 숫자는 짝수입니다. ");

			//짝수가 아닌지 조건을 확인함(홀수를 인지하는 것!)
			if(num % 2!= 0) {System.out.println("입력하신 숫자는 홀수입니다.");}
		
			//조건과 상관없이 실행
			System.out.println("프로그램 종료");
			
		}
	}
}
