<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Room</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Room</h1>
				<p>Add room</p>
			</div>
		</div>
	</section>
	<section class="container">
		<form:form modelAttribute="room" class="form-horizontal">
			<fieldset>
				<legend>Add new room</legend>
				<form:errors path="*" cssClass="alert alert-danger" element="div" />

				<div class="form-group">
					<label class="control-label col-lg-2" for="roomNumber">
						<spring:message code="room.form.roomNumber.label" />
					</label>
					<div class="col-lg-10">
						<form:input id="roomNumber" path="roomNumber" type="text" class="form:input-large" />
						<form:errors path="roomNumber" cssClass="text-danger" />
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="price">
						<spring:message code="room.form.type.label" />
					</label>
					<div class="col-lg-10">
						<form:input id="type" path="type" type="text" class="form:input-large" />
						<form:errors path="type" cssClass="text-danger" />
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="price">
						<spring:message code="room.form.price.label" />
					</label>
					<div class="col-lg-10">
						<form:input id="price" path="price" type="text" class="form:input-large" />
						<form:errors path="price" cssClass="text-danger" />
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="isAvailable">
						<spring:message code="room.form.isAvailable.label" />
					</label>
					<div class="col-lg-10">
						<form:checkbox path="isAvailable" value="isAvailable"/>
						<form:errors path="isAvailable" cssClass="text-danger" />
					</div>
				</div>


				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary" value="Add" />
					</div>
				</div>
			</fieldset>
		</form:form>
	</section>
</body>
</html>