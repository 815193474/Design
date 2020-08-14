<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>材料生成系统-班级录入</title>
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
  $("#form3").submit(function () 
        {
             $.ajax({
                type: "POST",//方法类型
                   // dataType: "JSON",//预期服务器返回的数据类型
                    url: "../insert/class_insert" ,//url
                    data: $('#form3').serialize(),
                    success: function (result) {
                      alert("数据录入成功");
                        console.log(result);//打印服务端返回的数据(调试用)
                        if (result.resultCode == 200) {
                            alert("SUCCESS");
                        }
                        ;
                    },
                    error : function() {
                      alert("数据录入出错，班级编号不可以重复或数据不能为空");
                    }
                });
            //中间做一些ajax数据交互
             
             document.getElementById("form3").reset();
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
          <form id="form3" method="post" role="form" action="###">
          <h4>班级信息录入</h4>
          <br>
          <p class="text-success">Ps:班级编号相同时即可修改班级信息</p>
          <br>
          <div class="input-group">
            <span class="input-group-addon">班级编号</span>
            <input type="text" placeholder="例如：01" required="required" name="id" autofocus="autofocus" class="form-control">
          </div>
          <br>
          <div class="input-group">
            <span class="input-group-addon">
              班级名称
            </span>
          <input type="text" placeholder="例如：网络16-1班" required="required" name="className" class="form-control" >
          </div><br>
          <div class="input-group pull-right">
            <button type="submit" class="btn btn-primary form-control">submit</button>
          </div>
            <br>
          <br><br><br>
          </form>

        </div>
      </div>
    </div>
  </div>

</body>
</html>