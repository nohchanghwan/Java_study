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
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<!-- �������� �ּ�ȭ�� �ֽ� CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- �ΰ����� �׸� -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- �������� �ּ�ȭ�� �ֽ� �ڹٽ�ũ��Ʈ -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<body>
	<table class="table table-bordered">
	<tr>
		<th>��ȣ</th><th>����</th><th>�ۼ���</th><th>�����</th><th>��ȸ��</th>
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