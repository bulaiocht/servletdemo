<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>Students view</title>
</head>
<body>
	<c:forEach var="student" items="${student_list}">
		${student} <br/>
	</c:forEach>
</body>
</html>