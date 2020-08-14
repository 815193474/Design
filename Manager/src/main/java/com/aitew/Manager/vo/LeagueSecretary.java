package com.aitew.Manager.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "ls")
public class LeagueSecretary {
	@Id
	  @Column(name="id",columnDefinition="varchar(50) comment '学号'")
	private String id;
	  @Column(nullable=false,columnDefinition="varchar(50) comment '姓名'")
	private String name;
	  @Column(nullable=false,columnDefinition="varchar(50) comment '密码'")
	private String password;
	  @JoinColumn(name="className")//班级
	  @ManyToOne
	private ClassName className;
	  @JoinColumn(name="type")//类型
	  @ManyToOne
	  private Type type;
	  @Column(nullable=false,columnDefinition="int comment 'status'")
	  private int status;
	  
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ClassName getClassName() {
		return className;
	}
	public void setClassName(ClassName className) {
		this.className = className;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "LeagueSecretary [id=" + id + ", name=" + name + ", password=" + password + ", className=" + className
				+ ", type=" + type + ", status=" + status + "]";
	}
	
	
	  
}
