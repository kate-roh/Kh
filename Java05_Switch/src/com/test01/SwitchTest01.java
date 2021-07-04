//6.22 수업
//7.5 복습
package com.test01;

import java.util.Scanner;

public class SwitchTest01 {

	public static void main(String[] args) {
		

	}

	public void test2() {
		char ch = 'd';
		
		switch(ch) {
		case 'a' :
			System.out.println("a입니다.");
			break;
		case 'b' :
			System.out.println("b입니다.");
			break;
		case 'c' :
			System.out.println("c입니다.");
			break;
		default : 
			System.out.println("다른 영어 입니다.");
		}
	}
	
	public void test3() {
		int i = 1;
		
		switch(i) {
		case '1' :
			System.out.println("홀수");
			break;
		case '2' :
			System.out.println("짝수");
			break;
		case '3' :
			System.out.println("홀수");
			break;
		case '4' :
			System.out.println("짝수");
			break;
		default : 
			System.out.println("다른 숫자입니다.");
		}		
	}
	
	public void test4() {
		String s = "영국";
		
		switch(s) {
		case "한국" :
			System.out.println("KOR");
			break;
		case "미국" :
			System.out.println("USA");
			break;
		case "영국" :
			System.out.println("UK");
			break;
		default : 
			System.out.println("다른 나라 입니다.");
		}
	}
	
	public void test5() {
		
//		//정수 하나를 입력! 몇월인지...
//		입력받은 숫자가
//		12,1,2 면 겨울
//		3,4,5면 봄
//		6,7,9이면 여름
//		9,10,11면 가을 이라고 출력
//		단, 1~12사이의 수가 아니면 "1~12사이의 값만 입력해주세요"라고 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력: ");
		int month = sc.nextInt();
		
		switch(month) {
		case 12 : 
		case 1 : 
		case 2 : 
			System.out.println("겨울");
			break;
		case 3 : case 4 : case 5 :
			System.out.println("봄");
			break;
		case 6 : case 7 : case 8 :
			System.out.println("여름");
			break;
		case 9 : case 10 : case 11 :
			System.out.println("가을");
			break;
		default : 
			System.out.println("1~12사이의 값만 입력해 주세요.") ;
			}
	}
	
}
