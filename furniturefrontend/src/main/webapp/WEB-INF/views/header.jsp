<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

<title>Welcome</title>

</head>

<body>
<div class="picture" style="text-align: center; color: green; font-family:cursive; font-size: xx-large;">
	<h1><b>pixabay</b></h1>
</div>
<nav class="navbar navbar-inverse" role="navigation">
  	<div class="container-fluid">
    		<div class="navbar-header">
      			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        			<span class="sr-only">Toggle navigation</span>
        			<span class="icon-bar"></span>
       			 	<span class="icon-bar"></span>
        			<span class="icon-bar"></span>
      			</button>
   				<img src="resources/images/logo2.png" style="width:28%;height:4%">
   			</div>

    <!-- ==============Collect the nav links ==========================-->
    
  				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      					<ul class="nav navbar-nav">
   						<li><a href="${pageContext.request.contextPath}/index">Home</a> </li>

      					</li>
      					</ul>
      			
   						<ul class="nav navbar-nav navbar-right">
      							<li><a href="${pageContext.request.contextPath}/register"><span class="glyphicon glyphicon-user"></span> Register</a></li>
      							<li><a href="${pageContext.request.contextPath}/goToLogin"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    							
    							
    							
    							 <li><a>Welcome: ${pageContext.request.userPrincipal.name}</a></li>
    						
    			<li><a href="${pageContext.request.contextPath}/admin/adding">Admin</a></li>
         		<li><a href="${pageContext.request.contextPath}/admin/productList">Products</a></li>
         		<li><a href="${pageContext.request.contextPath}/admin/categoryList">Category</a></li>
         		<li><a href="${pageContext.request.contextPath}/admin/supplierList">Supplier</a></li>
    						

    					</ul>
   			</div>


</nav>
</body>
</html>