//6.17일....수업시 배운거///
//6월 29일 복습 시작//


package com.test01;

public class Variable04 {
	public static void main(String[] args) {
		
		//준비
		//클래스명 변수명 = new 클래스명();
		Variable04 test = new Variable04();
		
		//실행
		//변수명.메소드();
		//test.printVarSize();
		
		test.testOverflow();
		
	}
	
//	//변수의 사이즈(크기) 출력용 메소드
//	public void printVarSize() {
//		//정수형 
//		System.out.println("byte:" + Byte.BYTES+"byte");  	
//		//자료형 타입별로 크기가 BYTES라는 필드로 저장되어있다.
//		System.out.println("short:" + Short.BYTES+"byte");
//		System.out.println("int:" + Integer.BYTES+"byte");
//		System.out.println("long:" + Long.BYTES+"byte");
//
//		//실수형
//		System.out.println("float:" + Float.BYTES+"byte");
//		System.out.println("double:" + Double.BYTES+"byte");
//		
//		//문자형
//		System.out.println("char:" + Character.BYTES+"byte");				
//	}
	
	public void testOverflow() {
		//byte bnum = 128;
	
		byte bnum = 127;
		bnum = (byte)(bnum +1);       //byte + int--> int
		
		System.out.println("bnum:" + bnum);
	
	}

	


}
	
	
	
	
	
	
	
	
	
	
	
	
	
