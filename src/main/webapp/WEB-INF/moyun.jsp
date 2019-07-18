<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title></title>
<meta charset="utf-8">

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

<style type="text/css">
a {
	margin: 5px;
}

li {
	width: 274.3px;
	height: 60px;
	font-weight: bold;
	background-color: #707071;
}

li:hover {
	background-color: #343A40 !important;
}

img {
	width: 30px;
	height: 30px;
}

span {
	font-family: Microsoft Yahei;
}

div:hover {
	color: black;
}
</style>

</head>
<body>

	<div style="height: 60px; width: 101%; margin-top: 20px;" class="row">
		<div class="col-2" style="margin-top: -20px;">
			<span style="font-size: 42.5px; font-weight: bold; color: #343A40;">MoYun</span>
		</div>
		<div class="col-6" style="text-align: right;">
			<input style="width: 88%; height: 30px; margin-right: -70px;"
				class="btn btn-dark" placeholder="search  information..." />
		</div>
		<div class="col-3" style="text-align: left;">
			<input type="button" style="margin-top: 1px; margin-left: 60px;"
				class="btn btn-outline-dark btn-sm" value="查询"></input>
		</div>
		<div class="col-1" style="float: right;">
			<input id="login" type="button"
				style="margin-left: 13px; margin-top: -8px;"
				class="btn btn-outline-dark" value="登录|注册" onclick="ck()"></input>
			<script type="text/javascript">
				function ck() {
					$("#login").attr("style", "display:none;");
				};
			</script>
		</div>
	</div>

	<nav
		class="navbar navbar-expand-lg navbar-dark bg-dark probootstrap-navbar-dark row"
		style="text-align: center;">
		<div>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#probootstrap-nav" aria-controls="probootstrap-nav"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="probootstrap-nav"
				style="width: 101%; backtext-align: center; margin-left: 3px;">
				<ul id="menu" class="navbar-nav mr-auto">
					<li id="kind" class="nav-item active"
						style="background-color: #343A40" onmouseenter="sk(this.id)"
						onmouseleave="hk(this.id)"><a name="kind" href="#"
						class="nav-link" onclick="changebackground(this.name)">作品分类</a></li>
					<li id="all" class="nav-item active"><a name="all" href="./kindNuSum.do" target="FrameName"
						class="nav-link" onclick="changebackground(this.name)">全部作品</a></li>
					<li id="order" class="nav-item active"><a name="order"
						href="#" class="nav-link" onclick="changebackground(this.name)">排行</a></li>
					<li id="finish" class="nav-item active"><a name="finish"
						href="#" class="nav-link" onclick="changebackground(this.name)">完本</a></li>
					<li id="free" class="nav-item active"><a name="free" href="#"
						class="nav-link" onclick="changebackground(this.name)">免费</a></li>
					<li id="author" class="nav-item active"><a name="author"
						href="#" class="nav-link" onclick="changebackground(this.name)">作者专区</a></li>
					<li id="discuss" class="nav-item active"><a name="discuss"
						href="#" class="nav-link" onclick="changebackground(this.name)">个人中心</a></li>
				</ul>
				<script type="text/javascript">
				
					/* if($("#novelkind").is(":hidden")){
					    alert()
					}else{
					    alert()
					} */
					
					function sk(id) {
						var color = document.getElementById(id).style.backgroundColor;
						if(color!="rgb(52, 58, 64)"){
							$("#novelkind").show(500)
						}
					};
					
					function hk(id) {
						var x=event.clientX;
					    var y=event.clientY;
						if( x > 1 && x < 247 && y < 550 && y > 95){
					    	/* clearTimeout(timer) */
					    	$("#novelkind").show()
					    }else{
					    	$("#novelkind").hide(500)						    	
					    }
					};
						
					function nh() {
						var color = document.getElementById("kind").style.backgroundColor;
						if(color!="rgb(52, 58, 64)"){
							$("#novelkind").hide(500)
						}
					};
				
					function changebackground(id) {
						$('#' + id).css({
							background : "#343A40"
						});
						if (id == 'kind') {
							$("#novelkind").show(500)
						} else {
							$("#novelkind").hide(500)
						}
						if (id != 'kind') {
							$('#kind').css({
								background : "#707071"
							});
						}
						if (id != 'all') {
							$('#all').css({
								background : "#707071"
							})
						}
						if (id != 'order') {
							$('#order').css({
								background : "#707071"
							});
						}
						if (id != 'finish') {
							$('#finish').css({
								background : "#707071"
							});
						}
						if (id != 'free') {
							$('#free').css({
								background : "#707071"
							});
						}
						if (id != 'author') {
							$('#author').css({
								background : "#707071"
							});
						}
						if (id != 'discuss') {
							$('#discuss').css({
								background : "#707071"
							});
						}
					};
				</script>
			</div>
		</div>
	</nav>
	<div>
		<iframe id="FrameId" name="FrameName" scrolling="no" frameborder="0"
			width="100%"></iframe>
		<div id="novelkind" onmouseleave="nh()"
			style="width: 273.3px; margin-left: 1px; background-color: #343A40; opacity: 0.9; margin-top: -155px; position: absolute; z-index: 999">
			<div class="row" style="height: 65px;">
				<div class="col-sm-6">
					<div class="row" style="color: white; margin: 2px 0px 0px 2px;">
						<div class="col-sm-4" style="margin-top: -12px;">
							<a style="font-size: 45px; margin-left: -7px;"
								href="../novel/login.do?" target="FrameName">♖</a>
						</div>
						<div class="col-sm-8">
							<span style="font-size: 15px;">都市</span><br>
							<p style="font-size: 15px;">${kindNu[0]}</p>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="row" style="color: white; margin: 2px 2px 0px 0px;">
						<div class="col-sm-4" style="margin-top: -13px;">
							<a style="font-size: 45px; margin-left: -1px;"
								href="../novel/login.do?" target="FrameName">⚘</a>
						</div>
						<div class="col-sm-8">
							<span style="font-size: 15px;">科幻</span><br>
							<p style="font-size: 15px;">${kindNu[1]}</p>
						</div>
					</div>
				</div>
			</div>
			<div class="row" style="height: 65px;">
				<div class="col-sm-6">
					<div class="row" style="color: white; margin: 2px 0px 0px 2px;">
						<div class="col-sm-4" style="margin-top: -10px;">
							<a style="font-size: 40px; margin-left: -2.5px;"
								href="../novel/login.do?" target="FrameName">✤</a>
						</div>
						<div class="col-sm-8">
							<span style="font-size: 15px;">历史</span><br>
							<p style="font-size: 15px;">${kindNu[2]}</p>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="row" style="color: white; margin: 2px 2px 0px 0px;">
						<div class="col-sm-4" style="margin-top: -14px;">
							<a style="font-size: 42px; margin-left: -5px;"
								href="../novel/login.do?" target="FrameName">✯</a>
						</div>
						<div class="col-sm-8">
							<span style="font-size: 15px;">现实</span><br>
							<p style="font-size: 15px;">${kindNu[3]}</p>
						</div>
					</div>
				</div>
			</div>
			<div class="row" style="height: 65px;">
				<div class="col-sm-6">
					<div class="row" style="color: white; margin: 2px 0px 0px 2px;">
						<div class="col-sm-4" style="margin-top: -12px;">
							<a style="font-size: 45px; margin-left: -2px;"
								href="../novel/login.do?" target="FrameName">❦</a>
						</div>
						<div class="col-sm-8">
							<span style="font-size: 15px;">青春</span><br>
							<p style="font-size: 15px;">${kindNu[4]}</p>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="row" style="color: white; margin: 2px 2px 0px 0px;">
						<div class="col-sm-4" style="margin-top: -10px;">
							<a style="font-size: 40px; margin-left: -5px;"
								href="../novel/login.do?" target="FrameName">☯</a>
						</div>
						<div class="col-sm-8">
							<span style="font-size: 15px;">武侠</span><br>
							<p style="font-size: 15px;">${kindNu[5]}</p>
						</div>
					</div>
				</div>
			</div>
			<div class="row" style="height: 65px;">
				<div class="col-sm-6">
					<div class="row" style="color: white; margin: 2px 0px 0px 2px;">
						<div class="col-sm-4" style="margin-top: 2px;">
							<a style="font-size: 28px; margin-left: 2px;"
								href="../novel/login.do?" target="FrameName">卍</a>
						</div>
						<div class="col-sm-8">
							<span style="font-size: 15px;">仙侠</span><br>
							<p style="font-size: 15px;">${kindNu[6]}</p>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="row" style="color: white; margin: 2px 2px 0px 0px;">
						<div class="col-sm-4" style="margin-top: -8px;">
							<a style="font-size: 37px; margin-left: -4px;"
								href="../novel/login.do?" target="FrameName">☣</a>
						</div>
						<div class="col-sm-8">
							<span style="font-size: 15px;">玄幻</span><br>
							<p style="font-size: 15px;">${kindNu[7]}</p>
						</div>
					</div>
				</div>
			</div>
			<div class="row" style="height: 65px;">
				<div class="col-sm-6">
					<div class="row" style="color: white; margin: 2px 0px 0px 2px;">
						<div class="col-sm-4" style="margin-top: -2px;">
							<a style="font-size: 33px; margin-left: 0px;"
								href="../novel/login.do?" target="FrameName">☠</a>
						</div>
						<div class="col-sm-8">
							<span style="font-size: 15px;">悬疑</span><br>
							<p style="font-size: 15px;">${kindNu[8]}</p>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="row" style="color: white; margin: 2px 2px 0px 0px;">
						<div class="col-sm-4" style="margin-top: -10px;">
							<a style="font-size: 40px; margin-left: -1px;"
								href="../novel/login.do?" target="FrameName">♤</a>
						</div>
						<div class="col-sm-8">
							<span style="font-size: 15px;">游戏</span><br>
							<p style="font-size: 15px;">${kindNu[9]}</p>
						</div>
					</div>
				</div>
			</div>
			<div class="row" style="height: 65px;">
				<div class="col-sm-6">
					<div class="row" style="color: white; margin: 2px 0px 0px 2px;">
						<div class="col-sm-4" style="margin-top: -20px;">
							<a style="font-size: 40px; margin-left: 2px;"
								href="../novel/login.do?" target="FrameName">ღ</a>
						</div>
						<div class="col-sm-8">
							<span style="font-size: 15px;">言情</span><br>
							<p style="font-size: 15px;">${kindNu[10]}</p>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="row" style="color: white; margin: 2px 2px 0px 0px;">
						<div class="col-sm-4" style="margin-top: -4px;">
							<a style="font-size: 30px; margin-left: -1px;"
								href="../novel/login.do?" target="FrameName">の</a>
						</div>
						<div class="col-sm-8">
							<span style="font-size: 15px;">轻小说</span><br>
							<p style="font-size: 15px;">${kindNu[11]}</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>