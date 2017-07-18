<%@ include file="header.jsp" %>

<section class="contact-w3ls" id="contact">
    <div class="container">
        <div class="col-lg-6 col-md-6 col-sm-12 col-lg-offset-3 col-md-offset-3 contact-w3-agile2" data-aos="flip-left">
            <div class="contact-agileits bg-blue">
                <h4>Booking Form</h4>

                <form:form action="/booking/${id}" method="post" name="sentMessage" id="contactForm" novalidate="novalidate">
                    <div class="control-group form-group">
                        <div class="controls">
                            <label class="contact-p1">Arrival Date:</label>
                            <input type="text" class="form-control" name="startDate" id="startDate" required data-validation-required-message="Please enter your arrival date.">
                            <p class="help-block"></p>
                        </div>
                    </div>
                    <div class="control-group form-group">
                        <div class="controls">
                            <label class="contact-p1">Departure Date:</label>
                            <input path="endDate" class="form-control" name="endDate" id="endDate" required data-validation-required-message="Please enter your departure date.">
                            <p class="help-block"></p>
                        </div>
                    </div>

                    <div id="success"></div>
                    <!-- For success/fail messages -->
                    <button type="submit" class="btn btn-primary">Book</button>
                </form:form>
            </div>
        </div>

        <div class="clearfix"></div>
    </div>
</section>


<%@ include file="footer.jsp" %>
