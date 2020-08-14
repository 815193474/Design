<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="../static/css/base.css">
<script type="text/javascript" src="../static/js/base.js"></script>
<title>党支部派人谈话记录</title>
</head>
<body>
<div id="box_b">
<!--startprint-->
<div id="form1">
<p id="title">党支部派人谈话记录表一</p>
<table id="table_b" >
<tr><td>入党申请人姓名</td><td>${talk.name }</td><td>单位及职务</td><td colspan="3">${talk.className.className }</td></tr>
<tr><td>谈话人姓名</td><td>${talk.talk_teacher_1 }</td><td>单位及职务</td><td colspan="3"></td></tr>
<tr><td>谈话时间</td><td></td><td>谈话地点</td><td></td><td>记录人</td><td></td></tr>
<tr><td border="" colspan="6" align="left">谈话内容</td></tr>
<tr><td colspan="6"><textarea id="talk_details" ></textarea></td></tr>
<tr><td>入党申请人(签字)</td><td colspan="2"></td><td>谈话人(签字)</td><td colspan="2"></td></tr>
</table>
<!--endprint--> 
<a onclick="showAtRight('../list/talk01?id=${talk.id } ')" href="###" id="load" >查看表二</a>

</div>
<div id="box_r">
<input type="button" onclick="doPrint()" value="打印" id="load"/>
<a href="###" onclick="showAtRight('../export/talk_details?id=${talk.id}&id2=${talk.talk_teacher_1 }&progress=6')" id="load">下载表一Word文件</a>
<a href="../export/talk_details?id=${talk_id }&progress=9" id="load">下载表二Word文件</a>
<a href="../export/talk_insert" id="load">下载空白Word文档</a>
</div>
</div>
</body>
</html>