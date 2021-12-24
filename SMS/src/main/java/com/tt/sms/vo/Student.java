package com.tt.sms.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 学生信息表
 */
@Data
@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 自增主键
	private Long id;
	
	@Column(name = "name")
	private String name;
	@Column(name = "sex")
	private String sex;
	@Column(name = "address")
	private String address;
	@Column(name = "class_id")
	private Long classId;//班级外键
	@Column(name = "image")
	private String image;
	
}
