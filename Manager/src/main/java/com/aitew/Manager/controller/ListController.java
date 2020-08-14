package com.aitew.Manager.controller;

import java.util.ArrayList;
import java.util.List;

import com.aitew.Manager.service.*;
import com.aitew.Manager.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/list")
public class ListController {
	@Autowired
	private RecommendService recommendService;
	@Autowired
	private TeacherService teacher;
	@Autowired
	private ClassNameService classNameService;
	@Autowired
	private BaseInformationService baseInformationService;
	@Autowired
	private TalkService talkService;
	@Autowired
	private TypeService typeService;
	@Autowired
	private LeagueSecretaryService leagueSecretaryService;
	@Autowired
	private AdminService adminService;
	@Autowired
	private SuperAdminService superAdminService;
	@Autowired
	private BatchService batch;
	@Autowired
	private TablesService tablesService;
	@Autowired
	private LoginController loginController;
	//据团支书班级分页查询入党申请人员
	@RequestMapping("/resume")
	public String list_base(ModelMap m,String next,String className) {	
		List<BaseInformation> all= baseInformationService.findByClassName(classNameService.findOne(className));
		int s=all.size();
		int s1=0;
		int b;
		b=Integer.parseInt(next);
			
	
				if(s%15!=0) {
					s1=s/15+1;
				}else {
					s1=s/15;
				}
				if(s<=15||b<0) {
						b=0;
				
				}
				int n=b*15;
				int n2;
		    		if(s-n>15) {
					n2=n+15;
				}else {
					n2=s;
				}
			
		List<BaseInformation> all01=all.subList(n,n2);
			
		m.put("base_0", all01);
		m.put("num_p", s1);
		m.put("n", n);
		m.put("num_b", s);
		m.put("next_n", b+1);
		m.put("next_p", b-1);
		m.put("className_id", className);
		m.put("tables", tablesService.findAll());
		return "b_list";
	}
	//管理员分页查询所有入党申请人员
	@RequestMapping("/base_admin")
	public String list_base_admin(ModelMap m,String next) {	
		List<BaseInformation> all= baseInformationService.findAllBase();
		List<ClassName> c=classNameService.findAll();
		int s=all.size();
		int s1=0;
		int b;
		b=Integer.parseInt(next);
		if(s%15!=0) {
			s1=s/15+1;
		}else {
			s1=s/15;
		}
		if(s<=15||b<0) {
				b=0;
		
		}
		int n=b*15;
		int n2;
		if(s-n>15) {
			n2=n+15;
		}else {
			n2=s;
		}
		
		List<BaseInformation> all01=all.subList(n,n2);
		m.put("base_0", all01);
		m.put("num_p", s1);
		m.put("num_b", s);
		m.put("n", n);
		m.put("next_n", b+1);
		m.put("next_p", b-1);
		m.put("className", c);
		m.put("batch", batch.findAll());
		m.put("tables", tablesService.findAll());
		return "b_list_admin";
	}
	//查询入党申请信息详情
	@RequestMapping("/base")
	public String base(String id,ModelMap m) {
		m.put("b", baseInformationService.findById(id));
		String name=baseInformationService.findById(id).getName();
		m.put("name", "入党申请人"+name+"基本信息登记.doc");
		return "success_b";
	}
	//查询谈话信息详情
	@RequestMapping("/talk")
	public String list_talk(ModelMap m,String id) {
		m.put("talk",baseInformationService.findById(id));
		return "success_t";

	}
	@RequestMapping("/talk01")
	public String list_talk01(ModelMap m,String id) {
		m.put("talk",baseInformationService.findById(id));
		return "success_t2";

	}
	//分页查询班级
	@RequestMapping("/class")
	public String list_class(ModelMap m,String next) {
		
		List<ClassName> all=classNameService.findAll();
		int s=all.size();
		int s1=0;
		int b;
		b=Integer.parseInt(next);
		if(s%10!=0) {
			s1=s/10+1;
		}else {
			s1=s/10;
		}		
		if(s<=10||b<0) {
			b=0;
		}
		int n=b*10;
		int n2;
		if(s-n>10) {
			n2=n+10;
		}else {
			n2=s;
		}
		List<ClassName> all01=all.subList(n,n2);
		m.put("num_p", s1);
		m.put("num_b", s);
		m.put("next_n", b+1);
		m.put("n", n);
		m.put("next_p", b-1);
		m.put("all_class", all01);
		return "class_list";
	}
	//login页面
	@RequestMapping("/login")
	public String list_type(ModelMap m) {
		m.put("type", typeService.findAllType());
		return "login";
	}
	
	
	//分页查询团支书
	@RequestMapping("/league")
	public String list_league(ModelMap m,String next) {
		
		List<LeagueSecretary> all=leagueSecretaryService.findAll();
		int s=all.size();
		int s1=0;
		int b;
		b=Integer.parseInt(next);
		if(s%10!=0) {
			s1=s/10+1;
		}else {
			s1=s/10;
		}		
		if(s<=10||b<0) {
			b=0;
		}
		int n=b*10;
		int n2;
		if(s-n>10) {
			n2=n+10;
		}else {
			n2=s;
		}
		List<LeagueSecretary> all01=all.subList(n,n2);
		m.put("num_p", s1);
		m.put("num_b", s);
		m.put("n", n);
		m.put("next_n", b+1);
		m.put("next_p", b-1);
		m.put("all_class", all01);
		m.put("league",all);
		return "league_list";
	}
	//分页查询管理员
		@RequestMapping("/admin")
		public String list_admin(ModelMap m,String next) {
			
			List<Admin> all=adminService.findAll();
			int s=all.size();
			int s1=0;
			int b;
			b=Integer.parseInt(next);
			if(s%10!=0) {
				s1=s/10+1;
			}else {
				s1=s/10;
			}		
			if(s<=0||b<0) {
				b=0;
			}
			int n=b*10;
			int n2;
			if(s-n>10) {
				n2=n+10;
			}else {
				n2=s;
			}
			List<Admin> all01=all.subList(n,n2);
			m.put("num_p", s1);
			m.put("num_b", s);
			m.put("n", n);
			m.put("next_n", b+1);
			m.put("next_p", b-1);
			m.put("admin",all01);
			return "admin_list";
		}
		//团支书查询发展对象
	@RequestMapping("/recommend")
	public String list_recommend_league(ModelMap m,String next,String className) {
	
		List<Recommend> all=recommendService.findAllRecommend();
		List<BaseInformation> all02 = new ArrayList<BaseInformation>();
	for(int i=0;i<all.size();i++){
			if(baseInformationService.findById(all.get(i).getId()).getClassName().getId().equals(className)) {

				all02.add(baseInformationService.findById(all.get(i).getId()));
			}
		}
		
		int s=all02.size();
		int s1=0;
		int b;
		b=Integer.parseInt(next);
		if(s%15!=0) {
			s1=s/15+1;
		}else {
			s1=s/15;
		}
		if(s<=15||b<0) {
				b=0;
		
		}
		int n=b*15;
		int n2;
		if(s-n>15) {
			n2=n+15;
		}else {
			n2=s;
		}
		List<BaseInformation> all01=all02.subList(n,n2);
		m.put("num_p", s1);
		m.put("num_b", s);
		m.put("n", n);
		m.put("next_n", b+1);
		m.put("next_p", b-1);
		m.put("recommends", all01);
		m.put("className", className);
		m.put("tables", tablesService.findAll());

		return "recommend_list";
	}
	//管理员查询发展对象
	@RequestMapping("/recommend_admin")
	public String list_recommend_admin(ModelMap m,String next) {
		List<ClassName> c=classNameService.findAll();
		List<Recommend> all=recommendService.findAllRecommend();
		List<BaseInformation> all02 = new ArrayList<BaseInformation>();
	for(int i=0;i<all.size();i++){
			all02.add(baseInformationService.findById(all.get(i).getId()));
			}
		int s=all02.size();
		int s1=0;
		int b;
		b=Integer.parseInt(next);
		if(s%15!=0) {
			s1=s/15+1;
		}else {
			s1=s/15;
		}
		if(s<=15||b<0) {
				b=0;
		
		}
		int n=b*15;
		int n2;
		if(s-n>15) {
			n2=n+15;
		}else {
			n2=s;
		}
		List<BaseInformation> all01=all02.subList(n,n2);
		m.put("num_p", s1);
		m.put("num_b", s);
		m.put("n", n);
		m.put("next_n", b+1);
		m.put("next_p", b-1);
		m.put("recommends", all01);
		m.put("className", c);
		m.put("batch", batch.findAll());
		m.put("tables", tablesService.findAll());

		return "recommend_admin";
	}
	
