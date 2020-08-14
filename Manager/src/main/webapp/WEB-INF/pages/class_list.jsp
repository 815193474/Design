<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="../static/css/base.css">
<script type="text/javascript" src="../static/js/base.js"></script>
<script type="text/javascript" src="../static/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
  </script>
</head>
<body>
	
	<div class="container">
		<div class="container-fluid">
			<div class="row">
				<br>
				<div class="col-sm-11 ">
					<table class="table table-bordered table-hover text-nowrap">
						<caption>班级信息</caption>
						<caption><p style="color:green;">Ps：该班级中存在相关人员删除时会出现操作失败</p></caption>
						<thead>
							<tr><td>班级编号</td><td>班级名称</td><td>操作</td></tr>
						</thead>
						<tbody>
							<c:forEach items="${all_class }" var="b" varStatus="status">
							<tr><td>${b.id}</td><td>${b.className }</td>
							<td><a  onclick="showAtRight('../del/class?id=${b.id}')" class="btn-sm btn-danger" >删除</a></td></tr>
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
					<li> 
						<a  id="load_1" href="###" onclick="showAtRight('../list/class?next=${next_p }')" type="text/html">&laquo;</a> 
					</li>
					<li> 
						<a id="load_3" href="###" onclick="showAtRight('../list/class?next=0')" type="text/html">首页</a> 
					</li>
					<li> 
						<a id="load_1" href="###" >共${num_p }页</a>
					</li>
					<li> 
						<a id="load_1" href="###" >共${num_b }条</a>
					</li>
					<li>
					 <a id="load_1" href="###" onclick="showAtRight('../list/class?next=${next_n}')" type="text/html">&raquo;</a>
					</li>
				</ul>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
