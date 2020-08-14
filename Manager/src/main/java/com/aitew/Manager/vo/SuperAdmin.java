package com.aitew.Manager.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name= "superadmin")
public class SuperAdmin {
	@Id
	  @Column(name="id",columnDefinition="varchar(50) comment '账号'")
	private String id;
	  @Column(nullable=false,columnDefinition="varchar(50) comment '昵称'")
	private String name;
	  @Column(nullable=false,columnDefinition="varchar(50) comment '密码'")
	private String password;
	  @JoinColumn(name="type")//类型
	  @ManyToOne
	  private Type type;
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
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "SuperAdmin [id=" + id + ", name=" + name + ", password=" + password + ", type=" + type + "]";
	}
	  
}
