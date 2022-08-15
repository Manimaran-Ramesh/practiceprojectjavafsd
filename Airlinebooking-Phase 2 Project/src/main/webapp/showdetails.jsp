<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.ArrayList" import="java.util.List" import="java.util.Iterator"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking Details</title>
</head>
<body>

<table border=2>
            <thead>
                <tr>
                    <th>Airline</th>
                    <th>Price</th>
                    
                </tr>
            </thead>
            
            <tbody>
                <c:forEach items="${details}" var="i">
                <tr>
                    <td>${i.key}</td>
                    <td>${i.value}</td>
                    
                </tr>
                </c:forEach>   
            </tbody>
        </table>
        
        <form method=post action="airlinevalid">
Enter Airline: <input type="text" name="airline" required><br/>
No. of Persons: <input type="number" name="nop" required><br />

<input type="submit" value="Submit">


</form>
</body>
</html>