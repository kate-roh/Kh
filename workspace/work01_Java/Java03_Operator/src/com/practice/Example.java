//6.18 숙제 & 6.21 수업
//7.5 복습

package com.practice;

import java.util.Scanner;

public class Example {
	public void sample1() {
		  /*- 구현 내용 : 
        국어(정수), 영어(정수), 수학(정수), 총점(정수), 평균(실수) 변수 선언하고,
        각 점수를 키보드로 입력받고,
        합계(국어+영어+수학)와 평균(합계/3.0)을 계산하고,
        세 과목의 점수와 평균을 가지고 합격 여부 처리함
        합격의 조건 : 세 과목의 점수가 각각 40점이상이면서,
                 평균이 60점 이상이면 합격, 
                 아니면 불합격 처리함
     */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문제1");
		
		//변수선언
		int kor, eng, math, total;
		double avg;
		
		
		System.out.println("국어점수: ");
		kor = sc.nextInt();
		
		System.out.println("영어점수: ");
		eng = sc.nextInt();
		
		System.out.println("수학점수: ");
		math = sc.nextInt();
		
		System.out.println("총점 : " + (total = (kor+eng+math)));
		System.out.println("평균: " + (avg = (total/3.0)));
		
		if (kor>=40 && eng>=40 && math>=40 && avg>=60) {
			System.out.println("합격!!");}
		 else {System.out.println("불합격입니다. 다시 도전하세요.");}
		
		
	}
	
	
	
	public void sample2() {
		  /*- 구현 내용 : 
        변수 선언하고, 키보드로 입력받은 값들을 변수에 기록하고
        변수값을 화면에 출력 확인함
        성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력처리함

        => 변수 선언후 입력받음 
        학생이름 (문자열)
        학년 (정수)
        반 (정수)
        번호 (정수)
        성별(M/F) (문자)   //문자열로 입력받은 후, 문자하나 분리해야 함
        성적 (실수) //소숫점 아래 둘째자리까지 입력받음
      - 출력 예
        3학년 2반 24번 남학생 홍길동은 성적이 95.55이다.
  */
		
		System.out.println("문제2");
		Scanner sc = new Scanner(System.in);
		
		
		//변수선언
		int years;
		System.out.println("학년: ");
		years = sc.nextInt();
		
		String name;
		System.out.println("이름: ");
		name = sc.next();
		
		int room;
		System.out.println("반: ");
		room = sc.nextInt();

		int num;
		System.out.println("번호: ");
		num = sc.nextInt();

		char gender2;
		String res2;
		System.out.println("성별 (M/F): ");
		gender2 = sc.next().charAt(0);
		res2 = (gender2=='M'|| gender2=='m')? "남학생 ":"여학생 ";
		
		double score;
		System.out.println("성적 입력(소수점 둘째자리까지) ");
		score = sc.nextDouble();
		
		System.out.printf( years +"학년 " + room + "반 " + num + "번 " + res2 + "의 성적은? " + "%.2f이다.", score );
		}
	
	
	public void sample3() {
		   /*- 구현 내용 : 
        1. 정수 변수 선언
        2. 키보드로 부터 정수 하나 입력받음
        3. 입력받은 정수가 양수이면 "양수다." 출력
                          양수가 아니면 "양수가 아니다." 출력 */

		Scanner sc = new Scanner(System.in);
		int num;
	      
	    System.out.println("정수 하나만 입력: ");
	    num = sc.nextInt();
	      
	    String res = (num>0) ? "양수다." : "양수가 아니다.";
	      
	    System.out.println(res);
		
	}
	
	public void sample4() {
		   /*-
	1. 정수 변수 선언
   	2. 문자열 변수 선언
   	3. 키보드로 부터 정수를 하나 입력 받음   
   	4. 입력받은 정수가 짝수이면 "짝수다" 를 문자열변수에 기록하고,
       짝수가 아니면 "홀수다"를 문자열변수에 기록하고 문자열변수 값 출력함
      <짝수의 조건>  어떤 수를 2로 나눈 나머지가 0과 같으면 짝수임. */

		Scanner sc = new Scanner(System.in);

		int num;
		
		String res;
		
		System.out.println("정수 입력 : ");
		num = sc.nextInt();
		
		res = (num %2 == 0) ? "짝수다." : "홀수다";
		
		System.out.println(res);


		
	}
}
