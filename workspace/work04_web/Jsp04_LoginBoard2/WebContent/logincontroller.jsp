<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>

<%@ page import="java.util.List" %>
<%@ page import="com.login.dao.MyMemberDao" %>
<%@ page import="com.login.dto.MyMemberDto" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String command = request.getParameter("command");
	System.out.println("[command: "+command+"]");
	
	MyMemberDao dao = new MyMemberDao();
	
	if(command.equals("login")){
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		MyMemberDto dto = dao.login(id,pw);
		
		if(dto.getMyid() != null){
			
			session.setAttribute("dto", dto);
			session.setMaxInactiveInterval(60*60);
			
			if(dto.getMyrole().equals("ADMIN")){
				response.sendRedirect("adminmain.jsp");
			}else if(dto.getMyrole().equals("USER")){
				response.sendRedirect("usermain.jsp");
			}
			
		}else{
%>
		<script type="text/javascript">
			alert("login 실패!");
			location.href="index.jsp";		
		</script>
<%
		}
		
	}



%>

































<!--87라인시작  --><% 
	}
  }else if(command.equals("logout")){
	  //session 정보 삭제
	  session.invalidate();
	  response.sendRedirect("index.jsp");
	  
  }else if(command.equals("registform")){
	  response.sendRedirect("registform.jsp");
	  
  }else if(command.equals("idchk")){
	  String myid = request.getParameter("id");
	  String res = dao.idChk(myid);
	  
	  boolean idnotused = true;
	  
	  if(res != null){
		  idnotused = false;
	  }
	  
	  response.sendRedirect("idchk.jsp?idnotused="+idnotused);
  }
	String myid = request.getParameter//109라인부터 시작 







			
	dto.setMypw(mypw);//118라인부터 시작
	dto.setMyname(myname);
	dto.setMyaddr(myaddr);
	dto.setMyphone(myphone);
	dto.setMyemail(myemail);
	
	int res = dao.insertUser(dto);
	
	if(res>0){
%>
	<script type="text/javascript">
		alert("회원가입 성공");
		location.href="index.jsp";
	</script>
<%	
	}
%>
	<script type="text/javascript">
		alert("회원가입실패");
		location.href="logincontroller.jsp?command=registform="+
	</script>


<%	//141라인부터 시작
	}	
	}else if(command.eqwuals("userinfo")){
		intmyno =Integer.parseInt(request.getParameter("myno"));
		MyMemberDto dto=dao.selectUser(myno);
		request.setAttribute("dto",dto);
		pageContext.forward("userinfo.jsp");

	}else if(command.equals("updateform")){
		int myno = Inter.parseInt(request.getParameter("myno"));
		MymemberDt dto = dao.selectUser(myno);
		
		request.setAttribute("dto",dto);
		pageContext.forward("updateuser.jsp");
		
	}
	





</body>
</html>