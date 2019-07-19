<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>MoYun</title>
<meta charset="UTF-8">


<link href="https://fonts.googleapis.com/css?family=Work+Sans"
	rel="stylesheet">
<link rel="stylesheet" href="../resources/css/bootstrap.min.css">
<link rel="stylesheet"
	href="../resources/css/open-iconic-bootstrap.min.css">
<link rel="stylesheet" href="../resources/css/owl.carousel.min.css">
<link rel="stylesheet" href="../resources/css/owl.theme.default.min.css">
<link rel="stylesheet" href="../resources/css/icomoon.css">
<link rel="stylesheet" href="../resources/css/flaticon.css">
<link rel="stylesheet" href="../resources/css/animate.css">
<link rel="stylesheet" href="../resources/css/bootstrap-datepicker.css">
<link rel="stylesheet" href="../resources/css/style.css">
<link rel="stylesheet" href="../resources/css/font-awesome.min.css">

<script src="../resources/js/jquery-3.2.1.min.js"></script>
<script src="../resources/js/popper.min.js"></script>
<script src="../resources/js/bootstrap.min.js"></script>
<script src="../resources/js/owl.carousel.min.js"></script>
<script src="../resources/js/jquery.waypoints.min.js"></script>
<script src="../resources/js/bootstrap-datepicker.js"></script>
<script src="../resources/js/jquery.animateNumber.min.js"></script>
<script src="../resources/js/main.js"></script>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.9/umd/popper.min.js"></script>
<script
	src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

<style type="text/css">
.carousel-inner img {
	width: 100%;
	height: 390px;
}
</style>

</head>
<body>
	<div class="row">
		<div class="col-2"></div>

		<div class="col-8">
			<div id="pic_carousel" class="carousel slide" data-ride="carousel"
				style="margin-top: 2px;">
				<!--指标-->
				<ul class="carousel-indicators">
					<li data-target="#pic_carousel" data-slide-to="0" class="active"></li>
					<li data-target="#pic_carousel" data-slide-to="1"></li>
					<li data-target="#pic_carousel" data-slide-to="2"></li>
				</ul>
				<!--轮播图片-->
				<div class="carousel-inner">

					<div class="carousel-item active">
						<img src="../resources/img/pic1.jpg">
						<div class="carousel-caption"></div>
					</div>
					<div class="carousel-item ">
						<img src="../resources/img/pic2.jpg">
						<div class="carousel-caption"></div>
					</div>
					<div class="carousel-item ">
						<img src="../resources/img/pic3.jpg">
						<div class="carousel-caption"></div>
					</div>
				</div>
				<a class="carousel-control-prev" href="#pic_carousel"
					data-slide="prev"> <span class="carousel-control-prev-icon"></span></a>
				<a class="carousel-control-next" href="#pic_carousel"
					data-slide="next"> <span class="carousel-control-next-icon"></span></a>
			</div>
		</div>
	</div>

	<div class="col-2"></div>
	<div class="row" style="margin-top: 20px;">
		<div class="col-2" style="height: 200px;">
			<div style="width: 272px; height:50px;background-color: pink;margin-left: 1px;"></div>
		</div>
		<div class="col-10" style="height: 300px;">
			<div class="row">
				<div class=col-3 style="background-color: red;height: 100px;">
				</div>
				<div class=col-3 style="background-color: pink;height: 150px;">
				</div>
				<div class=col-3 style="background-color: blue;height: 200px;">
				</div>
				<div class=col-3 style="background-color: pink;height: 250px;">
				</div>
			</div>
		</div>
	</div>
</body>
</html>