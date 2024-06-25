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

	<h3>회원가입</h3>
	
	<form action="${pageContext.request.contextPath}/user5/write" method="post">
		<p> 아이디 : <input type="text" name="id"> </p>
		<p> 패스워드 : <input type="password" name="pwd"> </p>
		<p> 이름 : <input type="text" name="name"> </p>
		<p>
			<button type="submit">등록</button>
		</p>
	</form>
</body>
</html>	  