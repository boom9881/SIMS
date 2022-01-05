package com.tt.sms.controller;

import com.tt.sms.dao.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRoleController {

    @Autowired
    UserRoleRepository userRoleRepository;

    @RequestMapping(value = "/api/userRole/findOne")
    public void findByUserIdAndRoleId(Long userId,Long roleId){
        userRoleRepository.findByUserIdAndRoleId(userId,roleId);
    }

}
