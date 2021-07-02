package com.test01;

public class Operator02 {
	public static void main(String args[]) {
		new Operator02().opTest();
	}

	
	public void opTest() {
		int num1 = 140;
		int num2 = 30;
		
		System.out.println("num1+num2 = " + (num1+num2));
		System.out.println("num1-num2 = " + (num1-num2));
		System.out.println("num1*num2 = " + (num1*num2));
		
		//나누었을때 몫
		System.out.println("num1/num2 = " + (num1/num2));
		//나누었을때 나머지
		System.out.println("num1%num2 = " + (num1%num2));
		
	}
	
	
	public void opTest2() {
		//비교연산자
		//>,<,==,!=,<=,>=
		
		int a=10, b=20;
		boolean res1, res2, res3;
		
		res1 = (a == b);
		
		
		
	}
	
	
	
	
	
	
	
	
}
