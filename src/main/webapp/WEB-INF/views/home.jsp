<%@ include file="header.jsp"%>


<!-- banner -->
<div id="home" class="w3ls-banner">
	<!-- banner-text -->
	<div class="slider">
		<div class="callbacks_container">
			<ul class="rslides callbacks callbacks1" id="slider4">
				<li>
					<div class="w3layouts-banner-top">

						<div class="container">
							<div class="agileits-banner-info">
								<h4>Book Now</h4>
								<h3>We know what you love</h3>
								<p>Get accommodation today</p>
								<div class="agileits_w3layouts_more menu__item">
									<a href="#" class="menu__link" data-toggle="modal"
										data-target="#myModal">Log In</a>
								</div>
							</div>
						</div>
					</div>
				</li>
				<li>
					<div class="w3layouts-banner-top w3layouts-banner-top1">
						<div class="container">
							<div class="agileits-banner-info">
								<h4>Book Now</h4>
								<h3>We know what you love</h3>
								<p>Get accommodation today</p>
								<div class="agileits_w3layouts_more menu__item">
									<a href="#" class="menu__link" data-toggle="modal"
										data-target="#myModal">Log In</a>
								</div>
							</div>
						</div>
					</div>
				</li>
				<li>
					<div class="w3layouts-banner-top w3layouts-banner-top2">
						<div class="container">
							<div class="agileits-banner-info">
								<h4>Book Now</h4>
								<h3>We know what you love</h3>
								<p>Get accommodation today</p>
								<div class="agileits_w3layouts_more menu__item">
									<a href="#" class="menu__link" data-toggle="modal"
										data-target="#myModal">Log In</a>
								</div>
							</div>
						</div>
					</div>
				</li>
			</ul>
		</div>
		<div class="clearfix"></div>
		<!--banner Slider starts Here-->
	</div>
	<div class="thim-click-to-bottom">
		<a href="#about" class="scroll"> <i class="fa fa-long-arrow-down"
			aria-hidden="true"></i>
		</a>
	</div>
</div>
<!-- //banner -->



<!--//Header-->
<!-- //Modal1 -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog">
	<!-- Modal1 -->
	<div class="modal-dialog">
		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4>Log In</h4>
				<div class="contact-agileits">
					<form action="<c:url value='/postLogin'/>"
						method="post" name="sentMessage" id="contactForm" novalidate>
						<div class="control-group form-group">
							<div class="controls">
								<label class="contact-p1">Username:</label> <input type="text"
									class="form-control" name="userName" id="userName" required
									data-validation-required-message="Please enter your username.">
								<p class="help-block"></p>
							</div>
						</div>
						<div class="control-group form-group">
							<div class="controls">
								<label class="contact-p1">Password:</label> <input
									type="password" class="form-control" name="password"
									id="password" required
									data-validation-required-message="Please enter your password.">
								<p class="help-block"></p>
							</div>
						</div>
						<div id="success"></div>
						<!-- For success/fail messages -->
						<button type="button" class="btn btn-primary" id="btLogin">Submit</button>
					</form>
				</div>


			</div>
		</div>
	</div>
</div>
<!-- //Modal1 -->
<div id="availability-agileits">
	<div class="col-md-3 book-form-left-w3layouts">
		<h2>CHECK AVAILABILITY</h2>
	</div>
	<div class="col-md-9 book-form">
		<form action="<c:url value="/accommodation/list" />" method="get">
			<div class="fields-w3ls form-left-agileits-w3layouts ">
				<p>Room Type</p>
				<select class="form-control" name="roomType" id="roomType">
					<option value="">Select a Room</option>
					<option value="Luxury Room">Luxury Room</option>
					<option value="Deluxe Room">Deluxe Room</option>
					<option value="Single Room">Single Room</option>
					<option value="Double Room">Double Room</option>
				</select>
			</div>
			<div class="fields-w3ls form-date-w3-agileits">
				<p>Arrival Date</p>
				<input id="datepicker1" name="startDate" type="text"
					value="Select Date" onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = 'mm/dd/yyyy';}"
					required="">
			</div>
			<div class="fields-w3ls form-date-w3-agileits">
				<p>Departure Date</p>
				<input id="datepicker2" name="endDate" type="text"
					value="Select Date" onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = 'mm/dd/yyyy';}"
					required="">
			</div>

			<div class=" form-left-agileits-submit">
				<input type="submit" value="Check Availability">
			</div>
		</form>
	</div>
	<div class="clearfix"></div>
</div>


<script>
	$(function() {
		$('#btLogin').on('click', function() {
            $.ajax({
				method: 'POST',
                url: '<c:url value="/postLogin" />',
                data: {
                    userName: $('#userName').val(),
                    password: $('#password').val()
                },
                success: function (data) {
                	switch (data) {
                	case "error": $('#success').text('Bad credentials! Please, check your username and password!'); break;
                	case "admin": document.location='<c:url value="/accommodations/all" />'; break;
                	case "normal": document.location='<c:url value="/accommodation/list" />'; break;
                	}
                },
				error: function(r) {
					console.log(r);
				}
            });
		});
	});
</script>



<%@ include file="footer.jsp"%>