<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import ="board.model.vo.BoardVO" %>
<%@ page import = "java.util.ArrayList" %>
<%--
<%@ 태그명 속성 ="" %> --지시자태그
<%! 변수,메서드 %>    --선언문태그
<%doGet(), doPost()%> 스크립틀릿 태그
<%= %>                표현식태그(System.out.println()) + ; 넣으면안댐
--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<body>
	<table class="table table-bordered">
	<tr>
		<th>번호</th><th>제목</th><th>작성자</th><th>등록일</th><th>조회수</th>
	</tr>
		<% 
		ArrayList<BoardVO> list = (ArrayList<BoardVO>)session.getAttribute("lists");
		for(int i=0;i<list.size();i++){
			BoardVO board = list.get(i);
		%>
		<tr>
			<td><%= board.getSeq()%></td>
			<td><%= board.getTitle() %></td>
			<td><%= board.getWriter() %></td>
			<td><%= board.getRegdate() %> </td>
			<td><%= board.getViewcnt() %></td>
		</tr>
		<% 
			}
		%>
	</table>
	
</body>
</html>