package com.tt.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tt.sms.dao.UserRepository;
import com.tt.sms.vo.User;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	/**
	 * 返回所有用户列表
	 * @return
	 */
	@RequestMapping(value="/user/getAllUser")
	public List<User> getAllUser() {
		return userRepository.findAll();
	}
}
