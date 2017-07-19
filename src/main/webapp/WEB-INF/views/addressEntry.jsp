<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Address</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Address</h1>
				<p>Add address</p>
			</div>
		</div>
	</section>
	<section class="container">
		<form:form modelAttribute="address" class="form-horizontal">
			<fieldset>
				<legend>Add new address</legend>
				<form:errors path="*" cssClass="alert alert-danger" element="div" />

				<div class="form-group">
					<label class="control-label col-lg-2" for="state">
						<spring:message code="address.form.state.label" />
					</label>
					<div class="col-lg-10">
						<form:input id="state" path="state" type="text" class="form:input-large" />
						<form:errors path="state" cssClass="text-danger" />
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="city">
						<spring:message code="address.form.city.label" />
					</label>
					<div class="col-lg-10">
						<form:input id="city" path="city" type="text" class="form:input-large" />
						<form:errors path="city" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="street">
						<spring:message code="address.form.street.label" />
					</label>
					<div class="col-lg-10">
						<form:input id="street" path="street" type="text" class="form:input-large" />
						<form:errors path="street" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="type">
						<spring:message code="address.form.zipcode.label" />
					</label>
					<div class="col-lg-10">
						<form:input id="zipcode" path="zipcode" type="text" class="form:input-large" />
						<form:errors path="zipcode" cssClass="text-danger" />
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