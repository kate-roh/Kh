package com.answer.controller;

import javax.servlet.RequestDispatcher;

public class AnswerConttroller {

	
	request.setAttribute("parent",dto);//109라인
	dispatch("answerwrite.jsp", request,response);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	request.setAttribute("dto",dto);	//41줄 시작
	RequestDispatcher dispatcher dis
	
	
	
	
	
	
	
	
	
	
	
		dto.setTitle(title);//56줄 시작
		dto.setContent(content);
	
		int res= dao.insert(dto);
		if(res>0) {
		dispatch("answer.do?command=list",request,response);
		}else {
			dispatch("answer.do?command=witeform",request,response);
		}
	}
}

		if(res>0) {//99줄 시작

















}
