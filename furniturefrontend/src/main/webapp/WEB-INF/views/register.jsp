<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tag/form"%>


<!doctype html>
<html lang="en">
<head>

<title>furniture project</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
</head>
<body>
<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include> 

<div class="container">

<h2> REGISTRATION FORM </h2>>

<div class="col-lg-8">
<div class="row">

<form:form  modelAttribute="user" action="saveRegister" method="post">
<div class="form-group">
<label>Name:</label><br>
<form:input path="name" class="form-control" placeholder="Enter your name"/>
</div>

<div class="form-group">
<label>Email:</label><br>
<form:input path="email" class="form-control" placeholder="Enter your email"/>
<div>

<div class="form-group">
<label>Password:</label><br>
<form:input path="password" type="password" class="form-control" placeholder="Enter your password"/>
</div>

<div class="form-group">
<label>Address:</label><br>
<form:input path="address" class="form-control" placeholder="Enter your address"/>
</div>

<div class="form-group">
<label>Phone:</label><br>
<form:input path="phone" class="form-control" placeholder="Enter your phone"/>
</div>


<br><br><br>
<button type="submit" class="btn btn-lg btn-info">SUBMIT</button>

<button type="reset" class="btn btn-lg btn-info">CANCEL</button>

</form:form>
</div>

</div>

</div> 