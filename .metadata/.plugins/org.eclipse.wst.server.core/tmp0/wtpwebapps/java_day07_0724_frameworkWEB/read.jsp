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
	<% BoardVO board = (BoardVO)request.getAttribute("board"); //가져올땐 get %>
	글 번호<input type="text" name="seq" value="<%= board.getSeq() %>"><br/>
	제 목<input type="text" name="title"value="<%= board.getTitle() %>"><br/>
	작성자<input type="text" name="writer"value="<%= board.getWriter() %>"><br/>
	내용<textarea name="content"> <%= board.getContent() %> </textarea><br/>
	등록일<input type="text" name="regdate" value="<%= board.getRegdate() %>"><br/>
	조회수<input type="text" name="viewcnt" value="<%= board.getViewcnt() %>"><br/>	
	
	<div>
 		<a href="delete.do?seq=<%= board.getSeq() %>">[삭제]</a> &nbsp;&nbsp;&nbsp;
 		<a href="updateForm.do?seq=<%= board.getSeq() %>">[수정]</a> &nbsp;&nbsp;&nbsp;
 		<a href="list.do">	[목록]</a> &nbsp;&nbsp;&nbsp;
	</div>  
</body>
</html>