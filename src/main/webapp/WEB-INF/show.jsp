<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div> <a href="/languages">Dashboard</a></div>
	<div class="flex-container">
		<h1>${language.name}</h1>
		<h3>${language.creator}</h3>
		<h3>${language.version}</h3>
		<h3>${language.id}</h3>
	</div>
	<div>
		<a href="/update/<c:out value="${language.id}"></c:out>">Update</a>
		<a href="/delete/<c:out value="${language.id}"></c:out>">Delete</a> 
	</div>



</body>
</html>