	//返回所有表件页面
	@RequestMapping("/allWord")
	public String list_allWord(ModelMap m) {
		m.put("tables", tablesService.findAll());
		return "allWord";
	}
	@RequestMapping("/base_teacher")
	public String list_base_teacher_1(ModelMap m,String next) {
		
		List<BaseInformation> all= baseInformationService.findAllBase();
		int s=all.size();
		int s1=0;
		int b;
		b=Integer.parseInt(next);
		if(s%15!=0) {
			s1=s/15+1;
		}else {
			s1=s/15;
		}
		if(s<=15||b<0) {
				b=0;
		
		}
		int n=b*15;
		int n2;
		if(s-n>15) {
			n2=n+15;
		}else {
			n2=s;
		}
		List<BaseInformation> all01=all.subList(n,n2);
		m.put("num_p", s1);
		m.put("num_b", s);
		m.put("n", n);
		m.put("next_n", b+1);
		m.put("next_p", b-1);	
		m.put("base_teacher", all01);
		return "base_teacher";
	}
	
	//分页按姓名查找
	@RequestMapping("/select_base")
	public String list_base_admin_select(ModelMap m,String next,String name) {	
		List<BaseInformation> all=new ArrayList<>();
		if(baseInformationService.findByName(name)!=null) {
			all.add(baseInformationService.findByName(name));
		}
		List<ClassName> c=classNameService.findAll();
		int s=all.size();
		int s1=0;
		int b;
		b=Integer.parseInt(next);
		if(s%15!=0) {
			s1=s/15+1;
		}else {
			s1=s/15;
		}		
		if(s<=15||b<0) {
			b=0;
		}
		int n=b*15;
		int n2;
		if(s-n>15) {
			n2=n+15;
		}else {
			n2=s;
		}
		List<BaseInformation> all01=all.subList(n,n2);
		m.put("num_p", s1);
		m.put("num_b", s);
		m.put("n", n);
		m.put("next_n", b+1);
		m.put("next_p", b-1);
		m.put("base_0", all01);
		m.put("className", c);
		m.put("name", name);
		m.put("batch", batch.findAll());
		m.put("tables", tablesService.findAll());
		return "select_base";
	}
	
