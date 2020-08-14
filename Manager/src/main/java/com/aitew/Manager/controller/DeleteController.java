package com.aitew.Manager.controller;


import com.aitew.Manager.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/del")
public class DeleteController {
	@Autowired
	private LeagueSecretaryService leagueSecretaryService;
	@Autowired
	private RecommendService recommendService;
	@Autowired
	private ResumeService resumeService;
	@Autowired
	private FamilyService familyService;
	@Autowired
	private TeacherService teacher;
	@Autowired
	private BaseInformationService baseInformationService;
	@Autowired
	private TalkService talkService;
	@Autowired
	private ListController list;
	@Autowired
	private ClassNameService classNameService;
	@Autowired
	private BatchService batch;

	@Autowired
	private AdminService adminService;

	//League对信息的删除
	@RequestMapping("/base")
	public String del_base(String id, ModelMap m, String className) {
		String s = baseInformationService.findById(id).getName();
		baseInformationService.delOneBase(id);
		talkService.delOneTalk(id);
		resumeService.delOneResume(s);
		familyService.delOneFamily(s);
		if (recommendService.findOneRecommend(id).getId().equals(id)) {
			recommendService.delOneRecommend(id);
		} else {
		}
		String next = "0";
		return list.list_base(m, next, classNameService.findOne(className).getId());
	}

	//管理员删除基本信息
	@RequestMapping("/base_admin")
	public String del_bases(String id, ModelMap m) {
		String s = baseInformationService.findById(id).getName();
		baseInformationService.delOneBase(id);
		talkService.delOneTalk(id);
		resumeService.delOneResume(s);
		familyService.delOneFamily(s);
		if (recommendService.findOneRecommend(id).getId().equals(id)) {
			recommendService.delOneRecommend(id);
		} else {
		}
		String next = "0";
		return list.list_base_admin(m, next);
	}

	//删除班级
	@RequestMapping("/class")
	public String del_class(String id, ModelMap m) {
		if (classNameService.delOneClass(id) == true) {
			String n = "0";
			return list.list_class(m, n);
		} else {
			return "";
		}

	}

	//删除团支书
	@RequestMapping("league")
	public String del_league(ModelMap m, String id) {
		leagueSecretaryService.delOneLeague(id);
		String x = "0";
		return list.list_league(m, x);
	}

	//取消推优
	@RequestMapping("recommend")
	public String del_recommend(ModelMap m, String id, String next, String className) {
		recommendService.delOneRecommend(id);
		if (className.equals("")) {
			return list.list_recommend_admin(m, next);
		} else {
			return list.list_recommend_league(m, next, className);
		}
	}

	@RequestMapping("recommend_admin")
	public String del_recommend_admin(ModelMap m, String id, String next) {
		recommendService.delOneRecommend(id);
		return list.list_recommend_admin(m, next);
	}

	//删除培养联系人
	@RequestMapping("teacher")
	public String del_teacher(ModelMap m, String id, String next) {
		teacher.del(id);
		return list.list_teacher(m, next);
	}

	//删除批次
	@RequestMapping("batch")
	public String del_batch(String batch_id, ModelMap m) {
		if (batch.delOne(batch_id) == true) {
			String next = "0";
			return list.list_batch(m, next);
		} else {
			return "";
		}

	}

	//删除管理员
	@RequestMapping("admin")
	public String del_admin(String id, ModelMap m) {
		if (adminService.delOneAdmin(id) == true) {
			String next = "0";
			return list.list_admin(m,next);
		} else {
			return "";
		}
	}

}