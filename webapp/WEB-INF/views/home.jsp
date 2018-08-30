<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<h2>이게 스프링 게시판이다</h2>
	<div>
	<c:forEach var="board" items="${ boardList }">
	<div>${ board.idx }</div>
	<div>${ board.title }</div>
	<div>${ board.writer }</div>
	<div>${ board.regdate }</div>
	</c:forEach>
	</div>
</body>
<script>
	
</script>
</html>