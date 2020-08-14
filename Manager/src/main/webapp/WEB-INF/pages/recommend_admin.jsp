<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>材料生成系统-发展对象记录表</title>
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
        <div class="col-sm-3 ">
          <div class="input-group">
            <input type="text"  class="form-control" id="select_recommend_admin" placeholder="请输入姓名查找">
          <span class="input-group-addon"><a href="###" onclick="sud()"><i  class="iconfont icon-sousuo white pull-right" ></i></a></span> 
          </div>
           
        </div>
        <div class="col-sm-3 col-sm-offset-1 ">
          <div class="input-group">
            
          
          <select id="select_class" class="form-control" name="className">
          <option>按班级查找</option>
          <c:forEach items="${className}" var="c" varStatus="status">
          <option value="${c.id}">${c.className }</option>
          </c:forEach>
          </select>
          <span class="input-group-addon"><a href="###" onclick="suc()"><i  class=" iconfont icon-sousuo white" ></i></a></span>
          </div>
        </div>
        <div class=" col-sm-4 pull-right ">
          <div class="input-group">
            <select id="select_batch_recommend" class="form-control" name="batch_id">
          <option>按批次查找</option>
          <c:forEach items="${batch}" var="b" varStatus="status">
          <option value="${b.batch_id}">${b.batch_id}</option>
          </c:forEach>
          </select>
          <span class="input-group-addon"><a href="###" onclick="su_bt_re()"><i  class="iconfont icon-sousuo white" ></i></a></span>
          </div>
          
        </div>
      </div>
  
    
    </div>
    <form id="form3" action="../export/word" method="POST" role="form">
    <div class="row">
      <div class="col-sm-12 ">
        
        <br>
        
        <table class="table table-bordered table-hover text-nowrap">
          
           <thead>
              <tr><td>编号</td><td>姓名</td><td>性别</td><td>名族</td><td >出生日期</td><td>籍贯</td><td >申请入党时间</td><td>身份证号码</td><td colspan="3">操作</td></tr>
            </thead>
            <tbody>
            <c:forEach items="${recommends }" var="b" varStatus="status">
            <tr><td>${status.index+n+1}</td><td>${b.name }</td><td>${b.sex }</td><td>${b.nation }</td><td>${b.birthday }</td><td>${b.nativePlace }</td><td>${b.applyTime }</td><td>${b.idCardNumber }</td>
            <td >
              <a  class="btn-sm btn-primary" onclick="showAtRight('../list/base?id=${b.id }')" href="###">详情</a></td>
            <!--  <td><a  onclick="showAtRight('../list/talk?id=${b.id}')" href="###">谈话信息</a></td>-->

            <td><a  class="btn-sm btn-danger" onclick="showAtRight('../del/recommend_admin?id=${b.id}&next=${next_p+1}')" href="###" >取消推优</a></td>
            <td><input type="checkbox" name="check" value="${b.id }"></td>
            </tr>
            </c:forEach>
            </tbody>
        </table>
      </div>
    </div>
      <div class="row ">
        <div class="col-sm-10">
          <br><br>
          <a  class="col-sm-2 col-sm-offset-2">全选&nbsp;<input type="checkbox" id="selectAll" onclick="onselectAll()" >  </a>
          <select name="table_name" class="col-sm-4 col-sm-offset-1" >
          <option>请选择需要下载的材料</option>
					<c:forEach items="${tables}" var="c" varStatus="status">
					<option value="${c.en_name}">${c.cn_name }</option>
					</c:forEach>

          </select>
          <input type="submit" class="btn-sm btn-primary col-sm-1 col-sm-offset-2" value="down" />
          
        
        </div>
      </div>
      </form>

      <div class="row">
        <div class="col-sm-6 col-sm-offset-4">
          <br>
        <ul class="pagination">
          <li> <a  id="load_1" href="###" onclick="showAtRight('../list/recommend_admin?next=${next_p}')" type="text/html">&laquo;</a> </li>
          <li> <a id="load_2" href="###" onclick="showAtRight('../list/recommend_admin?next=0')" type="text/html">首页</a></li>
          <li> <a id="load_1" href="###" >共${num_p }页</a></li>
          <li> <a id="load_1" href="###" >共${num_b }条</a></li>
          <li> <a id="load_1" href="###" onclick="showAtRight('../list/recommend_admin?next=${next_n}')" type="text/html">&raquo;</a></li>
        </ul>
        </div>
      </div>
    </div>
  </div>
    
</div>
</div>
</body>
</html>