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

<h3>파라미터 : @RequestParam</h3>

<p>
	<a href="${pageContext.request.contextPath}/user3/request">확인 1</a>	
</p>
<p>
	<a href="${pageContext.request.contextPath}/user3/request?name=spring">확인 2</a>
</p>
<p>
	<a href="${pageContext.request.contextPath}/user3/request?age=10">확인 3</a>
</p>
<p>
	<a href="${pageContext.request.contextPath}/user3/request?name=spring&age=10">확인 4</a>
</p>
</body>
</html>	  