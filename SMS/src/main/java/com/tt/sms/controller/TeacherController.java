package com.tt.sms.controller;

import com.tt.sms.dao.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    @Autowired
    TeacherRepository teacherRepository;
}
