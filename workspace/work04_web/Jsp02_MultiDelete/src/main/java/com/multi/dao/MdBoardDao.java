package com.multi.dao;

//게시판 목록
public class MdBoardDao {
	return null;
}
//글 선택
public MDBoardDto selectOne(int seq){
	return null;
}
//글 작성
public int insert(MDBoardDto dto){
	return 0;
}
//글 수정
public int update(MDBoardDto dto) {
	Connection con = getConnection();
	PreparedStatement pstm = null;
	int res = 0;
	
	String sql = "UPDATE MDBOARD SET TITLE=?, CONTENT"
}