package com.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.login.dto.MyMemberDto;

import common.JDBCTemplate;

public class MyMemberDao extends JDBCTemplate {

	/*관리자기능(ADMIN)
	 * 
	 */
	
	/*사용자기능(USER)
	 * 
	 */
	
	//로그인
	public MyMemberDto login(String id, String pw) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		MyMemberDto res = new MyMemberDto();
		
		String sql = " SELECT * FROM MYMEMBER WHERE MYID=? AND MYPW=? AND MYENABLED=? ";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, id);
			pstm.setString(2, pw);
			pstm.setString(3, "Y");
			System.out.println("03. query 준비: " + sql);
			
			rs = pstm.executeQuery();
			System.out.println("04.query 실행 및 리턴");
			while(rs.next()) {
				res.setMyno(rs.getInt(1));
				res.setMyid(rs.getString(2));
				res.setMypw(rs.getString(3));
				res.setMyname(rs.getString(4));
				res.setMyaddr(rs.getString(5));
				res.setMyphone(rs.getString(6));
				res.setMyemail(rs.getString(7));
				res.setMyenabled(rs.getString(8));
				res.setMyrole(rs.getString(9));
				
			}
			
		} catch (SQLException e) {
			System.out.println("3/4단계 오류");
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
			close(con);
			System.out.println("05. db 종료\n");
		}
		
		return res;
	}
	
	


	public int updateRole(int myno, String myrole) {//라인 107부터 시작 
	Connection con = getConnection();
	PreparedStatement pstm = null;
	int res=0;
	
	String sql="UPDATE MYMEMBER SET MYROLE=? WHERE MYNO=?";
	
	try {
	pstm=con.prepareStatement(sql);
	pstm.setString(1, myrole);
	pstm.setString(2, myno);
	System.out.println("03.query준비 : "+sql);
	
	res=pstm.executeUpdate();
	System.out.println("04.query 실행 및 리턴");
	
	if(res>0) {
		commit(con);
	} else {
		rollback(con);
	}
	
	} catch(SQLException e) {
	  System.out.println("3/4단계 에러");
	 e.printStackTrace();
	} finally {
		close(pstm);
		close(con);
		System.out.println("05.db종료\n");
	}
	return res;
	}
	
	//9.28추가 하는 내용
	//아이디 중복체크
	public String idChk(String id) {	// 235라인부터 시작 
		Connection con =getConnection();
		PreparedStatement pstm =null;
		ResultSet rs =null;
		String res = null;
		
		String sql = " SELECT * FROM MYMEMBER WHERE MYID=?";
		
		try {
			pstm =con.prepareStatement(sql);
			pstm.setString(1, id);
			System.out.println("03.query준비 : " +sql);
			
			rs=pstm.executeQuery();
			System.out.println("04.query 실행 및 리턴");
			while(rs.next()) {
				res=rs.getString(2);
			}
			
		}catch(SQLException e) {
			System.out.println("3/4단계 에러");
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstm);
			close(con);
			System.out.println("05.db종료\n");
		}
		
		return res;		//return res;가 265번 라인임!
	}
	
	
	
	
	
	
	
	