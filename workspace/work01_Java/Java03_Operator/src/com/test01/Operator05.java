//6.18 수업
//7.5 복습

package com.test01;

public class Operator05 {
	public static void main(String[] args) {
		new Operator05().opTest();
	}
	//+=,-=,*=,/=,%=
	public void opTest(){
		int res, num = 12;
		
		System.out.println("num: " + num);

		num = num+3;
		System.out.println("num: " + num);

		num +=3;
		System.out.println("num: " + num);

		num -= 5; //num = num-5
		System.out.println("num: " + num);
		
		num /=2; //num값 2배 감소
		System.out.println("num: " + num);

		num *=2;
		System.out.println("num: " + num);

		
		
	}
}
