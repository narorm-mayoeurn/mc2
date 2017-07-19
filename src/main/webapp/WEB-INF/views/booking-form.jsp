<%@ include file="header.jsp" %>

<section class="contact-w3ls" id="contact">
    <div class="container">

        <div class="col-lg-6 col-md-6 col-sm-12">
            <div class="contact-agileits">
                <h4>${accommodation.name}</h4>

                <div class="row">
                    <div class="col-lg-4 col-md-4 col-sm-12">
                        <img src="<c:url value="/resource/images/${accommodation.rooms[0].image}" />" style="width:100%;" />
                    </div>

                    <div class="col-lg-6 col-md-6 col-sm-12">
                        <p style="color:#fff;">
                            Price: <span>$</span> 150<br/>
                            Room Number: 199
                            Address: 100N, Fairfield, IA
                        </p>
                    </div>
                </div>

            </div>
        </div>

        <div class="col-lg-6 col-md-6 col-sm-12 contact-w3-agile2" data-aos="flip-left">
            <div class="contact-agileits bg-blue">
                <h4>Booking Form</h4>

                <form action="<c:url value="/booking/${roomId}" />" name="booking" id="booking" method="post">

                    <div class="control-group form-group">
                        <div class="controls">
                            <label class="contact-p1">Arrival Date:</label>
                            <input type="text" class="form-control datepicker" name="startDate" id="startDate" required data-validation-required-message="Please enter your arrival date.">
                            <p class="help-block"></p>
                        </div>
                    </div>
                    <div class="control-group form-group">
                        <div class="controls">
                            <label class="contact-p1">Departure Date:</label>
                            <input path="endDate" class="form-control datepicker" name="endDate" id="endDate" required data-validation-required-message="Please enter your departure date.">
                            <p class="help-block"></p>
                        </div>
                    </div>

                    <div id="success"></div>
                    <!-- For success/fail messages -->
                    <button type="submit" class="btn btn-primary">Book</button>

                </form>
            </div>
        </div>

        <div class="clearfix"></div>
    </div>
</section>


<%@ include file="footer.jsp" %>
