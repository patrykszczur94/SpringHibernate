<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table align="center">
<tr>
<td><b>NAME</b></td><td><b>SURNAME</b></td><td><b>AGE</b></td>
</tr>
 <c:forEach items="${humans}" var="human">
            <tr>
            <td align="center">${human.name}</td>
            <td align="center">${human.surname}</td>
            <td align="center">${human.age}</td>
            </tr>
        </c:forEach>
</table>
<p align="center"><a href="<c:url value='/' />">back</a></p>
</body>
</html>