<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ page import="board.model.vo.BoardVO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<% BoardVO board = (BoardVO)request.getAttribute("board"); //�����ö� get %>
	<form action="update.do" method="post">
		�� ��ȣ<input type="text" name="seq" value="<%= board.getSeq() %>" readonly="readonly"><br/>
		�� ��<input type="text" name="title"value="<%= board.getTitle() %>"><br/>
		�ۼ���<input type="text" name="writer"value="<%= board.getWriter() %>" readonly="readonly"><br/>
		����<textarea name="content"> <%= board.getContent() %> </textarea><br/>
		�����<input type="text" name="regdate" value="<%= board.getRegdate() %>" readonly="readonly"><br/>
		��ȸ��<input type="text" name="viewcnt" value="<%= board.getViewcnt() %>" readonly="readonly"><br/>	
		<input type="submit" value="������Ʈ">
	</form>
	  
</body>
</html>