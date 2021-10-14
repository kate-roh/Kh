//7.1 복습 시작

package com.test01;

public class MethodTest01 {
	public static void main(String[] args) {
	//
	MethodTest01.publicMethod();
	MethodTest01.protectedMethod();
	MethodTest01.defaultMethod();
	privateMethod();
	
	//
	MethodTest01 mt01 = new MethodTest01();
	mt01.NonStaticMethod();
		
	}
	
	//public : 접근제한자로써 어디서나 접근 가능 ( + )
	public static void publicMethod() {
		System.out.println("public method");
	}
	
	// 어디에서 사용이 가능하냐? 	
	//1) 상속일 경우 상속된 곳에서 (#) 
	//2) 상속이 아닌경우에는 같은 패키지 안에서 사용가능
	protected static void protectedMethod() {
		System.out.println("protected method");
	}
	
	//같은 패키지 내에서
	static void defaultMethod() {
		System.out.println("defalut method");
	}
	
	//현재 클래스 안에서만 (-)
	private static void privateMethod() {
		System.out.println("private method");
		}
	
	public void NonStaticMethod() {
		System.out.println("non static method");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
