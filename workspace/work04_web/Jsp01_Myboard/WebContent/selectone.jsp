<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  request.setCharacterEncoding("UTF-8"); %>
<%  response.setContentType("text/html; charset=UTF-8"); %>

<%@ page import="com.my.dao.myBoardDao" %>
<%@ page import="com.login.dto.myBoardDto" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	im
%>

<table boder="1">
	<tr>
		<th>Name</th>
		<td><%=dto.getMytitle() %></td>
	</tr>
	<tr>
		<th>TITLE</th>
		<td><%=dto.getMytitle() %></td>
	</tr>
	<tr>
		<td colspan="2">
			<button onclick="">수정</button>&nbsp;&nbsp;
			<button onclick="">삭제</button>&nbsp;&nbsp;
			<button onclick="location.href='mylist.jsp">목록</button>&nbsp;
		</td>
	</tr>
</table>
</body>
</html>