<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %> 
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
	<div class="flex-container">
		<div>
			<a href="/delete/${language.id}">Delete</a>
			<a href="/languages">Dashboard</a>
		</div>
		<div>
		<form:form action="/update/${language.id}" method="POST" modelAttribute="language">
	    	<%-- <div>
				<c:out value="${errorMessage}"></c:out>
			</div> --%>
	        <div class="form-group">
	            <form:label path="name">Name:</form:label>
	            <form:errors path="name"/>
	            <form:input path="name" type="text"/>
	           
	        </div>
	        <div class="form-group">
	            <form:label path="creator">Creator:</form:label>
	            <form:errors path="creator"/>
	            <form:input path="creator" type="text"/>
	        </div>
	        <div class="form-group">
	            <form:label path="version">Version:</form:label>
	            <form:errors path="version"/>
	            <form:input path="version" type="text"/>
	        </div>
	        <div>
	            <button class="btn btn-dark" type="submit">update language</button>
	        </div>
	    </form:form>
		</div>
	    
	    
	</div>
</body>
</html>