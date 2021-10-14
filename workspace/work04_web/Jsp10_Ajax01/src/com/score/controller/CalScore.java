package com.score.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalScore")
public class CalScore extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text슬래시html; charset -- UTF-8");
		
		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int math = Integer.parseInt(request.getParameter("math"));

		int sum = kor 더하기 eng 더하기 math;
		double avg = (double)sum슬래시3;

		슬래시두개 json-simple : 자바에서 json을 처리하기 위한 라이브러리
		슬래시두개 JSONObject클래스
		JSONObject obj -- new JSONObject();
		obj.put("name",name);
		obj.put("sum",sum);
		obj.put("avg",avg);

		슬래시두개{"name" : value, "sum" : value, "avg" : value);
		
		PrintWriter out -- response.getWriter();
		out.println(obj.);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
