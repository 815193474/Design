package com.aitew.Manager.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	
	
	 @Override    
	    public boolean preHandle(HttpServletRequest request,    
	            HttpServletResponse response, Object handler) throws Exception { 
	        String requestUri = request.getRequestURI(); //请求完整路径，可用于登陆后跳转
	        String contextPath = request.getContextPath();  //项目下完整路径
	        String url = requestUri.substring(contextPath.length()); //请求页面
	    // System.out.print("发生拦截..."+requestUri);
	     //   System.out.println("来自："+requestUri+"的请求");
	        String user =  (String) request.getSession().getAttribute("id");  
	        System.out.println(user);
	      //  System.out.println(request.getSession());
			 if(user == null||user.equals(" ")){  //判断用户是否存在，不存在返回登录界面，继续拦截，存在通过拦截，放行到访问页面
	            /**
	             * 拦截目录下请求，是否为ajax请求
	             *   是：无需登录，直接访问（因为我是用于首页的ajax登录请求）
	             *   否：跳转至登录界面
	             */
	        	 System.out.println("返回主页...");
	        request.getRequestDispatcher("/index.jsp").forward(request, response);//转发到登录界面
	        	return false;
	        	/**
	        	 * System.out.println(request.getHeader("x-requested-with"));
	        	
	            if (request.getHeader("x-requested-with") != null && request.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")){ 
	                //如果是ajax请求响应头会有，x-requested-with  
	                System.out.print("发生ajax请求...");
	                response.setHeader("sessionstatus", "timeout");//在响应头设置session状态  
	                return true;
	            }else{
	                System.out.print("返回主页...");
	                request.getRequestDispatcher("/index.jsp").forward(request, response);//转发到登录界面 
	                return false;
	            }  
	        	 * */
	            
	        }
	            return true;     
	    }    
	    
	    /** 
	     * 在业务处理器处理请求执行完成后,生成视图之前执行的动作    
	     * 可在modelAndView中加入数据，比如当前时间 
	     */  
	    @Override    
	    public void postHandle(HttpServletRequest request,    
	            HttpServletResponse response, Object handler,    
	            ModelAndView modelAndView) throws Exception {     
	        if(modelAndView != null){  //加入当前时间    
	            modelAndView.addObject("status", "off");
	        }    
	    }     
	    
	    /**  
	     * 在DispatcherServlet完全处理完请求后被调用,可用于清理资源等   
	     *   
	     * 当有拦截器抛出异常时,会从当前拦截器往回执行所有的拦截器的afterCompletion()  
	     */    
	    @Override    
	    public void afterCompletion(HttpServletRequest request,    
	            HttpServletResponse response, Object handler, Exception ex)    
	            throws Exception {    
	    }    
	}
