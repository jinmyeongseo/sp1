<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="icon" href="data:;base64,iVBORw0KGgo=">
</head>
<body>

	<h3>1단계</h3>
	
	<form action="${pageContext.request.contextPath}/user6/step1" method="post">
		<p> 이름 : <input type="text" name="name" value="${user.name}"> </p>
		<p> 이메일 : <input type="text" name="email" value="${user.email}"> </p>
		<p>
			<button type="submit">다음단계</button>
		</p>
		<p>${message}</p>
	</form>
</body>
</html>	  