package com.tt.sms.controller;

import com.alibaba.fastjson.JSON;
import com.tt.sms.vo.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
class SampleController {
    @ResponseBody
    @RequestMapping("/hi")
    public String hello() {
        return "Hello";
    }

    /*default value*/
    /*带默认值的*/
    @ResponseBody
    @RequestMapping("/goods")
    public String showGoods(@RequestParam(defaultValue = "Potato") String productName) {
        return "product name:" + productName;
    }

    @ResponseBody
    @RequestMapping("/user")
    public User getUser() {
        return new User("Tom1", "boy", "student");
    }

    @ResponseBody
    @RequestMapping("/login")
    public User login(User user) {
        user.setName(user.getName() + " Wong");
        return user;
    }

    @ResponseBody
    @RequestMapping("/login2")
    public void login2(User user, HttpServletResponse response) {
        try {
            user.setName(user.getName() + " Wong");
            response.getWriter().write(JSON.toJSONString(user));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/start1")
    public String start(Model model){

        List<User> list = new ArrayList<>();

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
