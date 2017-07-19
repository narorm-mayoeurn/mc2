<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Accommodations</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Accommodations</h1>
				<p>All the available accommodations in our store</p>
			</div>
		</div>
	</section>

	<section class="container">
		<p>
			<a href=" <spring:url value="/accommodations/add" /> "
				class="btn btn-primary"> <span
				class="glyphicon-info-sign glyphicon" /></span> Add Accommodation
			</a>
		</p>
		<div class="row">
			<c:forEach items="${accommodations}" var="item">
				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="thumbnail">
						<div
							class="${item.isValid ? 'alert alert-success' : 'alert alert-danger'}">
							<h3>${item.name}</h3>
							<p>${item.phoneNumber}</p>
							<p>${item.email}</p>
							<p>Type: ${item.type}</p>
							<p>Status: ${item.isValid ? 'COMPLETED' : 'INCOMPLETE'}</p>
							<p>
								<a
									href=" <spring:url value="/accommodations/delete?accommodationId=${item.id}" /> "
									class="btn btn-default"> <span
									class="glyphicon glyphicon-remove" /></span> Remove
								</a>
							</p>
							<p>
								<a
									href=" <spring:url value="/accommodations/address/all?accommodationId=${item.id}" /> "
									class="btn btn-default"> <span
									class="glyphicon-info-sign glyphicon" /></span> Address
								</a>
							</p>
							<p>
								<a
									href=" <spring:url value="/accommodations/room/all?accommodationId=${item.id}" /> "
									class="btn btn-default"> <span
									class="glyphicon-info-sign glyphicon" /></span> Room
								</a>
							</p>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
</body>
</html>