<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
           <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
	<title>党员管理系统</title>
	<meta http-equiv="Content-Type" Content="text/html; charset=utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<link rel="dao icon"  href="../static/img/favicon.ico" type="image-x.icon"/>
	<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="../static/css/index.css">
	<link rel="stylesheet" type="text/css" href="../static/css/footer.css">
	<link rel="stylesheet" type="text/css" href="../static/css/base.css">
</head>
<script type="text/javascript">
	//初始化
	window.onload=function(){
		var btnLogin = document.getElementById("btnLogin");
		//为登录按钮添加事件
		btnLogin.onclick=function(){
			Login();
		};

	}
	function Login(){
		var username=document.getElementById("username");
		var password = document.getElementById("password");
		var yan = document.getElementById("yan");
		var type = document.getElementById("type");

		$.ajax({
			type: "POST",
			url: "../login/TYPE",
			data: "username="+username.value+"&password="+password.value+"&yan="+yan.value+"&type="+type.value,
			dataType:"text",

			success: function (data) {
				if(data!=null&&data=="super"){
					alert("登录成功,即将跳转个人首页");
					window.location.href="../login/super";
				}else if (data!=null&&data=="admin") {
					alert("登录成功,即将跳转个人首页");
					window.location.href="../login/admin";
				}else if (data!=null&&data=="league") {
					alert("登录成功,即将跳转个人首页");
					window.location.href="../login/league";

				}else {
					alert(data);
				}


			}
		});




	}

</script>
<body>
<div class="container-fluid main" id="main" style="padding: 0">
	<nav class="navbar navbar-default">
		<div class="container-fluid nav-con">
			<div class="navbar-header">
				<a class="navbar-brand" href="#" style="padding-top: 2rem;color: #EDEDED">
					<span style="font-size: 2.3rem;padding-right: 2rem;letter-spacing: 2px">党员管理系统</span>
				</a>
			</div>
		</div>
	</nav>
	<div class="col-md-7 col-xs-1"></div>
	<div class="col-md-3 col-xs-10 logindiv">
		<div class="login-h">
			<h3 class="loginh">
				登 录
			</h3>
		</div>
		<form class="form-horizontal login-f">
			<div class="form-group">
				<label for="username" class="col-sm-2 control-label">Username</label>
				<div class="col-md-12 col-xs-12">
					<input type="text" class="form-control forminput" id="username" placeholder="账号 Account">
				</div>
			</div>
			<div class="form-group">
				<label for="password" class="col-sm-2 control-label">Password</label>
				<div class="col-md-12 col-xs-12">
					<input type="password" class="form-control forminput" id="password" placeholder="密码 Password">
				</div>
			</div>
			<div class="form-group">
				<label for="type" class="col-sm-2 control-label">Password</label>
				<div class="col-md-12 col-xs-12">

					<select class="form-control forminput" id="type" >
						<option value="superadmin">超级管理员</option>
						<option value="admin">管理员</option>
						<option value="league">团支书</option>
					</select>
				</div>
			</div>
			<div class="form-group">
				<label for="yan" class="col-sm-2 control-label">Code</label>
				<div class="col-md-7 col-xs-7">

					<input type="text" class="form-control forminput inputcode" id="yan" placeholder="验证码 code">
				</div>
				<div class="col-md-5 col-xs-5" style="padding-left:0">
					<img class="code" id="code" src="${pageContext.request.contextPath}/util/u" onclick="changeImg()">
				</div>
			</div>
			<div class="form-group ">
				<div class="col-sm-6 col-sm-offset-3"><br>
					<button type="button" id="btnLogin" class=" form-control btn loginbtn " style="transition: all 0.6s;" >登 录</button>
				</div>
			</div>
		</form>
	</div>
</div>
</div>
<footer class="bs-docs-footer">
	<div class="col-md-12">
		<p>

			<a href="#">Copyright © VX:a815193474 All Rights Reserved</a><br>
			<a rel="nofollow" href="http://www.beian.miit.gov.cn" target="_blank">陇ICP备19003156号</a>
		</p>

	</div>
</footer>


</body>
</html>
<script>
	function changeImg() {
		document.getElementById("code").src="${pageContext.request.contextPath}/util/u?"+Math.random();
		//在末尾加Math.random()的作用：<br>如果两次请求地址一样，服务器只会处理第一次请求，第二次请求返回内容和第一次一样。或者说如果地址相同，第一次请求时，将自动缓存，导致第二次不会重复请求了。Math.random()是调用javascript语法中的数学函数，能够产生随机数。<br>末尾加Math.random()使每次请求地址不相同，服务器每次都去做不同的响应。也可以使用new date()时间戳的形式作为参数传递。
	}
</script>


