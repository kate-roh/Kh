package Silsub1;

import java.util.Scanner;

public class Munjae {

	public void test1(){
		
	}
	
	public void test2(){
		
	}
	
	public void test3(){
		
	}
	
	public void test4(){
		
	}
	
	
	
	public void test5() {
		
		//강사님과 같이 품
	 Scanner sc = new Scanner(System.in);
			
	 System.out.print("이름:");
	 String name = sc.next();
	 System.out.print("나이:");
	 int age = sc.nextInt();
	 System.out. print("키:");
	 double height = sc .nextDouble();
			
//// if ((name ! = null) && (name.length() >0) && (age>0) && (height>0) ) {
//			System.out.println("이름: "+ name);
//			System.out.println("나이: " +age);
//			System.out.println("키: " + height);
//			System.out.println(name+"의 나이는" + age + "이고, 키는"+ height + "cm이다");
//			}else 1){System.out.println("정보를 잘못 입력했습니다.");	 }
////	              2){if (name==null){
//	 					System.out.println("이름이 null");}
	 
	 
	 if(name!=null) {
		 if(name.length()>0) {
			 if(age>0) {
				 if(height>0) {
					System.out.println("이름: " +name);
					System.out.println("나이: " + age);
					System.out.println("키: " + height); 
					System.out.println(name+"의 나이는" + age + "이고, 키는"+ height + "cm이다");
				 }else {
					 System.out.println("키를 잘못 입력했습니다.");
				 }
			 }else {
					 System.out.println("키를 잘못 입력했습니다.");
				 }
			 }else {
				 System.out.println("이름을 입력하지 않았습니다.");
			 }
		 }else {
			 System.out.println("이름이 null입니다.");
	 }

//		System.out.println("이름:"+name);
//		System.out.println("이름:"+name);
		}

public void test6(){
	
}

public void test7(){
	
}









}