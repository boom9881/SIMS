package com.tt.sms.controller;

import com.tt.sms.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StartController {
    @GetMapping("/start")
    public String start(Model model){

        List<User> list = new ArrayList<User>();

        User user = new User();
        user.setId("001");
        user.setName("王帅帅");
        user.setSex("男");

        User user1 = new User();
        user1.setId("002");
        user1.setName("王小帅");
        user1.setSex("男");

        User user2 = new User();
        user2.setId("003");
        user2.setName("王衰衰");
        user2.setSex("女");

        list.add(user);
        list.add(user1);
        list.add(user2);

        model.addAttribute("users",list);
        return "start";
    }
}