	//分页按班级查找
		@RequestMapping("/select_base_class")
		public String list_base_admin_class(ModelMap m,String next,String className) {	
			List<BaseInformation> all= baseInformationService.findByClassName(classNameService.findOne(className));
			List<ClassName> c=classNameService.findAll();
			int s=all.size();
			int s1=0;
			int b;
			b=Integer.parseInt(next);
			if(s%15!=0) {
				s1=s/15+1;
			}else {
				s1=s/15;
			}		
			if(s<=15||b<0) {
				b=0;
			}
			int n=b*15;
			int n2;
			if(s-n>15) {
				n2=n+15;
			}else {
				n2=s;
			}
			List<BaseInformation> all01=all.subList(n,n2);
			
			m.put("num_p", s1);
			m.put("num_b", s);
			m.put("n", n);
			m.put("next_n", b+1);
			m.put("next_p", b-1);
			m.put("className", c);
			m.put("cl", className);
			m.put("base_0", all01);
			m.put("batch", batch.findAll());
			m.put("tables", tablesService.findAll());
			return "select_base_class";
		}
		
		//分页按批次查找
				@RequestMapping("/select_base_batch")
				public String list_base_admin_batch(ModelMap m,String next,String batch_id) {	
					List<BaseInformation> all= baseInformationService.findByBatch(batch.findOne(batch_id));
					List<ClassName> c=classNameService.findAll();
					int s=all.size();
					int s1=0;
					int b;
					b=Integer.parseInt(next);
					if(s%15!=0) {
						s1=s/15+1;
					}else {
						s1=s/15;
					}		
					if(s<=15||b<0) {
						b=0;
					}
					int n=b*15;
					int n2;
					if(s-n>15) {
						n2=n+15;
					}else {
						n2=s;
					}
					List<BaseInformation> all01=all.subList(n,n2);
					
					m.put("num_p", s1);
					m.put("num_b", s);
					m.put("n", n);
					m.put("next_n", b+1);
					m.put("next_p", b-1);
					m.put("className", c);
					m.put("batch_id", batch_id);
					m.put("batch", batch.findAll());
					
					m.put("base_0", all01);
					m.put("tables", tablesService.findAll());
					return "select_base_batch";
				}
		
