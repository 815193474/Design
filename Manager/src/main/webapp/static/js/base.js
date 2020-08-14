/**
 * 
 */

function doPrint() {
	bdhtml = window.document.body.innerHTML;
    sprnstr = "<!--startprint-->";
    eprnstr = "<!--endprint-->";
    prnhtml = bdhtml.substr(bdhtml.indexOf(sprnstr) + 17);
    prnhtml = prnhtml.substring(0, prnhtml.indexOf(eprnstr));

    //window.document.body.innerHTML =document.getElementById("mainbody").innerHTML; 
    //window.print();
    window.document.body.innerHTML = prnhtml;
    window.print();
    window.document.body.innerHTML = bdhtml;
}

/*
 * 解决ajax返回的页面中含有javascript的办法：
 * 把xmlHttp.responseText中的脚本都抽取出来，不管AJAX加载的HTML包含多少个脚本块，我们对找出来的脚本块都调用eval方法执行它即可
 */
function executeScript(html)
{
  var reg = /<script[^>]*>([^\x00]+)$/i;
  //对整段HTML片段按<\/script>拆分
  var htmlBlock = html.split("<\/script>");
  for (var i in htmlBlock) 
  {
    var blocks;//匹配正则表达式的内容数组，blocks[1]就是真正的一段脚本内容，因为前面reg定义我们用了括号进行了捕获分组
    if (blocks = htmlBlock[i].match(reg)) 
    {
      //清除可能存在的注释标记，对于注释结尾-->可以忽略处理，eval一样能正常工作
      var code = blocks[1].replace(/<!--/, '');
      try
      {
        eval(code) //执行脚本
      } 
      catch (e) 
      {
      }
    }
  }
}
/*
 * 利用div实现左边点击右边显示的效果（以id="content"的div进行内容展示）
 * 注意：
 *  ①：js获取网页的地址，是根据当前网页来相对获取的，不会识别根目录；
 *  ②：如果右边加载的内容显示页里面有css，必须放在主页（即例中的index.jsp）才起作用
 *  （如果单纯的两个页面之间include，子页面的css和js在子页面是可以执行的。 主页面也可以调用子页面的js。但这时要考虑页面中js和渲染的先后顺序 ）
*/
function showAtRight(url) {
  var xmlHttp;
  if (window.XMLHttpRequest) {
    // code for IE7+, Firefox, Chrome, Opera, Safari
    xmlHttp=new XMLHttpRequest();  //创建 XMLHttpRequest对象
  }
  else {
    // code for IE6, IE5
    xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");

  }
  xmlHttp.onreadystatechange=function() {    
    //onreadystatechange — 当readystate变化时调用后面的方法
    if (xmlHttp.readyState == 4) {
      //xmlHttp.readyState == 4  ——  finished downloading response
      if (xmlHttp.status == 200) {
        //xmlHttp.status == 200    ——  服务器反馈正常      
        document.getElementById("content").innerHTML=xmlHttp.responseText;  //重设页面中id="content"的div里的内容
        executeScript(xmlHttp.responseText);  //执行从服务器返回的页面内容里包含的JavaScript函数
      }
      //错误状态处理
      else if (xmlHttp.status == 404){
    	  alert("操作失败"); 
        /* 对404的处理 */
        return;
      }
      else if (xmlHttp.status == 403) { 
    	  alert("操作失败"); 
        /* 对403的处理 */
        return;
      } 
      else {
    	  alert("数据为空"); 
        /* 对出现了其他错误代码所示错误的处理  */
        return;
      }  
    } 
   }
  //把请求发送到服务器上的指定文件（url指向的文件）进行处理
  xmlHttp.open("POST", url, true);    //true表示异步处理
  xmlHttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
  xmlHttp.setRequestHeader("x-requested-with","XMLHttpRequest");
  xmlHttp.setRequestHeader("withCredentials","true");
  xmlHttp.setRequestHeader("dataType","JSON");
 
  xmlHttp.send();
}    

