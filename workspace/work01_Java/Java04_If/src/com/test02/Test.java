//6.22 수업
//7.5 복습

package com.test02;

public class Test {
	public void test01(int i) {
		if(i%5 == 0) {
			System.out.println("5의 배수입니다.");
		}

	}
	public void test02(int i) {
		if ((i%2==0) && (i%3==0)){
			System.out.println("2와 3의 배수입니다.");
		} else {
			System.out.println("2와 3의 배수가 아닙니다.");
		}

	}
	public void test03(char c) {
		if(Character.isUpperCase(c)) {
			System.out.println("대문자 입니다.");
		} else if(Character.isLowerCase(c)) {
			System.out.println("소문자 입니다.");
		}


	}
}