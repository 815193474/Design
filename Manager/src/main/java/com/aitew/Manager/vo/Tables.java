package com.aitew.Manager.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="material")
public class Tables {
	 @Id
	    @GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
	    @GeneratedValue(generator = "hibernate-uuid")
	    @Column(name = "id",columnDefinition = "varchar(32) comment '编号'")
		private String id;
	  @Column(nullable=false,columnDefinition="varchar(50) comment '材料英文名称'")
	  	private String en_name;
	  @Column(nullable=false,columnDefinition="varchar(50) comment '材料中文名称'")
	  private String cn_name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEn_name() {
		return en_name;
	}
	public void setEn_name(String en_name) {
		this.en_name = en_name;
	}
	public String getCn_name() {
		return cn_name;
	}
	public void setCn_name(String cn_name) {
		this.cn_name = cn_name;
	}
	@Override
	public String toString() {
		return "Tables [id=" + id + ", en_name=" + en_name + ", cn_name=" + cn_name + "]";
	}
	  
	  

}
