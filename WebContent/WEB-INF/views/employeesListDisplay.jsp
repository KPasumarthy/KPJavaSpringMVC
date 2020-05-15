<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<title>KP : Kailash Spring MVC Java Web Application Hello World</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="./css/bootstrap.min.css" rel="stylesheet">
<link href="./css/style.css" rel="stylesheet">
<link href="./css/skin.css" rel="stylesheet">
<link href="./css/pricingCol.css" rel="stylesheet">
<!-- KP : <link rel="stylesheet" href="css/font-awesome.min.css">-->
<link rel="stylesheet" href="./css/bootstrap-grid.min.css" />
<link rel="stylesheet" href="./css/StyleSheet.css" />

<script src="./js/jquery.min.js"></script>
<script src="./js/jsCall2ServletKPWebAPIs.js"></script>
<script src="./js/elementTransitions.min.js"></script>
<script src="./js/modernizr.custom.js"></script>
<script src="./js/bootstrap.min.js"></script>

<script type="text/javascript">
	 	$(window).load(function() {
		 	$(document).ready(function() {
				alert("KP : Test $(window).load(function(){}) & $(document).ready(function(){}); ")	 		
			});
	 	});	 	 	
 </script>


</head>

<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div id="header" class="clearfix">
					<img class="header" role="img"
						aria-label="This is the main header logo"
						src="../../images/KPIcon32x32.ico" alt="logo">
				</div>
			</div>

			<div class="col-md-3">
				<br />
			</div>
		</div>
	</div>
	
	
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div id="header" class="clearfix">
					<img class="header" role="img"
						aria-label="This is the main header logo"
						src="images/KPIcon32x32.ico" 
						alt="logo">
				</div>
			</div>

			<div class="col-md-3">
				<br />
			</div>
		</div>
	</div>
	
	
	
	<h2>All Employees in System</h2>
	<div class="container" id="homeScreen">
		<div class="row">
			<div class="pricingTable">
				<div class="pricing-icon">
					<i class="fa fa-shopping-cart"></i>
				</div>
				<div class="price-Value">
					<span class="currency"></span>
				</div>
				<span class="month"></span>

				<div class="pricing-content">
					<div class="pricingHeader"></div>
					<div class="pricing-content">
						<div id='contentFirst' class="row"></div>
					</div>
				</div>
			</div>
		</div>
	</div>


	<table border="1">
		<tr>
			<th>Employee Id</th>
			<th>First Name</th>
			<th>Last Name</th>
		</tr>
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td>${employee.id}</td>
				<td>${employee.firstName}</td>
				<td>${employee.lastName}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>