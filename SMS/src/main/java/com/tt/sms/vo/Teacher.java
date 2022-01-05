package com.tt.sms.vo;

import lombok.Data;

import javax.persistence.*;

/**
 * 学生信息表
 */
@Data
@Entity
@Table(name = "tt_teacher")
public class Teacher {
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
	@Column(name = "contactPhone")
	private String contactPhone;
	@Column(name = "position")
	private String position;
	
}
