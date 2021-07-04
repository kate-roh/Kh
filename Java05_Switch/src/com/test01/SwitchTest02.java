//6.22 수업
//7.5 복습
package com.test01;

import java.util.Scanner;

public class SwitchTest02 {

	public void testSwitch() {
		//정수 두개와 연산기호문자(+,-,*,/)1개를 입력받아서,
		//연산기호 문자에 해당하는 계산을 수행하고 출력.
	Scanner sc = new Scanner(System.in);
	
	System.out.println("첫번째 값: ");
	int no1 = sc.nextInt();
	
	System.out.println("두번째 값: ");
	int no2 = sc.nextInt();
	
	System.out.println("연산자 (+,-,*,/): ");
	char op = sc.next().charAt(0);
	
	int res = 0;
	boolean flag = true;
	
	switch (op) {
	case '+' :
		res = no1+no2;
		break;
	case '-' :
		res = no1-no2;
		break;
	case '*' :
		res = no1*no2;
		break;
	case '/' :
		res = no1/no2;
		break;
	default:
		System.out.println("잘못된 연산기호를 입력하였습니다.");
		flag = false;
	}
	
	if(flag) {
	System.out.println(no1 + "" + op + "" + no2 + "=" + res);
}
	
}
}
