package com.aitew.Manager.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="resume")
public class Resume {
	 @Id
	  @Column(name="party_name_b",columnDefinition="varchar(30) comment '外键'")
	  private String party_name_b; 
	  @Column(nullable=false,columnDefinition="varchar(100) comment '工作经历1'")
	  	private String workExperience_0;
	  @Column(nullable=true,columnDefinition="varchar(100) comment '工作经历2'")
	  	private String workExperience_1;
	  @Column(nullable=true,columnDefinition="varchar(100) comment '工作经历3'")
	  	private String workExperience_2;
	  @Column(nullable=true,columnDefinition="varchar(100) comment '工作经历4'")
	  	private String workExperience_3;
	  @Column(nullable=true,columnDefinition="varchar(100) comment '工作经历5'")
	  	private String workExperience_4;
	  @Column(nullable=true,columnDefinition="varchar(100) comment '工作经历6'")
	  	private String workExperience_5;
	  @Column(nullable=false,columnDefinition="varchar(30) comment '证明人1'")
	  private String name_0;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '证明人2'")
	  private String name_1;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '证明人3'")
	  private String name_2;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '证明人4'")
	  private String name_3;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '证明人5'")
	  private String name_4;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '证明人6'")
	  private String name_5;

	public String getWorkExperience_0() {
		return workExperience_0;
	}
	public void setWorkExperience_0(String workExperience_0) {
		this.workExperience_0 = workExperience_0;
	}
	public String getWorkExperience_1() {
		return workExperience_1;
	}
	public void setWorkExperience_1(String workExperience_1) {
		this.workExperience_1 = workExperience_1;
	}
	public String getWorkExperience_2() {
		return workExperience_2;
	}
	public void setWorkExperience_2(String workExperience_2) {
		this.workExperience_2 = workExperience_2;
	}
	public String getWorkExperience_3() {
		return workExperience_3;
	}
	public void setWorkExperience_3(String workExperience_3) {
		this.workExperience_3 = workExperience_3;
	}
	public String getWorkExperience_4() {
		return workExperience_4;
	}
	public void setWorkExperience_4(String workExperience_4) {
		this.workExperience_4 = workExperience_4;
	}
	public String getWorkExperience_5() {
		return workExperience_5;
	}
	public void setWorkExperience_5(String workExperience_5) {
		this.workExperience_5 = workExperience_5;
	}
	public String getName_0() {
		return name_0;
	}
	public void setName_0(String name_0) {
		this.name_0 = name_0;
	}
	public String getName_1() {
		return name_1;
	}
	public void setName_1(String name_1) {
		this.name_1 = name_1;
	}
	public String getName_2() {
		return name_2;
	}
	public void setName_2(String name_2) {
		this.name_2 = name_2;
	}
	public String getName_3() {
		return name_3;
	}
	public void setName_3(String name_3) {
		this.name_3 = name_3;
	}
	public String getName_4() {
		return name_4;
	}
	public void setName_4(String name_4) {
		this.name_4 = name_4;
	}
	public String getName_5() {
		return name_5;
	}
	public void setName_5(String name_5) {
		this.name_5 = name_5;
	}
	public String getParty_name_b() {
		return party_name_b;
	}
	public void setParty_name_b(String party_name_b) {
		this.party_name_b = party_name_b;
	}
	@Override
	public String toString() {
		return "Resume [party_name_b=" + party_name_b + ", workExperience_0=" + workExperience_0 + ", workExperience_1="
				+ workExperience_1 + ", workExperience_2=" + workExperience_2 + ", workExperience_3=" + workExperience_3
				+ ", workExperience_4=" + workExperience_4 + ", workExperience_5=" + workExperience_5 + ", name_0="
				+ name_0 + ", name_1=" + name_1 + ", name_2=" + name_2 + ", name_3=" + name_3 + ", name_4=" + name_4
				+ ", name_5=" + name_5 + "]";
	}



}
