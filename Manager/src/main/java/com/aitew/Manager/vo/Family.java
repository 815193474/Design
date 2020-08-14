package com.aitew.Manager.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name= "family")
public class Family {
	 @Id
	  @Column(name="party_name_b",columnDefinition="varchar(30) comment '外键'")
	  private String party_name_b;
	  public void setParty_name_b(String party_name_b) {
		this.party_name_b = party_name_b;
	}
	@Column(nullable=true,columnDefinition="varchar(30) comment '姓名1'")
	  	private String name_0;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '姓名2'")
	  	private String name_1;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '姓名3'")
	  	private String name_2;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '姓名4'")
	  	private String name_3;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '姓名5'")
	  	private String name_4;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '姓名6'")
	  	private String name_5;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '关系1'")
	  	private String relative_0;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '关系2'")
	  	private String relative_1;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '关系3'")
	  	private String relative_2;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '关系4'")
	  	private String relative_3;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '关系5'")
	  	private String relative_4;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '关系6'")
	  	private String relative_5;
	  
	  @Column(nullable=true,columnDefinition="varchar(30) comment '政治面貌1'")
	  	private String politicalLandscape_0;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '政治面貌2'")
	  	private String politicalLandscape_1;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '政治面貌3'")
	  	private String politicalLandscape_2;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '政治面貌4'")
	  	private String politicalLandscape_3;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '政治面貌5'")
	  	private String politicalLandscape_4;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '政治面貌6'")
	  	private String politicalLandscape_5;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '职务1'")
	  	private String post_0;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '职务2'")
	  	private String post_1;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '职务3'")
	  	private String post_2;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '职务4'")
	  	private String post_3;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '职务5'")
	  	private String post_4;
	  @Column(nullable=true,columnDefinition="varchar(30) comment '职务6'")
	  	private String post_5;
	

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
	public String getRelative_0() {
		return relative_0;
	}
	public void setRelative_0(String relative_0) {
		this.relative_0 = relative_0;
	}
	public String getRelative_1() {
		return relative_1;
	}
	public void setRelative_1(String relative_1) {
		this.relative_1 = relative_1;
	}
	public String getRelative_2() {
		return relative_2;
	}
	public void setRelative_2(String relative_2) {
		this.relative_2 = relative_2;
	}
	public String getRelative_3() {
		return relative_3;
	}
	public void setRelative_3(String relative_3) {
		this.relative_3 = relative_3;
	}
	public String getRelative_4() {
		return relative_4;
	}
	public void setRelative_4(String relative_4) {
		this.relative_4 = relative_4;
	}
	public String getRelative_5() {
		return relative_5;
	}
	public void setRelative_5(String relative_5) {
		this.relative_5 = relative_5;
	}
	public String getPoliticalLandscape_0() {
		return politicalLandscape_0;
	}
	public void setPoliticalLandscape_0(String politicalLandscape_0) {
		this.politicalLandscape_0 = politicalLandscape_0;
	}
	public String getPoliticalLandscape_1() {
		return politicalLandscape_1;
	}
	public void setPoliticalLandscape_1(String politicalLandscape_1) {
		this.politicalLandscape_1 = politicalLandscape_1;
	}
	public String getPoliticalLandscape_2() {
		return politicalLandscape_2;
	}
	public void setPoliticalLandscape_2(String politicalLandscape_2) {
		this.politicalLandscape_2 = politicalLandscape_2;
	}
	public String getPoliticalLandscape_3() {
		return politicalLandscape_3;
	}
	public void setPoliticalLandscape_3(String politicalLandscape_3) {
		this.politicalLandscape_3 = politicalLandscape_3;
	}
	public String getPoliticalLandscape_4() {
		return politicalLandscape_4;
	}
	public void setPoliticalLandscape_4(String politicalLandscape_4) {
		this.politicalLandscape_4 = politicalLandscape_4;
	}
	public String getPoliticalLandscape_5() {
		return politicalLandscape_5;
	}
	public void setPoliticalLandscape_5(String politicalLandscape_5) {
		this.politicalLandscape_5 = politicalLandscape_5;
	}
	public String getPost_0() {
		return post_0;
	}
	public void setPost_0(String post_0) {
		this.post_0 = post_0;
	}
	public String getPost_1() {
		return post_1;
	}
	public void setPost_1(String post_1) {
		this.post_1 = post_1;
	}
	public String getPost_2() {
		return post_2;
	}
	public void setPost_2(String post_2) {
		this.post_2 = post_2;
	}
	public String getPost_3() {
		return post_3;
	}
	public void setPost_3(String post_3) {
		this.post_3 = post_3;
	}
	public String getPost_4() {
		return post_4;
	}
	public void setPost_4(String post_4) {
		this.post_4 = post_4;
	}
	public String getPost_5() {
		return post_5;
	}
	public void setPost_5(String post_5) {
		this.post_5 = post_5;
	}
	public String getParty_name_b() {
		return party_name_b;
	}
	@Override
	public String toString() {
		return "Family [party_name_b=" + party_name_b + ", name_0=" + name_0 + ", name_1=" + name_1 + ", name_2="
				+ name_2 + ", name_3=" + name_3 + ", name_4=" + name_4 + ", name_5=" + name_5 + ", relative_0="
				+ relative_0 + ", relative_1=" + relative_1 + ", relative_2=" + relative_2 + ", relative_3="
				+ relative_3 + ", relative_4=" + relative_4 + ", relative_5=" + relative_5 + ", politicalLandscape_0="
				+ politicalLandscape_0 + ", politicalLandscape_1=" + politicalLandscape_1 + ", politicalLandscape_2="
				+ politicalLandscape_2 + ", politicalLandscape_3=" + politicalLandscape_3 + ", politicalLandscape_4="
				+ politicalLandscape_4 + ", politicalLandscape_5=" + politicalLandscape_5 + ", post_0=" + post_0
				+ ", post_1=" + post_1 + ", post_2=" + post_2 + ", post_3=" + post_3 + ", post_4=" + post_4
				+ ", post_5=" + post_5 + "]";
	}

	

	  
}
