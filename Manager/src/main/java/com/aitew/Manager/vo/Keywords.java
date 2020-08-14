package com.aitew.Manager.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="keywords")
public class Keywords {
	@Id
	  @Column(name="id",columnDefinition="varchar(20) comment '编号'")
	private String id;
	  @Column(nullable=false,columnDefinition="varchar(50) comment '被推荐姓名'")
	private String name;
	  @Column(nullable=false,columnDefinition="varchar(50) comment '职务'")
	  private String offer;
	  @Column(nullable=false,columnDefinition="varchar(50) comment '推优情况'")
	  private String recommend;
	  @Column(nullable=false,columnDefinition="varchar(50) comment '支委会'")
	  private String view_1;
	  @Column(nullable=false,columnDefinition="varchar(50) comment '党总支'")
	  private String view_2;
	  @Column(nullable=false,columnDefinition="varchar(50) comment '党工委'")
	  private String view_3;
	  @Column(nullable=false,columnDefinition="varchar(50) comment '支委会_签章'")
	  private String signature_1;
	  @Column(nullable=false,columnDefinition="varchar(50) comment '党总支_签章'")
	  private String signature_2;
	  @Column(nullable=false,columnDefinition="varchar(50) comment '党工委_签章'")
	  private String signature_3;
}
