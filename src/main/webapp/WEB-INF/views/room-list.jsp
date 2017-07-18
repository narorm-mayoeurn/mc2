<%@ include file="header.jsp" %>


<div id="availability-agileits">
    <div class="col-md-3 book-form-left-w3layouts">
        <h2>CHECK AVAILABILITY</h2>
    </div>
    <div class="col-md-9 book-form">
        <form action="#" method="post">
            <div class="fields-w3ls form-left-agileits-w3layouts ">
                <p>Room Type</p>
                <select class="form-control">
                    <option>Select a Room</option>
                    <option>Luxury Room</option>
                    <option>Deluxe Room</option>
                    <option>Single Room</option>
                    <option>Double Room</option>
                </select>
            </div>
            <div class="fields-w3ls form-date-w3-agileits">
                <p>Arrival Date</p>
                <input  id="datepicker1" name="Text" type="text" value="Select Date" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'mm/dd/yyyy';}" required="">
            </div>
            <div class="fields-w3ls form-date-w3-agileits">
                <p>Departure Date</p>
                <input  id="datepicker2" name="Text" type="text" value="Select Date" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'mm/dd/yyyy';}" required="">
            </div>

            <div class=" form-left-agileits-submit">
                <input type="submit" value="Check Availability">
            </div>
        </form>
    </div>
    <div class="clearfix"> </div>
</div>



<div class="plans-section" id="rooms">
    <div class="container">
        <h3 class="title-w3-agileits title-black-wthree">Rooms And Rates</h3>
        <div class="priceing-table-main">
            <div class="col-md-3 price-grid">
                <div class="price-block agile">
                    <div class="price-gd-top">
                        <img src="<c:url value="/resource/images/r1.jpg" />" alt=" " class="img-responsive" />
                        <h4>Deluxe Room</h4>
                    </div>
                    <div class="price-gd-bottom">
                        <div class="price-list">
                            <ul>
                                <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                <li><i class="fa fa-star-o" aria-hidden="true"></i></li>

                            </ul>
                        </div>
                        <div class="price-selet">
                            <h3><span>$</span>320</h3>
                            <a href="#availability-agileits" class="scroll" >Book Now</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-3 price-grid ">
                <div class="price-block agile">
                    <div class="price-gd-top">
                        <img src="<c:url value="/resource/images/r2.jpg" />" alt=" " class="img-responsive" />
                        <h4>Luxury Room</h4>
                    </div>
                    <div class="price-gd-bottom">
                        <div class="price-list">
                            <ul>
                                <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                <li><i class="fa fa-star-o" aria-hidden="true"></i></li>
                            </ul>
                        </div>
                        <div class="price-selet">
                            <h3><span>$</span>220</h3>
                            <a href="#availability-agileits" class="scroll" >Book Now</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-3 price-grid lost">
                <div class="price-block agile">
                    <div class="price-gd-top">
                        <img src="<c:url value="/resource/images/r3.jpg" />" alt=" " class="img-responsive" />
                        <h4>Guest House</h4>
                    </div>
                    <div class="price-gd-bottom">
                        <div class="price-list">
                            <ul>
                                <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                <li><i class="fa fa-star-o" aria-hidden="true"></i></li>
                                <li><i class="fa fa-star-o" aria-hidden="true"></i></li>
                            </ul>
                        </div>
                        <div class="price-selet">
                            <h3><span>$</span>180</h3>
                            <a href="#availability-agileits" class="scroll" >Book Now</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-3 price-grid wthree lost">
                <div class="price-block agile">
                    <div class="price-gd-top ">
                        <img src="<c:url value="/resource/images/r4.jpg" />" alt=" " class="img-responsive" />
                        <h4>Single Room</h4>
                    </div>
                    <div class="price-gd-bottom">
                        <div class="price-list">
                            <ul>
                                <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                <li><i class="fa fa-star" aria-hidden="true"></i></li>
                                <li><i class="fa fa-star-o" aria-hidden="true"></i></li>
                                <li><i class="fa fa-star-o" aria-hidden="true"></i></li>
                                <li><i class="fa fa-star-o" aria-hidden="true"></i></li>
                            </ul>
                        </div>
                        <div class="price-selet">
                            <h3><span>$</span> 150</h3>
                            <a href="#availability-agileits" class="scroll" >Book Now</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="clearfix"> </div>
        </div>
    </div>
</div>



<%@ include file="footer.jsp" %>
