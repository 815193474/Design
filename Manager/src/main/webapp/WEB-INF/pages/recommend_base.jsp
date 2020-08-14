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
</head>
<body>
<div id="box_b">
<div id="form1">
<p id="title">入党积极分子确认及备案登记表</p>
<table id="table_b">
<tr><td id="td01"></td><td id="td01"></td><td id="td01"></td><td id="td01"></td><td id="td01"></td><td id="td01"></td></tr>
<tr>
<td>被推荐人姓  名</td><td>${recommend_name }</td><td>工作单位及职务</td><td colspan="3">${className }</td>
</tr>
<tr>
<td rowspan="3">党员推荐或群团组织推优情况</td><td rowspan="3" colspan="5"></td>
</tr>
<tr></tr>
<tr></tr>
<tr>
<td rowspan="4">支委会（党员大会）确定入党积极分子意见</td><td id="td03" rowspan="2" colspan="5">党支部书记（签章）：</td>
</tr>
<tr></tr>
<tr><td id="td02" rowspan="2" colspan="5">年 &nbsp;&nbsp;&nbsp;月&nbsp;&nbsp;&nbsp; 日</td></tr>
<tr></tr>
<tr>
<td rowspan="4">党总支审议入党积极分子意见</td><td id="td03" rowspan="2" colspan="5">党总支书记（签章）：</td>
</tr>
<tr></tr>
<tr><td id="td02" rowspan="2" colspan="5">年 &nbsp;&nbsp;&nbsp;月&nbsp;&nbsp;&nbsp; 日</td></tr>
<tr></tr>

<tr>
<td rowspan="5">党（工）委备案意见</td><td id="td03" rowspan="3" colspan="5">党（工）委名称（盖章）：</td>
</tr>
<tr></tr>
<tr></tr>
<tr><td id="td02" rowspan="2" colspan="5">年 &nbsp;&nbsp;&nbsp;月&nbsp;&nbsp;&nbsp; 日</td></tr>
<tr></tr>
<tr></tr>
</table>
</div>
<div id="box_r">
<a  id="load" method="post" onclick="showAtRight('../print/base_details?name=${name }')" href="###" >打印word文件</a>
 <a  id="load" onclick="showAtRight('../export/base_details?id=${b.id }')" href="###">点击生成word文件</a>
</div> 
</div> 
</body>
</html>