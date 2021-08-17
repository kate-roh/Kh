package com.test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Variable02 {

	public static void main(String[] args) {
		//준비
		//클래스명 변수명 = new 클래스명();
		Variable02 test = new Variable02();
		
		//실행
		//변수명. 메소드명();
		//test.input1();
		test.input2();
		
	}
	
	
	public void input1() {
		
		//input1 메소드의 기능 : 키보드를 통해 값을 입력받아서 변수에 저장하고 화면에 출력할 것이다. ex)BufferedReader 변수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// -> 바로 밑의 주석처리한 두줄과 같은 것이지만, 한줄로 요약한 코드임! 
		//  InputStreamReader ir = new InputStreamReader(System.in);
		//  BufferedReader br = new BufferedReader(ir);
		
		
		System.out.print("정수 값 한 개를 입력하세요: ");
		// *print 와 println의 차이 
		//  - print : 줄바꿈 없이 한줄로 출력값이 입력됨
		//  - println : 줄바꿈되면서 출력됨 
		
		String value ;
		//입력할 string 변수 입력함
		
		try {
			value = br.readLine(); //value변수 : 문자열 형태로 가져다가 저장하는 변수 
			
			//System.out.println("계산 결과: " + (value*3)); -> 문자열값은 *할 수 없다!!
			
			int no = Integer.parseInt(value); // 문자열 형태의 숫자를 실제 숫자 데이터로 변환시킴!
			  //value에 저장되 있는 문자와 숫자값을 int로 바꿔줌...! 
			System.out.println("계산결과: " + (no*3));
			
			
		} catch(IOException e) {
			e.printStackTrace();
			
		}
		
		
	}

	public void input2() {
		//Scanner 클래스 이용
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		// bufferReader : 외부로부터 데이터를 읽어올때 사용한다.  
		// Scanner : 
		
		System.out.print("Name:");    //이름을 읽어와서 저장
		String name = sc.nextLine();  //한줄을 읽어온다.  
		
		//next : 띄어쓰기 하는 순간 다른 것
		//nextLine 은 띄어쓰기를 해도 그냥 다 읽어옴
		
		System.out.print("Age:");    //나이를 출력해!
		int age = sc.nextInt();      //nextint라는 것을 통해 입력된 정수값을 읽어온후 저장. 
		
		System.out.print("Height(소숫점 첫째 자리까지):");  // 출력하자
		double height = sc.nextDouble(); 				   // 읽어다가 저장
		
		System.out.print("Gender(F/M):");
		sc.nextLine();
		char gender = sc.nextLine().charAt(0); //charAt: 0,1,2,3순으로 진행되고 가져올 위치를 ( ) 안에 넣기
		
		System.out.println(name + " 님은 " + age + " 세 이며, 키는 " + height + " cm 이며, 성별은 " + gender + "입니다. " );
		
	}
	
	
	
	
	
}
