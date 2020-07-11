<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>
		Thank you for coming ! <b>GroundK bro</b>
	</h1>
	<a href="/resources/html/index.html">index _ click</a>
	<P>The time on the server is ${serverTime}.</P>
	
	<br>
	<table border="1">
		<caption><strong>Functions</strong>
		<p>It's just for practicing....</p>
		</caption>
		<thead style="background-color: navy;color: white;">
			<tr>
				<td>function</td>
				<td>link</td>
				<td>description</td>
			</tr>
		</thead>

		<tbody>
		
			<tr>
				<td>Login</td>
				<td>
		<a href="/resources/html/memJoin.html">JOIN</a><br>
		<a href="/resources/html/login.html">LOGIN</a>
				</td>
				<td>working...</td>
			</tr>
			<tr>
				<td>Bulletin Board System</td>
				<td>
		<a href="/bbs">Let's go BBS //Board System</a>
				</td>
				<td>i made it for showing this to SI.<br><br></td>
			</tr>
		</tbody>
	</table>
</body>
</html>
