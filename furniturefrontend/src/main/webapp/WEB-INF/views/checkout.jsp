<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body
{
background-image: url("resources/images/wall2.jpg");
}
.outer,.inner
{
display: block;
}
.inner
{
padding: 10px;
margin: 10px 0px;
background-color: red;
width: 70%;
font-family: sans-serif;
}
.head
{
background-color: #cc3333;
height: 40px;
width: 100%;
margin: 0 0 20px 0;
border-radius:5px;
font-family: Gotham;
padding-left: 10px;
color: white;
}
.mytext
{
vertical-align: middle;
line-height: 40px;
}
#order{
background-color: #cc3333;
color: white;
padding-left: 20px;
padding-top: 10px;
}
.tbSum th
{
font-size: 20px;
font-weight: bold;
font-family: sans-serif;
background-color: #cc3333;
color: white;
}
.tbSum td {
	font-size: 20px;
	font-weight: bold;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<title>Checkout</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
<div class="container">
	<div class="row">
		<div class="col-xs-6 jumbotron">
			<div class="head" style="text-align: center;">
				<h3><p class="mytext">Customer Details</p></h3>
			</div>
			
			<div class="outer">
				<div class="well" style="width: 100%;">
					<form action="${pageContext.request.contextPath}/invoiceProcess" method="post">
						<c:set var="gtot" value="0"></c:set>
						<c:forEach var="c" items="${cart}">
							<c:set var="gtot" value="${gtot + c.cartPrice * c.cartQuantity}"></c:set>
						</c:forEach>
					
						<div class="well">
							<table class="tbdetail">
								<!--=======================================  -->
								<tr>
									<td colspan="3"><b>Name:</b></td>
									<td>${user.name}</td>
								</tr>
								<!-- ====================================== -->
								<tr>
									<td colspan="3"><b>Email:</b></td>
									<td>${user.email}</td>
								</tr>
								<!-- ===================================== -->
								<tr>
									<td colspan="3"><b>Phone:</b></td>
									<td>${user.phone}</td>
								</tr>
								<!-- ======================================= -->
								<tr>
									<td colspan="3"><b>Address:</b></td>
									<td>${user.address}</td>
								</tr>
								<!-- ========================================= -->
								<tr>
									<td colspan="3"><b>Total Amount:</b></td>
									<td>${gtot}</td>
								</tr>
							</table>
						</div>
						<!--===========================================================  -->
						<div style="margin-top: 10px">
							<h3 style="color: blue;"><strong>Enter Card Details</strong></h3>
						</div>
						<!-- ============================================= -->
						<div class="well">
							<label>Payment</label>
								<select name="payment">
									<option value="cod">Cash on delivery</option>
									<option value="Olnpayment">Online Payment</option>								
								</select>
								<div><br></div>
								<input type="text" name="cardnum" placeholder="Enter card number" style="width: 70%;">
								<br><br>
								<input type="text" name="name" placeholder="Enter name on card" style="margin-bottom: 10px; width: 70%;">
								<br><br>
						
								<div>
									<table>
										<tr>
											<th colspan="2">Expiry</th>
											<th>&nbsp;&nbsp;&nbsp;&nbsp;</th>
											<th>CVV</th>
										</tr>
						
										<tr>
											<td colspan="2">
												<input type="number" min="1" max="12" name="month" placeholder="mm">
												<br>
												<input type="number" min="1" max="12" name="year" placeholder="yy">
											</td>
											<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
											<td><input type="number" name="cvv" placeholder="cvv"></td>
										</tr>					
									</table>					
								</div>						
						</div>
						<div class="wrapper" style="text-align: center;">
							<button role="button" class="btn btn-primary btn-lg" style="color:white; background-color: green;">Proceed</button>
						</div>
						
				</form>
			</div>
		</div>
	</div>
</div>
</div>
</body>
</html>				