<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${list}" var="list">
 <tr>
  <td>${list.id}</td>
  <td>${list.writer}</td>
  <td>${list.context}</td>
  <td>${list.date}</td>
  <td>${list.title}</td>
 </tr>
 <br>
</c:forEach>
</body>
</html>