package com.tt.sms.vo;

import lombok.Data;

import javax.persistence.*;

/**
 * 班级表
 */
@Data
@Entity
@Table(name = "tt_school")
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 自增主键
	private Long id;
	
	@Column(name = "name")
	private String name;
	
}
