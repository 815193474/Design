package com.aitew.Manager.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name= "base")
public class BaseInformation {
	  @Id
	    @GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
	    @GeneratedValue(generator = "hibernate-uuid")
	    @Column(name = "id",columnDefinition = "varchar(32) comment '编号'")
		private String id;
	  @Column(nullable=false,columnDefinition="varchar(50) comment '姓名'")
	  	private String name;
	  @Column(nullable=false,columnDefinition="varchar(50) comment '性别'")
	  private String sex;
	  @Column(nullable=false,columnDefinition="varchar(50) comment '民族'")
	  private String nation;
	  @Column(nullable=false,columnDefinition="varchar(50) comment '籍贯'")
	  private String nativePlace;
	  @Column(nullable=false,columnDefinition="varchar(50) comment '学历'")
	  private String education;
	  @Column(nullable=false,columnDefinition="varchar(50) comment '身份证号码'")
	  private String idCardNumber;
	  @Column(nullable=false,columnDefinition="varchar(50) comment '居住地'")
	  private String address;
	  @JoinColumn(name="Resume_party_name_b")//简历
	  @ManyToOne
	  private Resume resume;
	  @JoinColumn(name="family_party_name_b")//家庭背景
	  @ManyToOne
	  private Family family;
	  @Column(nullable=false,columnDefinition="varchar(20) comment '出生日期'")
	  private String birthday;
	  @Column(nullable=false,columnDefinition="varchar(20) comment '入团时间'")
	  private String entryPartyTime;
	  @Column(nullable=false,columnDefinition="varchar(20) comment '申请入党时间'")
	  private String applyTime;
	  @Column(nullable=false,columnDefinition="varchar(20) comment '参加工作日期'")
	  private String entryWorkTime;
	  @Column(nullable=true,columnDefinition="varchar(20) comment '审批日期'")
	  private String time;
	@Column(nullable=true,columnDefinition="varchar(20) comment '积极分子确定日期'")
	private String baseTime;
	@Column(nullable=true,columnDefinition="varchar(20) comment '推优日期'")
	private String recommendTime;
	@Column(nullable=true,columnDefinition="varchar(20) comment '召开支部委员会日期'")
	private String meetingTime;
	@Column(nullable=true,columnDefinition="varchar(20) comment '预备期结束日期'")
	private String recommendStopTime;
	@Column(nullable=true,columnDefinition="varchar(20) comment '培训班开始日期'")
	private String startTime;
	@Column(nullable=true,columnDefinition="varchar(20) comment '培训班结束日期'")
	private String stopTime;
	  @JoinColumn(name="className")//班级
	  @ManyToOne
	  private ClassName className;
	  @JoinColumn(name="batch")//录入批次
	  @ManyToOne
	  private Batch batch;
	  @JoinColumn(name="teacher_1")//谈话老师一
	  @ManyToOne
	  private Teachers teachers_1;

	  @JoinColumn(name="teacher_2")//谈话老师二
	  @ManyToOne
	  private Teachers teachers_2;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getNativePlace() {
		return nativePlace;
	}

	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getIdCardNumber() {
		return idCardNumber;
	}

	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Resume getResume() {
		return resume;
	}

	public void setResume(Resume resume) {
		this.resume = resume;
	}

	public Family getFamily() {
		return family;
	}

	public void setFamily(Family family) {
		this.family = family;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEntryPartyTime() {
		return entryPartyTime;
	}

	public void setEntryPartyTime(String entryPartyTime) {
		this.entryPartyTime = entryPartyTime;
	}

	public String getApplyTime() {
		return applyTime;
	}

	public void setApplyTime(String applyTime) {
		this.applyTime = applyTime;
	}

	public String getEntryWorkTime() {
		return entryWorkTime;
	}

	public void setEntryWorkTime(String entryWorkTime) {
		this.entryWorkTime = entryWorkTime;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public ClassName getClassName() {
		return className;
	}

	public void setClassName(ClassName className) {
		this.className = className;
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	public Teachers getTeachers_1() {
		return teachers_1;
	}

	public void setTeachers_1(Teachers teachers_1) {
		this.teachers_1 = teachers_1;
	}

	public Teachers getTeachers_2() {
		return teachers_2;
	}

	public void setTeachers_2(Teachers teachers_2) {
		this.teachers_2 = teachers_2;
	}

	public String getBaseTime() {
		return baseTime;
	}

	public void setBaseTime(String baseTime) {
		this.baseTime = baseTime;
	}

	public String getRecommendTime() {
		return recommendTime;
	}

	public void setRecommendTime(String recommendTime) {
		this.recommendTime = recommendTime;
	}

	public String getMeetingTime() {
		return meetingTime;
	}

	public void setMeetingTime(String meetingTime) {
		this.meetingTime = meetingTime;
	}

	public String getRecommendStopTime() {
		return recommendStopTime;
	}

	public void setRecommendStopTime(String recommendStopTime) {
		this.recommendStopTime = recommendStopTime;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStopTime() {
		return stopTime;
	}

	public void setStopTime(String stopTime) {
		this.stopTime = stopTime;
	}

	@Override
	public String toString() {
		return "BaseInformation{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", sex='" + sex + '\'' +
				", nation='" + nation + '\'' +
				", nativePlace='" + nativePlace + '\'' +
				", education='" + education + '\'' +
				", idCardNumber='" + idCardNumber + '\'' +
				", address='" + address + '\'' +
				", resume=" + resume +
				", family=" + family +
				", birthday='" + birthday + '\'' +
				", entryPartyTime='" + entryPartyTime + '\'' +
				", applyTime='" + applyTime + '\'' +
				", entryWorkTime='" + entryWorkTime + '\'' +
				", time='" + time + '\'' +
				", baseTime='" + baseTime + '\'' +
				", recommendTime='" + recommendTime + '\'' +
				", meetingTime='" + meetingTime + '\'' +
				", recommendStopTime='" + recommendStopTime + '\'' +
				", startTime='" + startTime + '\'' +
				", stopTime='" + stopTime + '\'' +
				", className=" + className +
				", batch=" + batch +
				", teachers_1=" + teachers_1 +
				", teachers_2=" + teachers_2 +
				'}';
	}
}
