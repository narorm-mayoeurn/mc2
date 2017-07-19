<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
				<p>Add accommodations</p>
			</div>
		</div>
	</section>
	<section class="container">
		<form:form modelAttribute="accommodation" class="form-horizontal">
			<fieldset>
				<legend>Add new accommodation</legend>
				<form:errors path="*" cssClass="alert alert-danger" element="div" />

				<div class="form-group">
					<label class="control-label col-lg-2" for="name"> <spring:message
							code="accommodation.form.name.label" />
					</label>
					<div class="col-lg-10">
						<form:input id="name" path="name" type="text"
							class="form:input-large" />
						<form:errors path="name" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="email"> <spring:message
							code="accommodation.form.email.label" />
					</label>
					<div class="col-lg-10">
						<form:input id="email" path="email" type="text"
							class="form:input-large" />
						<form:errors path="email" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="phoneNumber"> <spring:message
							code="accommodation.form.phoneNumber.label" />
					</label>
					<div class="col-lg-10">
						<form:input id="phoneNumber" path="phoneNumber" type="text"
							class="form:input-large" />
						<form:errors path="phoneNumber" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="type"> <spring:message
							code="accommodation.form.type.label" />
					</label>
					<div class="col-lg-10">
						<form:select path="type">
							<form:option value="Hotel">Hotel</form:option>
							<form:option value="Other">Motel</form:option>
						</form:select>
					</div>
				</div>

				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary" value="Add" />
						<a href=" <spring:url value="/accommodations/all" /> "class="btn btn-primary"> 
							<span class="glyphicon glyphicon-step-backward" /></span> Back to Accommodations
						</a>
					</div>
				</div>
			</fieldset>
		</form:form>
	</section>
</body>
</html>