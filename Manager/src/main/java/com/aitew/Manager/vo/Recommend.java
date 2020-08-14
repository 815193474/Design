package com.aitew.Manager.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "recommend")
public class Recommend {
	@Id
	@Column(name="id",columnDefinition="varchar(32) comment '被推荐人id'")
	private String  id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Recommend [id=" + id + "]";
	}



	
	

}
