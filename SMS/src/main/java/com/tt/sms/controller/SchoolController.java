package com.tt.sms.controller;

import com.tt.sms.dao.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {

    @Autowired
    SchoolRepository schoolRepository;
}
