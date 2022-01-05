package com.tt.sms.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 系统账号信息表
 */
@Data
@Entity
@Table(name = "tt_userInfo")
public class UserInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 自增主键
	private Long id;

	@Column(name = "name")
	private String name;
	@Column(name = "login_name")
	private String loginName;
	@Column(name = "password")
	private String password;
	@Column(name = "description")
	private String description;
	@Column(name = "phone")
	private String phone;

}
