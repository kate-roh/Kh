<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	function idChk(){ //이거 왜하느냐? 가입하면 n이 y로 변환하도록 만드는 코드!
		var doc = document.getElementsByName("myid")[0];
		if(doc.value.trim()=="" || doc.value==null){
			alert("아이디를 입력해 주세요.");
		}else{
			var target ="logincontroller.jsp?command=idchk&id="+doc.value.trim();
			open(target,"","width=200,height=200"); //open()은 팝업창띄우는 코드!
		}
		
	}
</script>

</head>
<body>
	<h1>회원가입</h1>
	
	<form action="logincontroller.jsp" method="post">
		<input type="hidden" name="command" value="insertuser">
		<table border="1">
			<tr>
				<th>I D</th>
				<td>
					<input type="text" name="myid" title="n" required>
					<input type="button" value="중복체크" onclick="idChk();">
				</td>
			</tr>
			<tr>
				<th>P W</th>
				<td><input type="text" name="mypw" onclick="idChkConfirm();" required></td>
			</tr>
			<tr>
				<th>NAME</th>
				<td><input type="text" name="mypw" onclick="idChkConfirm();" required></td>
			</tr>
			<tr>
				<th>ADDR</th>
				<td><input type="text" name="myaddr" onclick="idChkConfirm();" required></td>
			</tr>
			<tr>
				<th>PHONE</th>
				<td><input type="text" name="myphone" onclick="idChkConfirm();" required></td>
			</tr>
			<tr>
				<th>EMAIL</th>
				<td><input type="text" name="myemail" onclick="idChkConfirm();" required></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="가입">
				</td>
			</tr>
		</table>
		
	</form>
</body>
</html>