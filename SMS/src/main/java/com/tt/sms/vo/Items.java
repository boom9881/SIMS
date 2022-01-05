package com.tt.sms.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 记录奖惩信息表
 */
@Data
@Entity
@Table(name = "tt_item")
public class Items {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 自增主键
	private Long id;
	
	@Column(name = "description")
	private String description;
	@Column(name = "student_id")
	private Long studentId;//学生外键
	@Column(name = "score")
	private Long score;//分数
}
