//6.21 수업
//7.5 복습

package com.test01;

import java.util.Scanner;

public class IfTest03 {
	//else if : 다중 조건을 줄 수 있는 문법.
	
	
	
	public void test() {
		int i = 10;
		int j = 20;
		
		if(i>j)	{
			System.out.println(i+"은" + j+ "보다 큽니다.");
		}else if(i==j) {
			System.out.println(i+"은"+j + "과 같습니다.");
		}else {
			System.out.println(i+"은"+j+ " 보다 작습니다.");
		}
	}
	
	public void test2() {
		//점수 하나 입력받아, 등급을 나누어 점수와 등급을 출력하자
		//등급,
		//90점 이상 A등급
		//90점 미만 80점 이상 B등급
		//80점 미만 70점 이상 C등급
		//70점 미만 60점 이상 D등급
		//60점 미만은 F등급
		
	
		//내가 푼거...
		//*int i = 90;
		//*int j = 80;
		//*int d = 70;
		//*int a = 60;
		
		//*if(i>100) {
		//*	System.out.println("A");}
	//*else if(i>j) {
		//*	System.out.println("B");}
		//*else if(j>d) {
		//*	System.out.println("C");}
	//*else if(d>a) {
		//*	System.out.println("D");}	
	//*else {
		//*	System.out.println("F");}	*//
		
		
		//정답
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요:");
		int point = sc.nextInt();
		char grade = ' ';
		
		if(point>=90) {
			grade = 'A';
		}else if(point<90 && point>=80) {
			grade = 'B';
		}else if(point<80 && point>=70) {
			grade = 'C';
		}else if(point<90&&point>=80) {
			grade = 'D';
		}else{grade = 'F';
		}

		System.out.printf("당신의 점수는 %d이고, 등급은 %c입니다.",point, grade);

	}
	 
	public void test3() {
		//6.21일 숙제...! 
		//위의 문제에서 각 등급별 중간 점수 이상의 경우에는
		//등급에 "+"를 추가하여 출력.
		//예)95점이상이면 등급이 A+로 출력되게 함.
		
		//6.22 풀어주는 정답
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요:");
		int point = sc.nextInt();
		char grade = ' ';
		
		if(point>=90) {
			grade = 'A';
		}else if(point<90 && point>=80) {
			grade = 'B';
		}else if(point<80 && point>=70) {
			grade = 'C';
		}else if(point<90&&point>=80) {
			grade = 'D';
		}else{grade = 'F';
		}

		System.out.printf("당신의 점수는 %d이고, 등급은 %c입니다.",point, grade);

	}
		
		
	}
	

