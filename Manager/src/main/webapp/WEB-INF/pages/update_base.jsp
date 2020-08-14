<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>材料生成系统-入党申请人基本情况登记表修改</title>
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
  $("#form1").submit(function () 
        {
             $.ajax({
                type: "POST",//方法类型
                //    dataType: "JSON",//预期服务器返回的数据类型
                    url: "../insert/base" ,//url
                    data: $('#form1').serialize(),
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
            
             document.getElementById("form1").reset();
             return false;
         
        });

    })
</script>
</head>
<body>
  <div class="container">
    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-11">
          <h4>入党申请信息修改</h4>
          <br>
          <form id="form1" method="post" action="###" role="form">
            <div style="display:none;">
            style="display:none;">
            <input type="text" name="id" value="${b.id }"/>
            <input type="text" name="teacher_1" value="${b.teachers_1.name }"/>
            <input type="text" name="teacher_2" value="${b.teachers_2.name}"/>
            <input type="text" name="className" value="${b.className.id}"/>
            <input type="text" name="batch_id" value="${b.batch.batch_id}"/>
          
            </div>
            <div class="input-group">
            <span class="input-group-addon">姓名</span>
            <input type="text" name="name_b" readonly = "readonly" required="required" value="${b.name }" class="form-control" />
            </div>
            <br>
            <div class="input-group">
            <span class="input-group-addon">性别</span>
            <input type="text"  autofocus="autofocus" required="required" class="form-control" name="sex" value="${b.sex }">
            </div><br>

            <div class="input-group">
            <span class="input-group-addon">民族</span>
            <input type="text" required="required" value="${b.nation }" class="form-control" name="nation">
            </div><br>

            <div class="input-group">
            <span class="input-group-addon">出生年月</span>
            <input type="date" name="birthday" value="${b.birthday }" class="form-control" required="required"/>
            </div><br>

            <div class="input-group">
            <span class="input-group-addon">参加工作时间</span>
            <input required="required" type="date" value="${b.entryWorkTime }" class="form-control" name="entryWorkTime">
            </div><br>

            <div class="input-group">
            <span class="input-group-addon">籍贯</span>
            <input required="required" type="text" value="${b.nativePlace }" class="form-control" name="nativePlace">
            </div><br>

            <div class="input-group">
            <span class="input-group-addon">学历</span>
            <input required="required" type="text" value="${b.education }" class="form-control" name="education"/>
            </div><br>

            <div class="input-group">
            <span class="input-group-addon">入团时间</span>
            <input required="required" value="${b.entryPartyTime }" type="date" class="form-control" name="entryPartyTime">
            </div><br>


            <div class="input-group">
            <span class="input-group-addon">申请入党时间</span>
            <input  required="required" type="date" value="${b.applyTime }" class="form-control" name="applyTime">
            </div><br>


            <div class="input-group">
            <span class="input-group-addon">身份证号码</span>
            <input required="required" type="text" value="${b.idCardNumber }" class="form-control" name="idCardNumber">
            </div><br>

            <div class="input-group">
            <span class="input-group-addon">单位或现居地</span>
            <input type="text" required="required" value="${b.address }" name="address" class="form-control">
            </div><br>


            <div class="input-group">
            <span class="input-group-addon">简历1</span>
            <span class="input-group-addon">何时何地任何职</span>
            <input type="text" required="required" name="workExperience_0" value="${b.resume.workExperience_0 }" class="form-control">
            <span class="input-group-addon">证明人</span>
            <input type="text" required="required" value="${b.resume.name_0 }" name="name_r_0" class="form-control">
            </div><br>

            <div class="input-group">
            <span class="input-group-addon">简历2</span>
            <span class="input-group-addon">何时何地任何职</span>
            <input type="text" required="required" name="workExperience_1" value="${b.resume.workExperience_1 }" class="form-control">
            <span class="input-group-addon">证明人</span>
            <input type="text" required="required" value="${b.resume.name_1 }" name="name_r_1" class="form-control">
            </div><br>

            <div class="input-group">
            <span class="input-group-addon">简历3</span>
            <span class="input-group-addon">何时何地任何职</span>
            <input type="text"  name="workExperience_2" value="${b.resume.workExperience_2 }" class="form-control">
            <span class="input-group-addon">证明人</span>
            <input type="text"  value="${b.resume.name_2 }" name="name_r_2" class="form-control">
            </div><br>

            <div class="input-group">
            <span class="input-group-addon">简历4</span>
            <span class="input-group-addon">何时何地任何职</span>
            <input type="text"  name="workExperience_3"value="${b.resume.workExperience_3 }" class="form-control">
            <span class="input-group-addon">证明人</span>
            <input type="text"   value="${b.resume.name_3 }" name="name_r_3" class="form-control">
            </div><br>
            
            <div class="input-group">
            <span class="input-group-addon">简历5</span>
            <span class="input-group-addon">何时何地任何职</span>
            <input type="text" name="workExperience_4" value="${b.resume.workExperience_4 }" class="form-control">
            <span class="input-group-addon">证明人</span>
            <input type="text" value="${b.resume.name_4 }"  name="name_r_4" class="form-control">
            </div><br>

            <div class="input-group">
            <span class="input-group-addon">简历6</span>
            <span class="input-group-addon">何时何地任何职</span>
            <input type="text" name="workExperience_5" value="${b.resume.workExperience_5}" class="form-control">
            <span class="input-group-addon">证明人</span>
            <input type="text"  value="${b.resume.name_5 }" name="name_r_5" class="form-control">
            </div><br>

            <div class="input-group">
            <span class="input-group-addon">家庭及社会关系1</span>
            <span class="input-group-addon">关系</span>
            <input type="text" name="relative_0" value="${b.family.relative_0 }" class="form-control">
            <span class="input-group-addon">姓名</span>
            <input type="text" name="name_f_0" value="${b.family.name_0 }" class="form-control">
            <span class="input-group-addon">政治面貌</span>
            <input type="text" value="${b.family.politicalLandscape_0 }"name="politicalLandscape_0" class="form-control">
            <span class="input-group-addon">单位及职务</span>
            <input type="text" name="post_0"value="${b.family.post_0 }" class="form-control">
            </div><br>

            <div class="input-group">
            <span class="input-group-addon">家庭及社会关系2</span>
            <span class="input-group-addon">关系</span>
            <input type="text" name="relative_1" value="${b.family.relative_1 }" class="form-control">
            <span class="input-group-addon">姓名</span>
            <input type="text" name="name_f_1" value="${b.family.name_1 }"class="form-control">
            <span class="input-group-addon">政治面貌</span>
            <input type="text" value="${b.family.politicalLandscape_1 }" name="politicalLandscape_1" class="form-control">
            <span class="input-group-addon">单位及职务</span>
            <input type="text" name="post_1"value="${b.family.post_1 }" class="form-control">
            </div><br>

            <div class="input-group">
            <span class="input-group-addon">家庭及社会关系3</span>
            <span class="input-group-addon">关系</span>
            <input type="text" name="relative_2" value="${b.family.relative_2 }"class="form-control">
            <span class="input-group-addon">姓名</span>
            <input type="text" name="name_f_2" value="${b.family.name_2 }"class="form-control">
            <span class="input-group-addon">政治面貌</span>
            <input type="text"value="${b.family.politicalLandscape_2 }" name="politicalLandscape_2" class="form-control">
            <span class="input-group-addon">单位及职务</span>
            <input type="text" name="post_2" value="${b.family.post_2 }"class="form-control">
            </div><br>

            <div class="input-group">
            <span class="input-group-addon">家庭及社会关系4</span>
            <span class="input-group-addon">关系</span>
            <input type="text" name="relative_3"value="${b.family.relative_3 }" class="form-control">
            <span class="input-group-addon">姓名</span>
            <input type="text" name="name_f_3" value="${b.family.name_3 }"class="form-control">
            <span class="input-group-addon">政治面貌</span>
            <input type="text" value="${b.family.politicalLandscape_3 }" name="politicalLandscape_3" class="form-control">
            <span class="input-group-addon">单位及职务</span>
            <input type="text" name="post_3" value="${b.family.post_3 }" class="form-control">
            </div><br>

            <div class="input-group">
            <span class="input-group-addon">家庭及社会关系5</span>
            <span class="input-group-addon">关系</span>
            <input type="text" name="relative_4"value="${b.family.relative_4 }" class="form-control">
            <span class="input-group-addon">姓名</span>
            <input type="text" name="name_f_4" value="${b.family.name_4 }"class="form-control">
            <span class="input-group-addon">政治面貌</span>
            <input type="text" value="${b.family.politicalLandscape_4 }" name="politicalLandscape_4" class="form-control">
            <span class="input-group-addon">单位及职务</span>
            <input type="text" name="post_4"value="${b.family.post_4 }" class="form-control">
            </div><br>

            <div class="input-group">
            <span class="input-group-addon">家庭及社会关系6</span>
            <span class="input-group-addon">关系</span>
            <input type="text" name="relative_5" value="${b.family.relative_5 }" class="form-control">
            <span class="input-group-addon">姓名</span>
            <input type="text" name="name_f_5" value="${b.family.name_5 }"class="form-control">
            <span class="input-group-addon">政治面貌</span>
            <input type="text"value="${b.family.politicalLandscape_5 }" name="politicalLandscape_5" class="form-control">
            <span class="input-group-addon">单位及职务</span>
            <input type="text" name="post_5"value="${b.family.post_5 }" class="form-control">
            </div><br>

            <div class="input-group pull-right">
            <br>
              <button type="submit" class="btn btn-primary form-control">submit</button>

            </div>
            <br><br><br><br>
        </form>
        </div>
      </div>
    </div>
  
  </div>

</body>
</html>