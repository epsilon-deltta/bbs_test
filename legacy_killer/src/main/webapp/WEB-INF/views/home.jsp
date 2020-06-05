<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>
	<h1>Main</h1><br>
	<p>The file name is ${filename}</p>
	<a href="/resources/html/memJoin.html">JOIN</a>
	<a href="/resources/html/login.html">LOGIN</a>
	<a href="/memJoinOK.jsp">memJoinOK</a>
	<a href="/memLoginOK.jsp">memLoginOK</a><br>
	<a href="/bbs">Let's go BBS //Board System</a><br>
             
</body>
</html>