//复选框
function onselectAll(){
	var s =document.getElementById("selectAll");
	var check=document.getElementsByName("check");
	if(s.checked==true){
		for(var i=0;i<check.length;i++){
			check[i].checked=true;
		} 
	}else{
		for(var i=0;i<check.length;i++){
			check[i].checked=false;
		}
	}
}

 function show(){
	 if(document.getElementById('select_1').style.display=="none"){
		 document.getElementById('select_1').style.display="block";
			 document.getElementById('select_2').style.display="none";
				 document.getElementById('select_3').style.display="none";
	 }else{
		 document.getElementById('select_1').style.display="none";
	 }

 } 
function show_1(){
	 if(document.getElementById('select_2').style.display=="none"){
		 document.getElementById('select_2').style.display="block";
			 document.getElementById('select_1').style.display="none";
				 document.getElementById('select_3').style.display="none";
				 document.getElementById('select_4').style.display="none";
	 }else{
		 document.getElementById('select_2').style.display="none";
	 }
}
function show_2(){
	 if(document.getElementById('select_3').style.display=="none"){
		 document.getElementById('select_3').style.display="block";
		 document.getElementById('select_4').style.display="none";
			 document.getElementById('select_2').style.display="none";
				 document.getElementById('select_1').style.display="none";
	 }else{
		 document.getElementById('select_3').style.display="none";
	 }

} 
function show_3(){
	 if(document.getElementById('select_4').style.display=="none"){
		 document.getElementById('select_4').style.display="block";
		 document.getElementById('select_3').style.display="none";
			 document.getElementById('select_2').style.display="none";
				 document.getElementById('select_1').style.display="none";
	 }else{
		 document.getElementById('select_4').style.display="none";
	 }

}
function sub(){
	var v=document.getElementById('select_base').value;
	var x="../list/select_base?next=0&name="+v;
	showAtRight(x);
	
}
function sua(){
	var v=document.getElementById('select_base_admin').value;
	var x="../list/select_base?next=0&name="+v;
	showAtRight(x);
	
}
function suf(){
	var v=document.getElementById('select_base_class').value;
	var x="../list/select_base?next=0&name="+v;
	showAtRight(x);
	
}

function sue(){
	var v=document.getElementById('select_recommend_re').value;
	var x="../list/select_recommend?next=0&name="+v;
	showAtRight(x);
	
}
function sug(){
	var v=document.getElementById('select_recommend_class').value;
	var x="../list/select_recommend?next=0&name="+v;
	showAtRight(x);
	
}
function suc(){
	var a=document.getElementById('select_class').value;
	var b="../list/select_recommend_class?next=0&className="+a;
	showAtRight(b);
	
}
function suh(){
	var a=document.getElementById('select_class_class').value;
	var b="../list/select_base_class?next=0&className="+a;
	showAtRight(b);
	
}
function sui(){
	var a=document.getElementById('select_class_class_1').value;
	var b="../list/select_base_class?next=0&className="+a;
	showAtRight(b);
	
}
function suj(){
	var a=document.getElementById('select_class_re').value;
	var b="../list/select_recommend_class?next=0&className="+a;
	showAtRight(b);
	
}
function suk(){
	var a=document.getElementById('select_class_re_1').value;
	var b="../list/select_recommend_class?next=0&className="+a;
	showAtRight(b);
	
}
function sul(){
	var a=document.getElementById('select_class_admin').value;
	var b="../list/select_base_class?next=0&className="+a;
	showAtRight(b);
	
}
function sud(){
	var c=document.getElementById('select_recommend_admin').value;
	var d="../list/select_recommend?next=0&name="+c;
	showAtRight(d);
	
}
function suv(){
	var c=document.getElementById('teacher_n').value;
	var d=document.getElementById('teacher_w').value;
	if(c==""||d==""){
		alert("提交数据不能为空")
		return false;
	}else{
	var e="../insert/t?next=0&name="+c+"&work="+d;
	showAtRight(e);
	alert("信息录入成功")
	}  
}
function su_bt(){
	var a=document.getElementById('select_batch_base').value;
	var b="../list/select_base_batch?next=0&batch_id="+a;
	showAtRight(b);
	
}
function su_bt_re(){
	var a=document.getElementById('select_batch_recommend').value;
	var b="../list/select_recommend_batch?next=0&batch_id="+a;
	showAtRight(b);
	
}
function flush(){
	window.location.reload();
	
	}



