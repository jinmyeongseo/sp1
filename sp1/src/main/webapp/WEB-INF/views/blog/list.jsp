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
	<h3>블로그 리스트</h3>
	
	<ul>
		<c:forEach var="dto" items="${list}">
			<li> <a href="${pageContext.request.contextPath}blog/${dto.blogIdx}/home">${dto.userName} 블로그</a> </li>
		</c:forEach>
	</ul>
</div>
</body>
</html>	  