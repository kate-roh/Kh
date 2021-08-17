package com.test01;

public class MethodTest02 {

	public static void main(String[] args) {
		//method 호출방법
		//1. static: class.nethod();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		//MethodTest01.privateMethod();
		
		//2.non static :
		// class 변수명 = new class();
		//변수명.method();
		MethodTest01 method01 = new MethodTest01();
		method01.NonStaticMethod();
		
		
		
		
	}

}
