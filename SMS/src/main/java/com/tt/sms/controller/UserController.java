package com.tt.sms.controller;

import com.tt.sms.dao.UserRepository;
import com.tt.sms.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	/**
	 * 返回所有用户列表
	 * @return
	 */
	@RequestMapping(value="/user/getAllUser")
	public List<UserInfo> getAllUser() {
		return userRepository.findAll();
	}
}
