<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>材料生成系统-按批次下载数据</title>
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
      <div class="col-sm-6 col-sm-offset-1">
        
        <br>
        <h4>选择批次下载相应数据</h4>
        <br>
        <p style="color:green;">Ps:选择批次、人员类型、材料以后可以为本批次下符合类型的所有人员下载表格</p>
        <br>
        <form role="form" method="post" action="../export/word_batch">
          <div class="input-group">
            <span class="input-group-addon">批次</span>
            <select name="batch_id"  autofocus="autofocus" class="form-control">
              <option>请选择批次</option>
              <c:forEach items="${batch}" var="b" >
              <option  value="${b.batch_id }">${b.batch_id }
              </option>
              </c:forEach>
              </select>
          </div>
          <br>
          <div class="input-group">
            <span class="input-group-addon">材料</span>
            <select name="table_name" class="form-control">
              <option>请选择表格</option>
              <option value="bases">入党申请人基本情况登记表</option>
              <option value="talk">党支部派人谈话记录表</option>
              <option value="recommend">入党积极分子推荐确定和备案情况登记表</option>
              <option value="work">发展党员工作部门联审征求意见表</option>
              <option value="prepare">发展对象确定备案情况登记表</option>
              <option value="perspecct">预审情况登记表</option>
              <option value="education">入党积极分子培养和教育考察情况登记表</option>
              <option value="receive">接收预备党员表决票</option>
              <option value="table05">待添加</option>
              </select>
          </div>
          <br>
          <div class="input-group">
            <span class="input-group-addon">类型</span>
           <select name="type" class="form-control">
            <option>请选择人员类型</option>
            <option value="active">积极分子</option>
            <option value="develop">发展对象</option>
            </select>
          </div>
          
          <br>
          <div class="input-group pull-right">
              <button type="submit"  class="form-control btn btn-primary">down</button>
          </div>
          <br>
          <br>
          
        </form>
      </div>
    </div>
  </div>
</div>

</body>
</html>