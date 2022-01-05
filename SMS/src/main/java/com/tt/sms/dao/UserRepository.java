package com.tt.sms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tt.sms.vo.UserInfo;

public interface UserRepository extends JpaRepository<UserInfo,Long>{
	
}
