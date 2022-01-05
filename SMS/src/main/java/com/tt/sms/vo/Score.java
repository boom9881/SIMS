package com.tt.sms.vo;

import lombok.Data;

import javax.persistence.*;

/**
 * 班级表
 */
@Data
@Entity
@Table(name = "tt_score")
public class Score {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 自增主键
	private Long id;

	@Column(name = "scoreName")
	private String scoreName;


	@Column(name = "scoreValue")
	private String scoreValue;
	
}
