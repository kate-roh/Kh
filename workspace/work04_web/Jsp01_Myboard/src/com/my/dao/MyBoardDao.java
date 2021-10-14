package com.my.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.my.dto.MyBoardDto;

public class MyBoardDao{
	
	public MyBoardDao() {
		
	}
	//선택출력
	public MyBoardDto selectOne(int myno) {
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ESTHER","1234");
			System.out.println("02. 계정연결");
		}catch(SQLException e) {
			System.out.println("02. 계정 연결 실패");
			e.printStackTrace();
		}
		
		PreparedStatement pstm =null;
		String sql = "INSERT INTO MYBOARD"+
					"VALUES(MYSEQ.NEXTVAL,?,?,?,SYSDATE)";
		int res = 0;
		
		
		
		
		
		
		return 0;
	}
	//추
	//수정
	public int update(MyBoardDto dto) {
		
	}
	//추가
	public int insert(MyBoardDto dto) {
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ESTHER","1234");
			System.out.println("02. 계정연결");
		}catch(SQLException e) {
			System.out.println("02. 계정 연결 실패");
			e.printStackTrace();
		}
		
		PreparedStatement pstm =null;
		String sql = " INSERT INTO MYBOARD "+
					" VALUES(MYSEQ.NEXTVAL,?,?,?,SYSDATE) ";
		int res = 0;
		try {
			pstm = con.prepareStatment(sql);
			pstm.setString(1, dto.getMyname());
			pstm.setString(2, dto.getMytitle());
			pstm.setString(3, dto.getMycontent());
			System.out.println("03. query 준비:"+sql);
			
			res = pstm.executeUpdate();
			System.out.println("04. query 실행 및 리턴");
		}catch(SQLException e) {
			System.out.println("3/4단계 오류");
			e.printStackTrace();
		}finally {
			try {
				pstm.close();
				con.close();
				System.out.println("05. db 종료/n");
			}catch(SQLExcption) {
				
			}
		}
		
		
		
		
		
		
		return 0;
	}
}