		//分页按姓名查找recommned
		@RequestMapping("/select_recommend")
		public String list_re_admin_select(ModelMap m,String next,String name) {	
			List<BaseInformation> a=new ArrayList<>();
			if(baseInformationService.findByName(name)!=null) {
				a.add(baseInformationService.findById(recommendService.findOneRecommend(baseInformationService.findByName(name).getId()).getId()));				
			}
			List<ClassName> c=classNameService.findAll();
			int s=a.size();
			int s1=0;
			int b;
			b=Integer.parseInt(next);
			if(s%15!=0) {
				s1=s/15+1;
			}else {
				s1=s/15;
			}		
			if(s<=15||b<0) {
				b=0;
			}
			int n=b*15;
			int n2;
			if(s-n>15) {
				n2=n+15;
			}else {
				n2=s;
			}
			List<BaseInformation> all01=a.subList(n,n2);
			m.put("num_p", s1);
			m.put("num_b", s);
			m.put("n", n);
			m.put("next_n", b+1);
			m.put("next_p", b-1);
			m.put("className", c);
			m.put("recommends", all01);
			m.put("batch", batch.findAll());
			m.put("name", name);
			m.put("tables", tablesService.findAll());
			return "select_re";
		}
		
		//分页按班级查找
			@RequestMapping("/select_recommend_class")
			public String list_re_admin_class(ModelMap m,String next,String className) {	
				List<Recommend> r=recommendService.findAllRecommend();
				List<ClassName> c=classNameService.findAll();
				List<BaseInformation> all=new ArrayList<>();
				for (int i = 0; i < r.size(); i++) {
					if(className.equals(baseInformationService.findById(r.get(i).getId()).getClassName().getId())) {
						all.add(baseInformationService.findById(r.get(i).getId()));
					}
				}
				
				int s=all.size();
				int s1=0;
				int b;
				b=Integer.parseInt(next);
				if(s%15!=0) {
					s1=s/15+1;
				}else {
					s1=s/15;
				}		
				if(s<=15||b<0) {
					b=0;
				}
				int n=b*15;
				int n2;
				if(s-n>15) {
					n2=n+15;
				}else {
					n2=s;
				}
				List<BaseInformation> all01=all.subList(n,n2);
				m.put("className", c);
				m.put("num_p", s1);
				m.put("num_b", s);
				m.put("n", n);
				m.put("next_n", b+1);
				m.put("next_p", b-1);
				m.put("recommends", all01);
				m.put("classN", className);
				m.put("batch", batch.findAll());
				m.put("tables", tablesService.findAll());
				return "select_re_class";
			}
			
			
			//分页按批次查找
			@RequestMapping("/select_recommend_batch")
			public String list_re_admin_batch(ModelMap m,String next,String batch_id) {	
				List<Recommend> r=recommendService.findAllRecommend();
				List<ClassName> c=classNameService.findAll();
				List<BaseInformation> all=new ArrayList<>();
				
				for(int i=0;i<r.size();i++) {
					
					if(batch_id.equals(baseInformationService.findById(r.get(i).getId()).getBatch().getBatch_id())) {
						all.add(baseInformationService.findById(r.get(i).getId()));
					}
				}
				
				int s=all.size();
				int s1=0;
				int b;
				b=Integer.parseInt(next);
				if(s%15!=0) {
					s1=s/15+1;
				}else {
					s1=s/15;
				}		
				if(s<=15||b<0) {
					b=0;
				}
				int n=b*15;
				int n2;
				if(s-n>15) {
					n2=n+15;
				}else {
					n2=s;
				}
				List<BaseInformation> all01=all.subList(n,n2);
				m.put("batch_id", batch_id);
				m.put("batch", batch.findAll());
				m.put("num_p", s1);
				m.put("className", c);
				m.put("num_b", s);
				m.put("n", n);
				m.put("next_n", b+1);
				m.put("next_p", b-1);
				m.put("recommends", all01);
				m.put("tables", tablesService.findAll());
				return "select_re_batch";
			}
			
			
			//分页查找教师
			@RequestMapping("/teacher")
			public String list_teacher(ModelMap m,String next) {	
				List<Teachers> all=teacher.findAll();
				
				
				int s=all.size();
				int s1=0;
				int b;
				b=Integer.parseInt(next);
				if(s%15!=0) {
					s1=s/15+1;
				}else {
					s1=s/15;
				}		
				if(s<=15||b<0) {
					b=0;
				}
				int n=b*15;
				int n2;
				if(s-n>15) {
					n2=n+15;
				}else {
					n2=s;
				}
				List<Teachers> all01=all.subList(n,n2);
				
				m.put("num_p", s1);
				m.put("num_b", s);
				m.put("n", n);
				m.put("next_n", b+1);
				m.put("next_p", b-1);
				m.put("teacher", all01);
				return "list_teacher";
			}
			
			
			@RequestMapping("/instructions")
			public String instructions() {
				return "instructions";
			}
			//分页查询批次
			@RequestMapping("/batch")
			public String list_batch(ModelMap m,String next) {
				
				List<Batch> all=batch.findAll();
				int s=all.size();
				int s1=0;
				int b;
				b=Integer.parseInt(next);
				if(s%10!=0) {
					s1=s/10+1;
				}else {
					s1=s/10;
				}		
				if(s<=10||b<0) {
					b=0;
				}
				int n=b*10;
				int n2;
				if(s-n>10) {
					n2=n+10;
				}else {
					n2=s;
				}
				List<Batch> all01=all.subList(n,n2);
				m.put("num_p", s1);
				m.put("num_b", s);
				m.put("next_n", b+1);
				m.put("n", n);
				m.put("next_p", b-1);
				m.put("batch", all01);
				return "batch_list";
			}
			
