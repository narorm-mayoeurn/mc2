<%@ include file="header.jsp" %>


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



<div class="plans-section" id="rooms">
    <div class="container">
        <h3 class="title-w3-agileits title-black-wthree">Rooms And Rates</h3>
        <div class="priceing-table-main">

            <c:forEach items="${rooms}" var="room">

            <div class="col-md-3 price-grid">
                <div class="price-block agile">
                    <div class="price-gd-top">
                        <img src="<c:url value="/resource/images/${room.image}" />" alt=" " class="img-responsive" />
                        <h4>${room.accommodation.name}</h4>
                    </div>
                    <div class="price-gd-bottom">
                        <div class="price-list">
                            <div>${room.type}</div>
                            <ul>
                                <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                <li><i class="fa fa-star-o" aria-hidden="true"></i></li>

                            </ul>
                        </div>
                        <div class="price-selet">
                            <h3><span>$</span>${room.price}</h3>
                            <a href="<c:url value="/booking/${room.id}" />" class="scroll" >Book Now</a>
                        </div>
                    </div>
                </div>
            </div>
            </c:forEach>


            <div class="clearfix"> </div>
        </div>
    </div>
</div>



<%@ include file="footer.jsp" %>
