package com.test01;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class DBTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//준비
		Connection con = null;
		Statement stmt = null;
//		ResultSet rs = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.01:1521:XE";
		String id = "ESTHER";
		String pw = "KH";
		
		//입력
		int no = 0;
		String name = null;
		String nickname = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호입력:");
		no = sc.nextInt();;
		System.out.print("이름입력:");
		name = sc.next();
		System.out.print("별명입력:");
		nickname = sc.next();
		
		//INSERT INT MYTEST VALUES(ㅁ,'ㅁ,','ㅁ')
		String sql = "INSERT INTO MYTEST VALUES("+no+"','"+name+"','")"
		//System.out.println(sql);

		
		Class.forName(driver);
		
		
		
	}

}
