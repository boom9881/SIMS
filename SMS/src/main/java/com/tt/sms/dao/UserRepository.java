package com.tt.sms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tt.sms.vo.User;

public interface UserRepository extends JpaRepository<User,Long>{
	
}