			//返回按批次下载页面
			@RequestMapping("/load")
			public String load(ModelMap m) {
				m.put("batch", batch.findAll());
				m.put("tables", tablesService.findAll());
				
				return "load";
			}
			
			
	//设置状态
			
			//啟用管理員
			@RequestMapping(value="/adminStatus")
			public String SetStatusAdmin(@RequestParam(value="id")String id) {
				Admin admin=adminService.findOneAmdin(id);
				admin.setStatus(1);
				adminService.SaveOneAdmin(admin);
				
				return "redirect:../list/admin?next=0";
			}
			
			//啟用团支书
			@RequestMapping(value="/lsStatus")
			public String SetStatusLs(@RequestParam(value="id")String id) {
				LeagueSecretary league=leagueSecretaryService.findOne(id);
				league.setStatus(1);
				leagueSecretaryService.saveOneLeague(league);
				
				return "redirect:../list/league?next=0";
			}
			
			//禁用管理員
			@RequestMapping(value="/adminStatusValue")
			public String StatusAdmin(@RequestParam(value="id")String id) {
				
				Admin admin=adminService.findOneAmdin(id);
				admin.setStatus(0);
				adminService.SaveOneAdmin(admin);
				
				return "redirect:../list/admin?next=0";
			}
			
			//禁用团支书
			@RequestMapping(value="/lsStatusValue")
			public String StatusLs(@RequestParam(value="id")String id) {
				
				LeagueSecretary league=leagueSecretaryService.findOne(id);
				league.setStatus(0);
				leagueSecretaryService.saveOneLeague(league);
				
				return "redirect:../list/league?next=0";
			}

			//个人信息修改页面
	@RequestMapping(value="person")
	public String person(HttpServletRequest httpServletRequest,ModelMap modelMap){
		String id=(String)httpServletRequest.getSession().getAttribute("id");
		modelMap.put("person",superAdminService.findOneSuper(id));
		return "person";
	}

	@RequestMapping(value = "update_person")
	public String update_person(String password,String name,HttpServletRequest httpServletRequest,ModelMap modelMap){

		String id=(String)httpServletRequest.getSession().getAttribute("id");
		SuperAdmin superAdmin =superAdminService.findOneSuper(id);
		String p=superAdmin.getPassword();
		superAdmin.setName(name);
		superAdmin.setPassword(password);
		superAdminService.save(superAdmin);
		if (p.equals(password)){
			modelMap.put("mes","信息修改成功");
			return person(httpServletRequest,modelMap);
		}else {
			httpServletRequest.getSession().removeAttribute("id");
			modelMap.put("mes","密码被修改请重新登录");
			return "redirect:../list/login";

		}


	}
}