<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%  
int i=0;
%>
	<c:forEach items="${list}" var="list" varStatus="status">
		<a href="/bbs/post?id=${list.id}">
			<div style="background-color: silver;">
				<span style="font-size: xx-large">${status.count}.</span> <b
					style="font-size: xx-large;">${list.title}</b> ${list.writer}
				:${list.date} <br>
				<p>
					:<span style="font-size: x-large;">${list.context}</span>
				</p>
			</div>
		</a>
	
	</c:forEach>
</body>
</html>