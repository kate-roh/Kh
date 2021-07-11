//6.22 수업
//7.5 복습

package com.test01;

import java.util.Scanner;

public class SwitchTest02 {

	public void testSwitch() {
		//정수 두개와 연산기호문자(+,-,*,/) 1개를 입력받아서, 
		//연산 기호 문자에 해당하는 계산을 수행하고 출력.
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 값: ");
		no = sc.nextInt();
		
		System.out.println("두번째 값: ");
		no1 = sc.nextInt();
		
		System.out.println("연산자(+,-,*,/): ");
		no1 = sc.next().charAt(0);
		
			= 0;
			(op){
				:
				no1+no2;
			}
				no1-no2;
				
				no1*no2;
				
				no1/no2;
				
		System.out.println("잘못된 연산기호를 입력하였습니다.");			
				
		System.out.println("no1 + "" + op + "" + no2 + "=" + res);				
	}
		

	}