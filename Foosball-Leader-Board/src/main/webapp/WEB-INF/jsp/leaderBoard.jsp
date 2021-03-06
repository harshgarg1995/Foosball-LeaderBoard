<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Foosball Game</title>

<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

input[type=text],input[type=number], select, textarea, a {
    width: auto;
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
    margin-top: 6px;
    margin-bottom: 16px;
    resize: vertical;
}

input[type=submit],input[type=button], a {
    background-color: #4CAF50;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover, a:hover {
    background-color: #45a049;
}

.container {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
}


</style>

</head>
<body>

<center><h3>Foosball LeaderBoard</h3></center>

<div class="container" align="center">

<table style="width:100%"  cellpadding = "5" cellspacing = "5">

<tr>

<th> Team Name </th>

<th> Total Points </th>

</tr>


<c:forEach items="${topTenTeams}" var="team">

<tr>
			
				<td align="center">${team.teamName}</td> 
				
				<td align="center">${team.score}</td>
		
</tr> 
</c:forEach>

</table>
<a href="./" >Go Back To Main Page</a> 
</div>

</body>
</html>