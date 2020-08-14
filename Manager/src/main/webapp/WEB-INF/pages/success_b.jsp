<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>材料生成系统-入党信息表</title>
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
      <div class=" col-sm-11 ">
        <table class="table table-bordered table-hover text-nowrap">
          <caption>基本信息表</caption>
          <thead>
           <tr>
              <td>姓名</td>
            <td>性别</td>
            <td>民族</td>
            <td>出生年月</td>
            <td>籍贯</td>
           </tr>
          </thead>
          <tbody>
            <tr>
              <td>${b.name }</td>
              <td>${b.sex }</td>
              <td>${b.nation }</td>
              <td>${b.birthday }</td>
              <td>${b.nativePlace }</td>
            </tr>
          </tbody>
          <thead>
            <tr>
              <td>参加工作时间</td>
              <td>入团时间</td>
              <td>申请入党时间</td>
              <td>学历</td>
              <td >身份证号码</td>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>${b.entryWorkTime }</td>
              <td>${b.entryPartyTime }</td>
              <td>${b.applyTime }</td>
              <td>${b.education }</td>
              <td>${b.idCardNumber }</td>
            </tr>
          </tbody>
          <thead>
            <tr>
              <td colspan="4">自何年何月至何年何月在何地、何单位、任何职</td>
              <td>证明人</td>
            </tr>
          </thead>
          <tbody>
            <tr><td colspan="4">${b.resume.workExperience_0 }</td><td>${b.resume.name_0 }</td></tr>
              <tr><td colspan="4">${b.resume.workExperience_1 }</td><td>${b.resume.name_1 }</td></tr>
              <tr><td colspan="4">${b.resume.workExperience_2 }</td><td>${b.resume.name_2 }</td></tr>
              <tr><td colspan="4">${b.resume.workExperience_3 }</td><td>${b.resume.name_3 }</td></tr>
              <tr><td colspan="4">${b.resume.workExperience_4 }</td><td>${b.resume.name_4 }</td></tr>
              <tr><td colspan="4">${b.resume.workExperience_5 }</td><td>${b.resume.name_5 }</td></tr>

          </tbody>
          <thead>
            <tr>
              <td >关系</td><td>姓名</td><td>政治面貌</td><td>单位及职务</td>
            </tr>
          </thead>
          <tbody>
            <tr><td >${b.family.relative_0}</td><td>${b.family.name_0 }</td><td>${b.family.politicalLandscape_0 }</td><td colspan="2">${b.family.post_0 }</td></tr>
            <tr><td >${b.family.relative_1}</td><td>${b.family.name_1 }</td><td>${b.family.politicalLandscape_1 }</td><td colspan="2">${b.family.post_1 }</td></tr>
            <tr><td >${b.family.relative_2}</td><td>${b.family.name_2 }</td><td>${b.family.politicalLandscape_2 }</td><td colspan="2">${b.family.post_2 }</td></tr>
            <tr><td >${b.family.relative_3}</td><td>${b.family.name_3 }</td><td>${b.family.politicalLandscape_3 }</td><td colspan="2">${b.family.post_3 }</td></tr>
            <tr><td >${b.family.relative_4}</td><td>${b.family.name_4 }</td><td>${b.family.politicalLandscape_4 }</td><td colspan="2">${b.family.post_4 }</td></tr>
            <tr><td >${b.family.relative_5}</td><td>${b.family.name_5 }</td><td>${b.family.politicalLandscape_5 }</td><td colspan="2">${b.family.post_5 }</td></tr>
          </tbody>
        </table>
        <br>
      </div>
    </div>
  </div>
    
</div>
</div>
</body>
</html>