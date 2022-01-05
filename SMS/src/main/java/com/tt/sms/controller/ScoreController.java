package com.tt.sms.controller;

import com.tt.sms.dao.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreController {

    @Autowired
    ScoreRepository scoreRepository;
}
