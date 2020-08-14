<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>材料生成系统-团支书录入页面</title>
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
  $("#form2").submit(function () 
        {
             $.ajax({
                type: "POST",//方法类型
                    //dataType: "JSON",//预期服务器返回的数据类型
                    url: "../insert/league_insert" ,//url
                    data: $('#form2').serialize(),
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
            
             document.getElementById("form2").reset();
             return false;
         
        });

    })
</script>
<title>管理员信息插入</title>
</head>
<body>
<div class="container">
  <div class="container-fluid">
    <div class="row">
      <div class="col-sm-5 col-sm-offset-1">
        
        <br>
        <h4>团支书信息录入</h4><br>
        <p style="color:green;">Ps:输入相同账号即可修改原有账号信息</p><br>

        <form role="form" id="form2" method="post" action="###">
          <div class="input-group">
            <span class="input-group-addon">账号</span>
            <input type="text" name="username" required="required" autofocus="autofocus" class="form-control">
          </div>
          <br>
          <div class="input-group">
            <span class="input-group-addon">密码</span>
            <input type="text" name="password" required="required"  class="form-control">
          </div>
          <br>
          <div class="input-group">
            <span class="input-group-addon">姓名</span>
            <input type="text" name="name" required="required"  class="form-control">
          </div>
          
          <br>
          <div class="input-group">
            <span class="input-group-addon">班级</span>
                <select name="className" class="form-control">
                  <option>选择班级</option>
                  <c:forEach items="${c}" var="c" varStatus="status">
                  <option value="${c.id}">${c.className }</option>
                  </c:forEach>

                  </select>
          </div>
          <br>
          <div class="input-group pull-right">
            <input style="display:none;" type="text" name="type" value="league" class="form-control" >
              <button type="submit" class="btn btn-primary"  id="sub" class="form-control">submit</button>
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