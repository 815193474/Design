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
$(document).ready(function ()
		{ 
	$("#form2").submit(function () 
		    {
		         $.ajax({
		            //几个参数需要注意一下
		                type: "POST",//方法类型
		                dataType: "JSON",//预期服务器返回的数据类型
		                url: "../insert/talk" ,//url
		                data: $('#form2').serialize(),
		                success: function (result) {
		                    console.log(result);//打印服务端返回的数据(调试用)
		                    if (result.resultCode == 200) {
		                        alert("SUCCESS");
		                    }
		                    ;
		                },
		                error : function() {
		                    alert("数据录入成功");
		                    return false;
		                }
		            });
		        //中间做一些ajax数据交互
		      
		     
		    });

		})
</script>
<title>党支部派人谈话录</title>
</head>
<body>

<div id="box_b">
<!--startprint-->
<div id="form1">
<p id="title01">党支部派人谈话录入表</p>
<form action="###" id="form2" method="post">
<table id="table_b" >
<tr style="display:none;"><td><input type="text" name="id" value="${talk_id }"/><td></tr>
<tr><td>入党申请人姓名</td><td><input readonly = "readonly" type="text" name="name_b"  value="${talk_name_b }"/></td><td>单位及职务</td><td colspan="3"><input required="required" type="text" name="post_b" autofocus="autofocus"/></td></tr>
<tr><td>谈话人姓名</td><td><input type="text" required="required" name="name_t" /></td><td>单位及职务</td><td colspan="3"><input type="text" name="post_t" required="required"/></td></tr>
<tr><td>谈话时间</td><td><input type="text" name="time" required="required"/></td><td>谈话地点</td><td><input type="text" required="required" name="talk_address"/></td><td>记录人</td><td><input type="text" name="recorder" required="required"/></td></tr>
<tr><td  colspan="6">谈话内容</td></tr>
<tr><td colspan="6"><textarea required="required" name="talk_details" id="talk_details"> </textarea></td></tr>
</table>
<!--endprint--> 
<input type="submit" value="确认提交" id="sub01">
</form>
</div>
<div id="box_r_t">
<a onclick="showAtRight('../export/talk_insert')" href="###" id="load">下载空白Word文档</a>
</div>
</div>
</body>
</html>