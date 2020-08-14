<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>材料生成系统-录入批次信息</title>
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

</head>
<body>
	
	<div class="container">
		<div class="container-fluid">
			<div class="row">
				<br>
				<div class="col-sm-11">
					<table class="table table-bordered table-hover text-nowrap">
						<caption>录入批次信息</caption>
						<caption style="color:green;">Ps：该批次中存在相关人员删除时会出现操作失败</caption>
						<thead>
							<tr><td>编号</td><td>批次号码</td><td>操作</td></tr>
						</thead>
						<tbody>
							<c:forEach items="${batch }" var="b" varStatus="status">
							<tr><td>${status.index+n+1}</td><td>${b.batch_id }</td>
							<td><a class="btn-sm btn-danger" onclick="showAtRight('../del/batch?batch_id=${b.batch_id}')" >删除</a>
									</td>
							</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>

				<div class="row">
				<div class="col-sm-6 col-sm-offset-4">
					<br>
					<br>
				<ul class="pagination">
					<li> <a  id="load_1" href="###" onclick="showAtRight('../list/batch?next=${next_p }')" type="text/html">&laquo;</a> </li>
					<li> <a id="load_2" href="###" onclick="showAtRight('../list/batch?next=0')" type="text/html">首页</a></li>
					<li> <a id="load_1" href="###" >共${num_p }页</a></li>
					<li> <a id="load_1" href="###" >共${num_b }条</a></li>
					<li> <a id="load_1" href="###" onclick="showAtRight('../list/batch?next=${next_n}')" type="text/html">&raquo;</a></li>
				</ul>
				</div>
			</div>
		</div>
	</div>

</body>
</html>