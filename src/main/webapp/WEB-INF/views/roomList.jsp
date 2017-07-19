<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Rooms</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Rooms</h1>
				<p>All the available room in for accommodation:
					${accommodationName}</p>
			</div>
		</div>
	</section>

	<section class="container">
		<div class="row">
			<p>
				<a
					href=" <spring:url value="/accommodations/room/add?accommodationId=${accommodationId}" /> "
					class="btn btn-primary"> <span
					class="glyphicon-info-sign glyphicon" /></span> Add Room
				</a> <a href=" <spring:url value="/accommodations/all" /> "
					class="btn btn-primary"> <span
					class="glyphicon-info-sign glyphicon" /></span> Back to Accommodations
				</a>
			</p>
			<c:forEach items="${rooms}" var="item">
				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="thumbnail">
						<div class="caption">
							<h3>${item.roomNumber}</h3>
							<p>${item.type}</p>
							<p>${item.image}</p>
							<p>${item.isAvailable}</p>
							<p>${item.price}</p>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
</body>
</html>