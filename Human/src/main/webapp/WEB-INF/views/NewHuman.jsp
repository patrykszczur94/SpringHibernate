<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
 
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Adding human to database</title> 
</head>


<body>
    <h2 align="center">Adding human to database</h2>
    <form:form method="POST" modelAttribute="human">
        <form:input type="hidden" path="id" id="id"/>
        <table align="center">
            <tr>
                <td align="left"><label for="name">name</label> </td>
                <td><form:input path="name" id="name"/></td>
                 <form:errors path="name" cssclass="error" />
            </tr>
         
            <tr>
                <td><label for="surname">surname</label> </td>
                <td><form:input path="surname" id="surname"/></td>
                 <form:errors path="surname" cssclass="error" />
            </tr>
     
            <tr>
                <td><label for="age">age</label> </td>
                <td><form:input path="age" id="age"/></td>
                <form:errors path="age" cssclass="error" />
            </tr> 
            
            <tr>
                <td colspan="3">
                    <c:choose>
                        <c:when test="${REGISTER}">
                           <p align="center"> <input type="submit" value="Register"/></p>
                        </c:when>
                    </c:choose>
                </td>
            </tr>   
        </table>
        <p align="center"><a href="<c:url value='/' />">back</a></p>
    </form:form>
    <br/>
    <br/>
</body>
</html>