package com.aitew.Manager.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "class")
public class ClassName {
	@Id
	@Column(name="classid",columnDefinition="varchar(10) comment '班级编号'")
	private String id;
	@Column(name="className",columnDefinition="varchar(30) comment '班级名称'")
	private String className;

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ClassName [id=" + id + ", className=" + className + "]";
	}

	

}
