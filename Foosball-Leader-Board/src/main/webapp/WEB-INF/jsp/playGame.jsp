<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Foosball Game</title>

<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

input[type=text],input[type=number], select, textarea {
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


<script type="text/javascript">
function getResult(min, max) {
        var result = Math.floor(Math.random() * (max - min)) + min;
	if(result == 1){
	document.getElementById('resultt1').value = "won";
	document.getElementById('scoret1').value = 10;
	document.getElementById('resultt2').value = "lost";
	document.getElementById('scoret2').value = -5;
	}

	else if(result == 0){
	document.getElementById('resultt1').value = "lost";
	document.getElementById('scoret1').value = -5;
	document.getElementById('resultt2').value = "won";
	document.getElementById('scoret2').value = 10;
	}
}

function validateForm()
{
    var a=document.getElementById('player1t1').value;
    var b=document.getElementById('player2t1').value;
    var c=document.getElementById('player1t2').value;
    var d=document.getElementById('player2t2').value;
    if (a==null || a==""||b==null || b==""||c==null || c==""||d==null || d=="")
    {
        alert("Please Fill All Player Names");
        return false;
    }
}
</script>

<h3>Foosball Game</h3>

<div class="container">

<form:form commandName="team" onsubmit="return validateForm()">

<p><b>Team 1</b></p>
<table>
<tr>
<td>
    <label for="player1t1">Player 1</label>
    <form:input type="text" id="player1t1" name="player1t1" value="" path="player1"  placeholder="Player1 name.."/><br><br>
</td>	
<td>
    <label for="player2t1">Player 2</label>
    <form:input type="text" id="player2t1" name="player2t1" value="" path="player2" placeholder="Player2 name.."/><br>
</td>
</tr>
<tr>
<td>
    <label for="resultt1">Result</label>
    <form:input type="text" id="resultt1" name="resultt1" disabled="true" value="" path="result" placeholder="Team1 result.." readonly="true"/><br>
</td>
<td>	

    <label for="scoret1">Score</label>
    <form:input type="number" id="scoret1" name="scoret1" value="" path="score" placeholder="Team1 score.." readonly="true"/><br>
</td>
</tr>
</table>
   <br><br>
    <p><b>Team 2</b></p>
<table>
<tr>
<td>
    <label for="player1t2">Player 1</label>
    <form:input type="text" id="player1t2" name="player1t2" value=""  path="player1" placeholder="Player1 name.."/><br>
</td>
<td>	

    <label for="player2t2">Player 2</label>
    <form:input type="text" id="player2t2" name="player2t2" value="" path="player2" placeholder="Player2 name.."/><br>
</td>
</tr>
<tr>
<td>
    <label for="resultt2">Result</label>
    <form:input type="text" id="resultt2" name="resultt2" value="" path="result" disabled="true" placeholder="Team2 result.." readonly="true"/><br>
</td>
<td>	

    <label for="scoret2">Score</label>
    <form:input type="number" id="scoret2" name="scoret2" value="" path="score" placeholder="Team2 score.." readonly="true"/><br>
</td>
</tr>
</table>

 <input type="button" value="Start Game" onclick="getResult(0,2)" /><br><br>
    <input type="submit" value="Submit">

</form:form>
 <a href="./" >Go Back To Main Page</a> 
</div>

</body>
</html>