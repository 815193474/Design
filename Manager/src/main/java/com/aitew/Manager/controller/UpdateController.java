package com.aitew.Manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aitew.Manager.service.BaseInformationService;
import com.aitew.Manager.service.FamilyService;
import com.aitew.Manager.service.ResumeService;
import com.aitew.Manager.service.TalkService;
import com.aitew.Manager.service.TeacherService;
import com.aitew.Manager.vo.BaseInformation;
@Controller
@RequestMapping("/update")
public class UpdateController {
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private ResumeService resumeService;
	@Autowired
	private TeacherService teacher;
	@Autowired
	private FamilyService familyService;
	@Autowired
	private BaseInformationService baseInformationService;
	@Autowired
	private TalkService talkService;
	@Autowired
	private ListController list;
	@RequestMapping("/base")
//入党申请人员基础信息修改
	public String update_base(String id,ModelMap m) {
		m.put("b", baseInformationService.findById(id));
		return "update_base";
	}

	@RequestMapping("/base_teacher")
	public String base_t(String id,ModelMap m) {
		m.put("update_t", baseInformationService.findById(id));
		m.put("teacher", teacher.findAll());
		return "update_teacher";
	}
	@RequestMapping("/update_base_teacher")
	public String base_teacher(String id,String teacher_1,String teacher_2,ModelMap m) {
		BaseInformation ba=baseInformationService.findById(id);
		ba.setTeachers_1(teacherService.findByName(teacher_1));
		ba.setTeachers_2(teacherService.findByName(teacher_2));
		baseInformationService.saveOnebase(ba);
		
		return "update_teacher";
	}
	
	
}
