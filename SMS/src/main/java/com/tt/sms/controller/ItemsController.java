package com.tt.sms.controller;

import com.tt.sms.dao.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemsController {

    @Autowired
    ItemsRepository itemsRepository;
}
