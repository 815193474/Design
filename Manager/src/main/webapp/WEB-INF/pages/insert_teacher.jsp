<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>材料生成系统-培养联系人添加页</title>
	<link rel="dao icon"  href="../static/img/favicon.ico" type="image-x.icon"/>
	<link rel="stylesheet" type="text/css" href="../static/css/base.css">
	<style type="text/css">
	
	</style>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="../static/js/base.js"></script>
<script type="text/javascript" src="../static/js/time.js"></script>
<script type="text/javascript">
$(document).ready(function ()
		{ 
	$("#form3").submit(function () 
		    {
		         $.ajax({
      					type: "POST",//方法类型
		               // dataType: "JSON",//预期服务器返回的数据类型
		                url: "../insert/t" ,
		                data: $('#form3').serialize(),
		                success: function (result) {
		                	alert("数据录入成功");
		                    console.log(result);//打印服务端返回的数据(调试用)
		                    if (result.resultCode == 200) {
		                        alert("SUCCESS");
		                    }
		                    ;
		                },
		                error : function() {
		                	alert("数据录入成功");
		                }
		            });
		        //中间做一些ajax数据交互
		         
		         document.getElementById("form3").reset();
		         return false;
		     
		    });

		})
</script>

</head>
<body>
	<div class="container">
		<div class="container-fluid">
			<div class="row">
				<br>
			
				<div class="col-sm-5 col-sm-offset-1">
					<form id="form3" method="post" role="form" >
					<h4>培养联系人信息录入</h4>
					<br>
					<br>
					<div class="input-group">
						<span class="input-group-addon">姓&nbsp;&nbsp;名</span>
						<input id="teacher_n" required="required"  type="text" name="name" class="form-control" autofocus="autofocus">
					</div>
					<br>
					<div class="input-group">
						<span class="input-group-addon">
							职&nbsp;&nbsp;务
						</span>
					<input id="teacher_w" required="required" 	type="text" name="work" placeholder="讲师、主任、院长、组长" class="form-control" >
					</div><br>
					<div class="input-group pull-right">
						<button  type="submit" class="btn btn-primary form-control">submit</button>
					</div>
						<br>
					<br><br><br>
					</form>

				</div>
			</div>
		</div>
	</div>

</body>
</html>
