<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
           <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
<title>材料生成系统-团支书登录页</title>
  <link rel="dao icon"  href="../static/img/favicon.ico" type="image-x.icon"/>
  <link rel="stylesheet" type="text/css" href="../static/css/base.css">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css"> 
  <style type="text/css">

#left li i {
      cursor:pointer;
      font-style:normal;
  }
  
  </style> 
  <script type="text/javascript" src="../static/js/base.js"></script>
<script type="text/javascript" src="../static/js/time.js"></script>
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head> 
<body>
   <div class="navbar navbar-fixed-top navbar-inverse" style="background-color: #d9edf7;border: none;">  
      <div class="container-fluid">  
        <div class="nav-logo">
          <a href="#" ><i class="iconfont icon-icon_zhanghao" title="团支书">&nbsp;&nbsp;</i><i>${ls.name }</i>&nbsp;&nbsp;</a>
        </div>
        <div class="navbar-header">  
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navBar">  
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
        </div>  
         <div class="collapse navbar-collapse " id="navBar" >  
          <ul class="nav navbar-nav navbar-left">

                    <li ><a href="javascript:void(0)"  onclick="flush()"><i class="iconfont icon-reload " title="刷新至首页"></i>&nbsp;&nbsp;首页</a></li>
       
                 
                    
          </ul>  
          <ul class="nav navbar-nav navbar-right">
                    
       <li tyle="margin-right: 50px;" ><a href="javascript:alert('需要产品定制请联系微信a815193474')"  ><i  class="iconfont icon-dingzhi" >&nbsp;&nbsp;</i>产品定制
                    </a></li>
                 
                    <li style="margin-right: 25px;"><a href="../login/loginout" ><i  class="iconfont icon-poweroff" title="注销登录"></i>&nbsp;&nbsp;注销
                    </a></li>
          </ul>  
        </div>
      </div>
    </div>  
   <br><br><br><br><br>
      
    <div class="container-fluid">
      <div class="row">

        <div class="col-sm-2" >
          
   <ul id="left" class="list-group" > 
   <li class="list-group-item active"><i  class="iconfont icon-dianpu" >&nbsp;&nbsp;</i>系统管理</li>   
    <li id="left_li_1" class="list-group-item" onclick="show()"><i  class="iconfont icon-yingyongguanli" >&nbsp;&nbsp;</i><i id="menu_1">数据管理</i></li>
    <li id="select_1" class="list-group-item" style="display:none;"> 
         <ul class="list-group" >  
         
           <li class="list-group-item">
           <a href="###" method="post" onclick="showAtRight('../list/resume?next=0&className=${ls.className.id }');"> <i  class="iconfont icon-team" >&nbsp;</i>积极分子管理</a>
           </li>  
          <li class="list-group-item">
           <a href="###" method="post" onclick="showAtRight('../list/recommend?next=0&className=${ls.className.id }')" ><i  class="iconfont icon-team" >&nbsp;</i>发展对象管理</a>
           </li>  
            
      </ul>
      </li> 
      <li id="left_li_2" class="list-group-item" onclick="show_1()"><i  class="iconfont icon-plus-square" >&nbsp;&nbsp;</i><i id="menu_1">数据添加</i></li>
      <li id="select_2" style="display:none;" class="list-group-item" >
        <ul class="list-group">
             <li class="list-group-item"><a href="###" onclick="showAtRight('../insert/base_insert?className=${ls.className.id }');"><i  class="iconfont icon-addteam" >&nbsp;</i>入党信息录入</a></li>  
        </ul>
      </li>
      
       
      
      
      <li id="left_li_3" class="list-group-item" onclick="show_2()"><i  class="iconfont icon-barchart" >&nbsp;&nbsp;</i><i id="menu_1">数据统计</i></li>
      <li id="select_3" class="list-group-item" style="display:none;" >
      
      <ul class="list-group">
        
         <li class="list-group-item"><i  class="iconfont icon-team" >&nbsp;&nbsp;</i>积极分子<i class="badge pull-right">${number_active }</i></li> 
         <li class="list-group-item"><i  class="iconfont icon-team" >&nbsp;&nbsp;</i>发展党员<i  class="badge pull-right">${number_development }</i></li> 
        </ul>
        </li>
        <li id="left_li_2" class="list-group-item"><a href="###" onclick="showAtRight('../list/instructions')" ><i  class="iconfont icon-shiyongwendang" >&nbsp;&nbsp;</i>使用说明</a></li>
     </ul> 
        </div>
        <div class=" col-sm-10">
          <div class=" panel panel-success">
            <div class="panel-heading">
                <h3 class="panel-title">开 物 成 务 启 智 求 真</h3>
            </div>
                <div class=" panel-body scro" id="content">
            
                  
                  <ul id="content02" class="list-group">
                 
                  <li   class="list-group-item">系统名称：材料生成系统</li>
                    <li class="list-group-item">系统版本号：V1.0.2</li>
                    <li class="list-group-item">java版本号：1.8.0</li>
                    <li class="list-group-item">操作系统名称：Centos 7</li>
                    <li class="list-group-item">Server信息：Apache Tomcat 9</li> 
                    <li class="list-group-item">操作系统构架：AMD64</li>   
                  <li  class="list-group-item">项目首次发布时间：2019年6月6日</li>
          
                 </ul>
               
           
               </div>


              <div class="panel-footer">
                  <p class="text-primary" style="text-align:center;"><a rel="nofollow" href="http://www.beian.miit.gov.cn" target="_blank">陇ICP备19003156号</a></p>

              </div>

          </div>  
        </div>           
            </div> 
            
      </div>

  </body>

</html>