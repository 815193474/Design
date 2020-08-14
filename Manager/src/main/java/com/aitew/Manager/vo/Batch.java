package com.aitew.Manager.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="batch")
public class Batch {
	@Id
	 @Column(name="batch_id",columnDefinition="varchar(10) comment '批次号'")
	private String batch_id;

	public String getBatch_id() {
		return batch_id;
	}

	public void setBatch_id(String batch_id) {
		this.batch_id = batch_id;
	}

	@Override
	public String toString() {
		return "Batch [batch_id=" + batch_id + "]";
	}
	
}
