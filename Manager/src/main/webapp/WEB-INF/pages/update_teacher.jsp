<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>材料生成系统-培养联系人修改</title>
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
                    url: "../update/update_base_teacher" ,//url
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
</head>
<body>

  <div class="container">
    <div class="container-fluid">
      <div class="row">
        <br>
      
        <div class="col-sm-5 col-sm-offset-1">
          <form id="form2" method="get" role="form" action="###">
          <h4>培养联系人修改</h4>
          <br>

          <div class="input-group">
            <span class="input-group-addon">姓名</span>
            <input type="text" required="required" readonly = "readonly" name="name" value="${update_t.name }"  class="form-control">
          </div>
          <br>
          <div class="input-group">
            <span class="input-group-addon">
              培养联系人一
            </span>
          <select id="type" name="teacher_1" class="form-control">
            <option>${update_t.teachers_1.name }</option>
            <c:forEach items="${teacher}" var="t" >
            <option value="${t.name }">${t.name }</option>
            </c:forEach>
            </select>
          </div><br>
          <div class="input-group">
            <span class="input-group-addon">
              培养联系人二
            </span>
          <select id="type" name="teacher_2" class="form-control">
          <option>${update_t.teachers_2.name }</option>
          <c:forEach items="${teacher}" var="t1" >
          <option  value="${t1.name }">${t1.name }</option>
          </c:forEach>
          </select>
        <input type="text" name="id" value="${update_t.id }" style="display:none;" >
          </div><br>
          <div class="input-group pull-right">
            <input  type="submit" class="btn btn-primary" value="submit">
          </div><br><br><br><br>
          </form>

        </div>
      </div>
    </div>
  </div>

</body>
</html>
