//6.23 수업

package com.test01;

import java.util.Scanner;

public class WhileTest01 {
	public static void main(String[] args) {
		
//		WhileTest01.test1(); 
////		WhileTest01.test2();
//		WhileTest01.test3();
//		WhileTest01.test4();
		WhileTest01.test5();
	}

	public static void test1() {
		int i = 1;
		
		while(true) {
			System.out.println(i+"번째 반복문 수행중...");
			i++;
			}
		System.out.println("while 종료 후 i값: " +i);
		}
	public static void test2() {
		//문자열을 입력받아 인덱스별로 문자출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		String str = sc.next();
		
		//1.
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
//		System.out.println(str.charAt(2));
//		System.out.println(str.charAt(3));
//		System.out.println(str.charAt(4));
	
		//2.
//		int index = 1;
//		int no =0;
//		while(index<6);
//		  System.out.println(str.charAt(no));
//		  no++;
//		  index++;

//		//3.
//		int index = 1;
//		while(index<6) {
//		  System.out.println(str.charAt(index-1));
//		  index++;
//		}
			
//		//4.
//		int index = 0;
//		while(index<5) {
//		  System.out.println(str.charAt(index));
//		  index++;
//		}
		
		//5.
		int index = 0;
		while(index<str.length()) {
		  System.out.println(str.charAt(index));
		  index++;
		}		
		
		
		
		
		
}
	public static void test3() {
//		1부터 입력받은 수 까지의 정수를 합을 구해 출력하자.
		System.out.print("정수 하나 입력: ");
		int num = new Scanner(System.in).nextInt();
		
		int sum = 0;
		
		int i = 1;
		while(i<=num) {
			sum += i;
			
			i++;
		}
		System.out.println("sum: "+ sum);
		
		
		
	}
	public static void test4() {
		int i = 1;
		
		while(true) {
			System.out.println(i);
			i++;
			
			if(i==100) {
				break;
			}
		}
		System.out.println("while이 종료 된 후 i값 : : " + i);
	}
	public static void test5() {
		//키보드로 4를 입력받을때 까지 반복
		//4가 입력되면 while문 종료.
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자입력[1~10]: ");
			int i = sc.nextInt();
			
			if(i==4) {
				System.out.println("4입력!!!! 종료!!!");
				break;
			}
			}
		}
	
	}





