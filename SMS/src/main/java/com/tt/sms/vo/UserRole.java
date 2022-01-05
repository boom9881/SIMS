package com.tt.sms.vo;

import lombok.Data;

import javax.persistence.*;

/**
 * 角色表
 */
@Data
@Entity
@Table(name = "tt_role")
public class UserRole {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 自增主键
	private Long id;

	@Column(name = "userId")
	private long userId;

	@Column(name = "roleId")
	private long roleId;
	
}
