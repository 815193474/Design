package com.aitew.Manager.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aitew.Manager.service.AdminService;
import com.aitew.Manager.service.BaseInformationService;
import com.aitew.Manager.service.BatchService;
import com.aitew.Manager.service.ClassNameService;
import com.aitew.Manager.service.FamilyService;
import com.aitew.Manager.service.LeagueSecretaryService;
import com.aitew.Manager.service.RecommendService;
import com.aitew.Manager.service.ResumeService;
import com.aitew.Manager.service.TalkService;
import com.aitew.Manager.service.TeacherService;
import com.aitew.Manager.service.TypeService;
import com.aitew.Manager.vo.Admin;
import com.aitew.Manager.vo.BaseInformation;
import com.aitew.Manager.vo.Batch;
import com.aitew.Manager.vo.ClassName;
import com.aitew.Manager.vo.Family;
import com.aitew.Manager.vo.LeagueSecretary;
import com.aitew.Manager.vo.Recommend;
import com.aitew.Manager.vo.Resume;
import com.aitew.Manager.vo.Talk;
import com.aitew.Manager.vo.Teachers;

@Controller
@RequestMapping("/insert")
public class InsertController {
	@Autowired
	private RecommendService recommendService;
	@Autowired
	private ResumeService resumeService;
	@Autowired
	private ClassNameService classNameService;
	@Autowired
	private FamilyService familyService;
	@Autowired
	private BaseInformationService baseInformationService;
	@Autowired
	private TalkService talkService;
	@Autowired
	private ListController list;
	@Autowired
	private TypeService typeService;
	@Autowired
	private LeagueSecretaryService leagueService;
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private AdminService adminService;
	@Autowired
	private BatchService batch;
	//插入基础信息
	@RequestMapping("/base")
	public String insertBase(String name_b,String sex,String nation,String birthday,
			String nativePlace,String education,String idCardNumber,String address,
			String entryWorkTime,String entryPartyTime,String applyTime,
			String workExperience_0,String workExperience_1,String workExperience_2,String workExperience_3,String workExperience_4,String workExperience_5,
			String name_r_0,String name_r_1,String name_r_2,String name_r_3,String name_r_4,String name_r_5,
			String relative_0,String relative_1,String relative_2,String relative_3,String relative_4,String relative_5,
			String name_f_0,String name_f_1,String name_f_2,String name_f_3,String name_f_4,String name_f_5,
			String politicalLandscape_0,String politicalLandscape_1,String politicalLandscape_2,String politicalLandscape_3,String politicalLandscape_4,String politicalLandscape_5,
			String post_0,String post_1,String post_2,String post_3,String post_4,String post_5,
			ModelMap m,String id,String className,String teacher_1,String teacher_2,
			String batch_id) {
		String entryWorkTime_1=entryWorkTime.substring(0, 4)+"年"+entryWorkTime.substring(5, 7)+"月"+entryWorkTime.substring(8, 10)+"日";
		String birthday_1=birthday.substring(0, 4)+"年"+birthday.substring(5, 7)+"月"+birthday.substring(8, 10)+"日";
		String entryPartyTime_1=entryPartyTime.substring(0, 4)+"年"+entryPartyTime.substring(5, 7)+"月"+entryPartyTime.substring(8, 10)+"日";
		String applyTime_1=applyTime.substring(0, 4)+"年"+applyTime.substring(5, 7)+"月"+applyTime.substring(8, 10)+"日";

		Resume r=new Resume();
		r.setParty_name_b(name_b);
		r.setName_0(name_r_0);
		r.setName_1(name_r_1);
		r.setName_2(name_r_2);
		r.setName_3(name_r_3);
		r.setName_4(name_r_4);
		r.setName_5(name_r_5);
		r.setWorkExperience_0(workExperience_0);
		r.setWorkExperience_1(workExperience_1);
		r.setWorkExperience_2(workExperience_2);
		r.setWorkExperience_3(workExperience_3);
		r.setWorkExperience_4(workExperience_4);
		r.setWorkExperience_5(workExperience_5);
		
		resumeService.saveOneResume(r);
		Family f=new Family();
		f.setName_0(name_f_0);
		f.setName_1(name_f_1);
		f.setName_2(name_f_2);
		f.setName_3(name_f_3);
		f.setName_4(name_f_4);
		f.setName_5(name_f_5);
		f.setPoliticalLandscape_0(politicalLandscape_0);
		f.setPoliticalLandscape_1(politicalLandscape_1);
		f.setPoliticalLandscape_2(politicalLandscape_2);
		f.setPoliticalLandscape_3(politicalLandscape_3);
		f.setPoliticalLandscape_4(politicalLandscape_4);
		f.setPoliticalLandscape_5(politicalLandscape_5);
		f.setPost_0(post_0);
		f.setPost_1(post_1);
		f.setPost_2(post_2);
		f.setPost_3(post_3);
		f.setPost_4(post_4);
		f.setPost_5(post_5);
		f.setRelative_0(relative_0);
		f.setRelative_1(relative_1);
		f.setRelative_2(relative_2);
		f.setRelative_3(relative_3);
		f.setRelative_4(relative_4);
		f.setRelative_5(relative_5);
		f.setParty_name_b(name_b);
		familyService.saveFamily(f);
	
		
				List<Teachers> all=teacherService.findAll();
				Random ra=new Random();
				int tmp_1=ra.nextInt(all.size());
				int tmp_2=ra.nextInt(all.size());
				while(tmp_1==tmp_2) {
					tmp_2=ra.nextInt(all.size());
				}
		BaseInformation b=new BaseInformation();
		b.setId(id);
		b.setName(name_b);
		b.setSex(sex);
		b.setNation(nation);
		b.setAddress(address);
		b.setBirthday(birthday_1);
		b.setNativePlace(nativePlace);
		b.setEducation(education);
		b.setIdCardNumber(idCardNumber);
		b.setEntryPartyTime(entryPartyTime_1);
		b.setEntryWorkTime(entryWorkTime_1);
		b.setApplyTime(applyTime_1);
		b.setResume(r);
		b.setFamily(f);
		b.setClassName(classNameService.findOne(className));
		b.setBatch(batch.findOne(batch_id));

		if(teacher_1.equals("null")) {
			
			b.setTeachers_1(all.get(tmp_1));
			b.setTeachers_2(all.get(tmp_2));
		}else {
		b.setTeachers_1(teacherService.findByName(teacher_1));
		b.setTeachers_2(teacherService.findByName(teacher_2));
		}
		baseInformationService.saveOnebase(b);
		String n="0";
		
	  return list.list_base(m,n,classNameService.findOne(className).getClassName()); 
	
		
	}
	//插入谈话信息
	@RequestMapping("/talk")
	public String insert_talk(String id,String name_b,String post_b,String name_t,String post_t,
			String time,String talk_address,String recorder,String talk_details,ModelMap m) {
				Talk t=new Talk();
				t.setId(id);
				t.setName_b(name_b);
				t.setName_t(name_t);
				t.setPost_b(post_b);
				t.setPost_t(post_t);
				t.setTime(time);
				t.setTalk_address(talk_address);
				t.setTalk_details(talk_details);
				t.setRecorder(recorder);
				talkService.saveOneTalk(t);
				
		return list.list_talk(m,id);
		
	}
	//返回基础信息插入表
	@RequestMapping("/base_insert")
	public String base_insert(String className,ModelMap m) {
		m.put("batch", batch.findAll());
		m.put("ls", className);
		return "b_insert";
	}
	//返回谈话信息插入表
	@RequestMapping("/talk_insert")
	public String talk_insert() {
		return "talk";
	}
	//返回班级信息插入表
	@RequestMapping("/class")
	public String Classname() {
		return "class_insert";

	}
	//返回团支书信息插入表
	@RequestMapping("/league")
	public String league(ModelMap m) {
		m.put("c", classNameService.findAll());
		
		return "league_insert";

	}
	//团支书信息插入
	@RequestMapping("/league_insert")
	public String league_insert(String username,String password,String name,String className,String type) {
		LeagueSecretary l=new LeagueSecretary();
		l.setClassName(classNameService.findOne(className));
		l.setName(name);
		l.setId(username);
		l.setPassword(password);
		l.setType(typeService.findOneType(type));
		l.setStatus(1);
		leagueService.saveOneLeague(l);
		
		return "league_insert";

	}
	//班级信息插入
	@RequestMapping("/class_insert")
	public String ClassName(String id,String className,ModelMap m) {
		ClassName c=new ClassName();
		c.setId(id);
		c.setClassName(className);
		classNameService.SaveOneClass(c);
		String x="0";
		return list.list_class(m,x);
		
	}
	
