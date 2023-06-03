<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8" isErrorPage = "true"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Handling page</title>
</head>
<body>


<% exception.printStackTrace(response.getWriter()); %>
<h2> An exception was generated. Details are above:</h2><br>
</body>
</html>
    
    
