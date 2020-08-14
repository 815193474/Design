<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>材料生成系统-审批时间录入</title>
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
		                url: "../insert/batch" ,
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
		                	alert("数据录入出错");
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
				<div class="col-sm-5 col-sm-offset-1">
				
					<br>
					<h4>添加录入批次</h4><br>
					<p style="color:green;">Ps:批次按照时间生成，如2019年第一批，填入2019-01即可</p><br>
					<form role="form" id="form3">
						<div class="input-group">
							<span class="input-group-addon">输入批次号</span>
							<input type="text"  required="required" name="batch_id" autofocus="autofocus" placeholder="例:2019-01" class="form-control">
						</div>
						<br>
						<div class="input-group pull-right">
							<button type="submit" class="btn btn-primary"  id="sub" class="form-control">submit</button>
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