	@RequestMapping("/recommend")
	public String insert_recommend(String id,ModelMap m,String next,String className) {
		Recommend re=new Recommend();
		re.setId(id);
		recommendService.saveRecommend(re);
		m.put("recommend_name", baseInformationService.findById(id).getName());
		m.put("className",baseInformationService.findById(id).getClassName().getClassName());
		return list.list_recommend_league(m, next, className);
		
	}
	
	@RequestMapping("/recommend_admin")
	public String insert_recommend_admin(String id,ModelMap m,String next) {
		Recommend re=new Recommend();
		re.setId(id);
		recommendService.saveRecommend(re);
		return list.list_recommend_admin(m, next);
		
	}
	@RequestMapping("admin")
	public String admin() {
		return "admin_insert";
	}
	@RequestMapping("admin_insert")
	public String admin_insert(String id,String type,String name,String password) {
		Admin admin=new Admin();
		admin.setId(id);
		admin.setName(name);
		admin.setPassword(password);
		admin.setType(typeService.findOneType(type));
		admin.setStatus(1);
		adminService.SaveOneAdmin(admin);
		return "admin_list";
	}
	@RequestMapping("teacher")
	public String teacher(String next,ModelMap m ) {
		return "insert_teacher";
		 
	}
	@RequestMapping("t")
	public void t(String name,String work,ModelMap m) {
		
		Teachers t=new Teachers();
		t.setName(name);
		t.setWork(work);
		teacherService.save(t);
		
	}
	@RequestMapping("time")
	public String t(ModelMap m) {
		m.put("batch", batch.findAll());
		return "insert_time";
	}

