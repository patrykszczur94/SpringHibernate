<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HibernateApp</title>
</head>
<p align="center"><b> Welcome into hibernate app </b></p>
<body>
<table>
</table>
<p align="center"><a href="<c:url value='/new' />">Add human to database</a></p>
<p align="center"><a href="<c:url value='/show' />">Show list of humans</a></p>
</body>
</html>