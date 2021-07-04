package com.test01;
import java.util.Scanner;
public class Operator03 {
	public static void main(String[] args) {
		Operator03 test = new Operator03();
		test.opTest1();
	}

	// &(그리고, ~면서)
	// ||(또는, ~거나)
	// 논리값&&논리값, 논리값 || 논리값
	
	public void opTest1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력: ");
		int num = sc.nextInt();
		
		System.out.print("1부터 100사이인지 확인: " + (num>=1 && num<100));
	
		System.out.print("문자하나 입력: ");
		char ch = sc.next().charAt(0);
		//대문자인지 확인
		System.out.println("영대문자인지 확인 : " + ( ch>='A'&& ch<='Z' ));
		
		// ||
		// 입력한 문자가 대소문자와 상관없이 'y', 'Y'인지 확인할때
		
		System.out.print("계속 하시려면 y또는 Y를 입력하세요:");
		char ch2 = sc.next().charAt(0);
		System.out.println("영문자 y인지 확인 : " + (ch2 == 'y' || ch2 =='Y'));
		
	
	}
	
	
	
}
