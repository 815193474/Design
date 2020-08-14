package com.aitew.Manager.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aitew.Manager.service.AdminService;
import com.aitew.Manager.service.BaseInformationService;
import com.aitew.Manager.service.ClassNameService;
import com.aitew.Manager.service.LeagueSecretaryService;
import com.aitew.Manager.service.RecommendService;
import com.aitew.Manager.service.SuperAdminService;
import com.aitew.Manager.service.TypeService;
import com.aitew.Manager.vo.Admin;
import com.aitew.Manager.vo.BaseInformation;
import com.aitew.Manager.vo.ClassName;
import com.aitew.Manager.vo.LeagueSecretary;
import com.aitew.Manager.vo.Recommend;
import com.aitew.Manager.vo.SuperAdmin;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	private AdminService adminService;
	@Autowired
	private TypeService typeService;
	@Autowired
	private LeagueSecretaryService leagueSecretaryService;
	@Autowired
	private SuperAdminService superAdminService;
	@Autowired
	private BaseInformationService base;
	@Autowired
	private RecommendService recommend;
	@Autowired
	private ClassNameService classNameService;
	@Autowired
	private Util util;

	//login类型控制
	@ResponseBody
	@RequestMapping("/TYPE")
	public String login_type( ModelMap m, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int stat = 1;
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String type=request.getParameter("type");
        System.out.println(username+password+type);
		//设置头部信息防止乱码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String clientCheckcode = request.getParameter("yan").toUpperCase();//接收客户端提交上来的参数，使用toUpperCase()可以实现不区分大小写
		String serverCheckcode = (String) request.getSession().getAttribute("checkcode");//从session中提取验证码

		if (clientCheckcode.equals(serverCheckcode)) {
//admin登录
			if (type.equals("admin")) {
				List<Admin> all = adminService.findAll();
				for (int i = 0; i < all.size(); i++) {
					while (username.equals(all.get(i).getId())) {
						while (password.equals(adminService.findOneAmdin(username).getPassword()) && stat == adminService.findOneAmdin(username).getStatus()) {

							//select 积极分子


							request.getSession().setAttribute("id", username);
							return "admin";
						}


						return "密码错误或者账号已被禁用";
					}

				}

				return "用户不存在";
//league登录
			} else if (type.equals("league")) {
				List<LeagueSecretary> all = leagueSecretaryService.findAll();
				for (int i = 0; i < all.size(); i++) {
					while (username.equals(all.get(i).getId())) {
						while (password.equals(leagueSecretaryService.findOne(username).getPassword()) && stat == leagueSecretaryService.findOne(username).getStatus()) {

							request.getSession().setAttribute("id", username);

							return "league";
						}

						return "密码错误或者账号已被禁用";
					}

				}

				return "用户不存在";
//superadmin登录
			} else if (type.equals("superadmin")) {
				List<SuperAdmin> all = superAdminService.findAll();
				for (int i = 0; i < all.size(); i++) {
					while (username.equals(all.get(i).getId())) {
						while (password.equals(superAdminService.findOneSuper(username).getPassword())) {


							request.getSession().setAttribute("id", username);
							return "super";
						}

						return "密码错误";
					}

				}

				return "用户不存在";
			}
		} else {

		return "验证码不正确";
	}
return "未知错误";
}
	@RequestMapping("/loginout")
	public String quitUser(HttpServletRequest request){
     request.getSession().removeAttribute("id");
        return "redirect:../list/login";
    }




    @RequestMapping("/admin")
	public String adminIndex(ModelMap m,HttpServletRequest request){
		List<BaseInformation> base01 = base.findAllBase();
		//select 发展党员
		List<Recommend> re = recommend.findAllRecommend();
		List<LeagueSecretary> le = leagueSecretaryService.findAll();
		List<ClassName> cl = classNameService.findAll();
		List<Admin> ad = adminService.findAll();

		String username=(String)request.getSession().getAttribute("id");
		m.put("admin", adminService.findOneAmdin(username));
		m.put("number_active", base01.size());
		m.put("number_development", re.size());
		m.put("number_league", le.size());
		m.put("number_className", cl.size());
		m.put("number_admin", ad.size());

		return "admin";
	}




	@RequestMapping("/super")
	public String superAdmin(ModelMap m,HttpServletRequest request){
		//select 积极分子
		List<BaseInformation> base01 = base.findAllBase();
		//select 发展党员
		List<Recommend> re = recommend.findAllRecommend();
		List<LeagueSecretary> le = leagueSecretaryService.findAll();
		List<ClassName> cl = classNameService.findAll();
		List<Admin> ad = adminService.findAll();
		String username=(String)request.getSession().getAttribute("id");
		m.put("superadmin", superAdminService.findOneSuper(username));
		m.put("number_active", base01.size());
		m.put("number_development", re.size());
		m.put("number_league", le.size());
		m.put("number_className", cl.size());
		m.put("number_admin", ad.size());


		return "super";
	}


	@RequestMapping("/league")
	public String league(ModelMap m,HttpServletRequest request){
		String username=(String)request.getSession().getAttribute("id");
		//select 积极分子
		List<BaseInformation> ba = base.findByClassName(leagueSecretaryService.findOne(username).getClassName());
		//select 发展党员
		List<Recommend> re = recommend.findAllRecommend();
		int k = 0;
		String name = leagueSecretaryService.findOne(username).getClassName().getId();
		for (int n = 0; n < re.size(); n++) {
			//发展党员的班级和团支书班级一致
			if (name.equals(base.findById(re.get(n).getId()).getClassName().getId())) {
				k++;
			}
		}
		m.put("ls", leagueSecretaryService.findOne(username));
		m.put("number_active", ba.size());
		m.put("number_development", k);


		return "league";
	}
}


