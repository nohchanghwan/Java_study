<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import ="board.model.vo.BoardVO" %>
<%@ page import = "java.util.ArrayList" %>
<%--
<%@ �±׸� �Ӽ� ="" %> --�������±�
<%! ����,�޼��� %>    --�����±�
<%doGet(), doPost()%> ��ũ��Ʋ�� �±�
<%= %>                ǥ�����±�(System.out.println()) + ; ������ȴ�
--%>
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
	<table class="table table-bordered">
	<tr>
		<th>��ȣ</th><th>����</th><th>�ۼ���</th><th>�����</th><th>��ȸ��</th>
	</tr>
		<% ArrayList<BoardVO> list = (ArrayList<BoardVO>)request.getAttribute("lists");
		for(int i=0;i<list.size();i++){
			BoardVO board = list.get(i); %>
		<tr>
			<td><%= board.getSeq()%></td>
			<td><a href="read.do?seq=<%= board.getSeq() %>"><%= board.getTitle() %></a></td>
			<td><%= board.getWriter() %></td>
			<td><%= board.getRegdate() %> </td>
			<td><%= board.getViewcnt() %></td>
		</tr>
		<% } %>
	</table>
	<p>
	<div align="left">
		<a href="boardForm.do">�۾���</a>
	</div>
</body>
</html>