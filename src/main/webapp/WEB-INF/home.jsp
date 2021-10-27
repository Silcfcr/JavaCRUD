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
	<div class="flex-container">
		<div class="row justify-content-center">
			<div class="col-10">
				<table class="table">
			        <thead>
			            <tr>
			                <th scope="col">Name</th>
			                <th scope="col">Creator</th>
			                <th scope="col">Version</th>
			                <th scope="col">Action</th>
			            </tr>
			        </thead>
			        <tbody>
			        	<c:forEach items="${languages}" var="language">
			            <tr>
			                <td><a href="/show/${language.id}">
			                <c:out value="${language.name}"></c:out></a></td>
			                <td><c:out value="${language.creator}"></c:out></td>
			                <td><c:out value="${language.version}"></c:out></td>
			                <td><a href="/update/<c:out value="${language.id}"></c:out>">Update</a><a href="/delete/<c:out value="${language.id}"></c:out>">Delete</a> </td>
			            </tr>
			            </c:forEach> 
			        </tbody>
			    </table>
		    </div>
		</div>
		
		<div class="row justify-content-center">
			<div class="col-5">
				<h1> Add a new language</h1>
				<form:form class="form" action="/newLanguage" method="POST" modelAttribute="language">
			    	<div>
						<c:out value="${errorMessage}"></c:out>
					</div>
			        <div class="form-group">
			            <form:label path="name">Name:</form:label>
			            <form:errors path="name"/>
			            <form:input class="form-control" type="text" path="name"/>
			            
			        </div>
			        <div class="form-group">
			            <form:label path="creator">Creator:</form:label>
			            <form:input class="form-control" path="creator" type="text"/>
			            <form:errors path="creator"/>
			        </div>
			        <div class="form-group">
			            <form:label path="version" for="version">Version:</form:label>
			            <form:input class="form-control" path="version" type="text"/>
			            <form:errors path="version"/>
			        </div>
			        <div>
			            <button class="btn btn-dark" type="submit">Add new language</button>
			        </div>
    			</form:form>
				
		    </div>
		</div>
    
</div>
</body>
</html>