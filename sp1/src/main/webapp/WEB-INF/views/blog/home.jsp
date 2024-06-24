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

<div>
	<h3>${dto.userName}님의 블로그</h3>
	<p>블로그 주제 : ${dto.blogName}</p>
	<p>
		<a href="${pageContext.request.contextPath}/blog/main">돌아가기</a>
	</p>
</div>

</body>
</html>	  