	//审批时间
	@RequestMapping("insert_time")
	public String t(String time,String batch_id) {
		String time_1=time.substring(0, 4)+"年"+time.substring(5, 7)+"月"+time.substring(8, 10)+"日";
	List<BaseInformation> all=	baseInformationService.findByBatch(batch.findOne(batch_id));
	for(int i=0;i<all.size();i++) {
		BaseInformation b=baseInformationService.findById(all.get(i).getId());
		b.setTime(time_1);
		baseInformationService.saveOnebase(b);
	}
	
				return "insert_time";
	}

	//积极分子确定时间
	@RequestMapping("baseTime_p")
	public String baserTime_p(ModelMap m){
		m.put("batch", batch.findAll());
		return "baseTime";
	}
	@RequestMapping("baseTime")
	public String base_time(String time,String batch_id) {
		String time_1=time.substring(0, 4)+"年"+time.substring(5, 7)+"月"+time.substring(8, 10)+"日";
		List<BaseInformation> all=	baseInformationService.findByBatch(batch.findOne(batch_id));
		for(int i=0;i<all.size();i++) {
			BaseInformation b=baseInformationService.findById(all.get(i).getId());
			b.setBaseTime(time_1);
			baseInformationService.saveOnebase(b);
		}

		return "baseTime";
	}

	//推优时间
	@RequestMapping("recommendTime_p")
	public String recommendTime_p(ModelMap m){
		m.put("batch", batch.findAll());
		return "recommendTime";
	}
	@RequestMapping("recommendTime")
	public String recommendTime(String time,String batch_id) {
		String time_1=time.substring(0, 4)+"年"+time.substring(5, 7)+"月"+time.substring(8, 10)+"日";
		Integer year=Integer.parseInt(time.substring(0, 4))+1;
		System.out.println(year);
		String time_2=year+"年"+time.substring(5, 7)+"月"+time.substring(8, 10)+"日";
		System.out.println(time_2);
		List<BaseInformation> all=	baseInformationService.findByBatch(batch.findOne(batch_id));
		for(int i=0;i<all.size();i++) {
			BaseInformation b=baseInformationService.findById(all.get(i).getId());
			b.setRecommendTime(time_1);
			b.setRecommendStopTime(time_2);
			baseInformationService.saveOnebase(b);
		}

		return "recommendTime";
	}

	//召开支部大会时间
	@RequestMapping("meetingTime_p")
	public String meetingTime_p(ModelMap m){
		m.put("batch", batch.findAll());
		return "meetingTime";
	}
	@RequestMapping("meetingTime")
	public String meetingTime(String time,String batch_id) {
		String time_1=time.substring(0, 4)+"年"+time.substring(5, 7)+"月"+time.substring(8, 10)+"日";
		List<BaseInformation> all=	baseInformationService.findByBatch(batch.findOne(batch_id));
		for(int i=0;i<all.size();i++) {
			BaseInformation b=baseInformationService.findById(all.get(i).getId());
			b.setMeetingTime(time_1);
			baseInformationService.saveOnebase(b);
		}

		return "meetingTime";
	}

	//培训班时间
	@RequestMapping("trainTime_p")
	public String trainTime_p(ModelMap m){
		m.put("batch", batch.findAll());
		return "trainTime";
	}
	@RequestMapping("trainTime")
	public String trainTime(String time,String time1,String batch_id) {
		String time_1=time.substring(0, 4)+"年"+time.substring(5, 7)+"月"+time.substring(8, 10)+"日";
		String time_2=time1.substring(0, 4)+"年"+time1.substring(5, 7)+"月"+time1.substring(8, 10)+"日";
		List<BaseInformation> all=	baseInformationService.findByBatch(batch.findOne(batch_id));
		for(int i=0;i<all.size();i++) {
			BaseInformation b=baseInformationService.findById(all.get(i).getId());
			b.setStartTime(time_1);
			b.setStopTime(time_2);
			baseInformationService.saveOnebase(b);
		}

		return "trainTime";
	}

	@RequestMapping("batch_p")
	public String batch_p() {
		return "batch";
	}
	@RequestMapping("batch")
	public String batch(String batch_id,ModelMap m) {
		Batch b=new Batch();
		b.setBatch_id(batch_id);
		batch.saveOne(b);
		String next="0";
		return list.list_batch(m, next);
	}
}
