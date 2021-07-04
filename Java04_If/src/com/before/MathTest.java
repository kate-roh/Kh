//6.21 수업
//7.5 복습

package com.before;
import java.util.Random;

public class MathTest {
	public static void main(String[] args){
		MathTest test = new MathTest();
		
		//test.testMath();
		//test.testRandom();
		test.pracRandom();
	}
	
	public void testMath() {
		System.out.println("PI: " + Math.PI);
		
		System.out.println("-7의 절대값: " + Math.abs(-7));
		System.out.println("-123.4의 절대값: " + Math.abs(-123.4));
		
		System.out.println("임의의 난수: " + Math.random());
	}
	
	public void testRandom() {
		//1부터 100까지의 난수 구하기
		int random = (int)(Math.random()*100)+1;
		
		System.out.println("random:"+ random);
		
		//0
		int ran = new Random().nextInt(100);
		System.out.println("ran: " + ran);

	}
	
	public void pracRandom() {
		//int ran1 : 0~9까지의 랜덤수
		//int ran2 : 1~10까지의 랜덤수
		//int ran3 : 20~35까지의 랜덤수
		//int ran4 : 0 또는 1 
		
		int ran1 = new Random().nextInt(9);
		//정답: (Math.random()*10); or  new Random().nextInt(10);
		int ran2 = new Random().nextInt(10);
		//정답 : (int)(Math.random()*10)+1; or  new Random().nextInt(10) +1 ;
		int ran3 = new Random().nextInt(35);
		 //정답 : (int)(Math.random()*16)+20; or new Random().nextInt(10) +20 ; 
		int ran4 = new Random().nextInt(1);
		//정답 : (int)(Math.random()*2); or new Random().nextInt(2) ;

		System.out.println("0~9까지의 랜덤수 : " + ran1);
		System.out.println("1~10까지의 랜덤수 : " + ran2);
		System.out.println("20~35까지의 랜덤수 : " + ran3);
		System.out.println("0 또는 1 : " + ran4);
	}
}
