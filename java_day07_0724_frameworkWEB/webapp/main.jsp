<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import ="user.model.vo.UserVO"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div align="center" style="margin-top:30px">
	  창환이의 웹사이트
	</div><p>
	<div align="center">
		<% UserVO result = (UserVO)session.getAttribute("loginUser");
			if(result!=null){
		%>
		<%= result.getEmail() + "님 환영합니다." %>
		&nbsp;&nbsp;
		<a href="logout.do">[로그아웃]</a>
		<% }else{ %>
			<form action="login.do" method="post">
			아이디<input type="text" name="id"/>
			패스워드<input type="password" name="pwd"/>
			<input type="submit" value="로그인"/>
		<% } %>
		</form>
	</div>
	<p>
	<div align ="center">
	  <a href="list.do">게시물목록</a>
	</div>
</body>
</html>