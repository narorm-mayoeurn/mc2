<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>MC2 Booking - an accommodation onling booking platform</title>
    <!-- for-mobile-apps -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="MC2 Booking - an accommodation onling booking platform" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
    function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- //for-mobile-apps -->
    <link href="<c:url value="/resource/css/bootstrap.css" />" rel="stylesheet" type="text/css" media="all" />
    <link href="<c:url value="/resource/css/font-awesome.css" />" rel="stylesheet">
    <link rel="stylesheet" href="<c:url value="/resource/css/chocolat.css" />" type="text/css" media="screen">
    <link href="<c:url value="/resource/css/easy-responsive-tabs.css" />" rel='stylesheet' type='text/css'/>
    <link rel="stylesheet" href="<c:url value="/resource/css/flexslider.css" />" type="text/css" media="screen" property="" />
    <link rel="stylesheet" href="<c:url value="/resource/css/jquery-ui.css" />" />
    <link href="<c:url value="/resource/css/style.css" />" rel="stylesheet" type="text/css" media="all" />
    <script type="text/javascript" src="<c:url value="/resource/js/modernizr-2.6.2.min.js" />"></script>
    <!--fonts-->
    <link href="//fonts.googleapis.com/css?family=Oswald:300,400,700" rel="stylesheet">
    <link href="//fonts.googleapis.com/css?family=Federo" rel="stylesheet">
    <link href="//fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">
    <!--//fonts-->
</head>
<body>
<!-- header -->
<div class="banner-top">
    <div class="social-bnr-agileits">
        <ul class="social-icons3">
            <li><a href="#" class="fa fa-facebook icon-border facebook"> </a></li>
            <li><a href="#" class="fa fa-twitter icon-border twitter"> </a></li>
            <li><a href="#" class="fa fa-google-plus icon-border googleplus"> </a></li>
            <li><a href="#" class="fa fa-rss icon-border rss"> </a></li>
        </ul>
    </div>
    <div class="contact-bnr-w3-agile">
        <ul>
            <li><i class="fa fa-envelope" aria-hidden="true"></i><a href="mailto:info@example.com">mc2ea.mum.edu@gmail.com</a></li>
            <li><i class="fa fa-phone" aria-hidden="true"></i>+1 (100)222-23-33</li>
            <li class="s-bar">
                <div class="search">
                    <input class="search_box" type="checkbox" id="search_box">
                    <label class="icon-search" for="search_box"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></label>
                    <div class="search_form">
                        <form action="#" method="post">
                            <input type="search" name="Search" placeholder=" " required=" " />
                            <input type="submit" value="Search">
                        </form>
                    </div>
                </div>
            </li>
        </ul>
    </div>
    <div class="clearfix"></div>
</div>





<div class="w3_navigation">
    <div class="container">
        <nav class="navbar navbar-default">
            <div class="navbar-header navbar-left">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <h1><a class="navbar-brand" href="<c:url value="/" />">MC2 <span>BOOKING</span><p class="logo_w3l_agile_caption">Your Dreamy Resort</p></a></h1>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse navbar-right" id="bs-example-navbar-collapse-1">
                <nav class="menu menu--iris">
                    <ul class="nav navbar-nav menu__list">
                        <li class="menu__item menu__item--current"><a href="index.html" class="menu__link">Home</a></li>
                        <li class="menu__item"><a href="#about" class="menu__link scroll">About</a></li>
                        <%--<li class="menu__item"><a href="#team" class="menu__link scroll">Team</a></li>--%>
                        <li class="menu__item"><a href="#gallery" class="menu__link scroll">Gallery</a></li>
                        <li class="menu__item"><a href="#rooms" class="menu__link scroll">Rooms</a></li>
                        <li class="menu__item"><a href="#contact" class="menu__link scroll">Contact Us</a></li>
                    </ul>
                </nav>
            </div>
        </nav>

    </div>
</div>
<!-- /header -->









