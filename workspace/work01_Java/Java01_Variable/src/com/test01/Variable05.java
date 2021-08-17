//6.17 수업 
//7.1 복습
package com.test01;

public class Variable05 {

	public static void main(String[] args) {
		//준비
		Variable05 test = new Variable05();
		
		//실행
		//test.test1();
		test.test3();
		
	}

	public void test1() {
		boolean flag = true;
		//flag = (bloolean)100;  // boolean 자료형은 무조건 true, false만 들어간다(형변환 예외)
		
		//자료형이 다르더라도 작은 크기의 변수 타입은 큰 변수 타입으로 저장이 가능(자동형변환, 묵시적형변환, upcasting)
		//큰 변수 타입은 작은 변수타입으로 자동 변환이 되지 않아 형변환을 명시해야한다. (강제형변환, 명시적형변환, downcasting)
		
		int num = 'A';
		System.out.println("num:" + num);
		
		char ch  = 98;
		System.out.println("ch:" + ch);
		
		char ch2 = (char)num;
		System.out.println("ch2:" + ch2);

		int num2 = -98;
		char ch3 = (char)num2;
		System.out.println("ch3:" + ch3);
		
	}
	
	public void test2() {
		
		int inum = 10 ;
		long lnum = 100;
		
	
		
		//문제1 : int isum = inum + lnum;  //에러
		//내가 한 풀이 
		// isum = long(inum) + lnum;
		
		 
		//정답 1번방식
		 int isum = inum + (int)lnum;
		//2번방식
		 int isum = (int)(inum + lnum);
		//3번방식
		 long isum = inum + lnum;
		
		
		//문제 2
		 byte bnum = 1;
		 short snum = 2;
		 
		 //1번 풀이
		 short sum = (short)(bnum+snum);
		 //2번 풀이
		 int sum2 = bnum + snum;
		
	}
	
	
	public void test3() {
		//문1
		long lnum = 100;
		
		float fnum = lnum;
		
		System.out.println("fnum:"+fnum);
		
		
		//문2
		double dnum = 12.3;
		//int inum = dnum; -> 타입 미스매치
		
		//풀이 ) 
 		int inum = (int)dnum;
 		System.out.println("inum:"+inum);
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
