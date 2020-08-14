package com.aitew.Manager.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="teachers")
public class Teachers {
	@Id
	@GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
    @GeneratedValue(generator = "hibernate-uuid")
	  @Column(name="id",columnDefinition="varchar(32) comment 'id'")
	private String id;
	  @Column(nullable=false,columnDefinition="varchar(20) comment '昵称'")
	private String name;
	  @Column(nullable=false,columnDefinition="varchar(30) comment '职务'")
	private String work;
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
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	@Override
	public String toString() {
		return "Teachers [id=" + id + ", name=" + name + ", work=" + work + "]";
	}
	
}
