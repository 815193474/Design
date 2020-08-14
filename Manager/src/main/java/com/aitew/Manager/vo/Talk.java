package com.aitew.Manager.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="talk")
public class Talk {
	 @Id
	@Column(name = "id",columnDefinition = "varchar(32) comment '编号'")
		private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Column(nullable=false,columnDefinition = "varchar(32) comment '入党申请人姓名'")
	private String name_b;
	 @Column(nullable=false,columnDefinition="varchar(100) comment '入党申请人职务'")
	 private String post_b;
	 @Column(nullable=false,columnDefinition="varchar(100) comment '谈话人姓名'")
	 private String name_t;
	 @Column(nullable=false,columnDefinition="varchar(100) comment '谈话人职务'")
	 private String post_t;
	 @Column(nullable=false,columnDefinition="date comment '谈话时间'")
	 private String time;
	 @Column(nullable=false,columnDefinition="varchar(100) comment '谈话地点'")
	 private String talk_address;
	 @Column(nullable=false,columnDefinition="varchar(100) comment '记录人'")
	 private String recorder;
	 @Column(nullable=false,columnDefinition="varchar(100) comment '谈话内容'")
	 private String talk_details;
	public String getName_b() {
		return name_b;
	}
	public void setName_b(String name_b) {
		this.name_b = name_b;
	}
	public String getPost_b() {
		return post_b;
	}
	public void setPost_b(String post_b) {
		this.post_b = post_b;
	}
	public String getName_t() {
		return name_t;
	}
	public void setName_t(String name_t) {
		this.name_t = name_t;
	}
	public String getPost_t() {
		return post_t;
	}
	public void setPost_t(String post_t) {
		this.post_t = post_t;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTalk_address() {
		return talk_address;
	}
	public void setTalk_address(String talk_address) {
		this.talk_address = talk_address;
	}
	public String getRecorder() {
		return recorder;
	}
	public void setRecorder(String recorder) {
		this.recorder = recorder;
	}
	public String getTalk_details() {
		return talk_details;
	}
	public void setTalk_details(String talk_details) {
		this.talk_details = talk_details;
	}
	@Override
	public String toString() {
		return "Talk [id=" + id + ", name_b=" + name_b + ", post_b=" + post_b + ", name_t=" + name_t + ", post_t="
				+ post_t + ", time=" + time + ", talk_address=" + talk_address + ", recorder=" + recorder
				+ ", talk_details=" + talk_details + "]";
	}

	 
}
