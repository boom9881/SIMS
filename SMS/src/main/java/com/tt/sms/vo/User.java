package com.tt.sms.vo;

import lombok.Data;

@Data
public class User {
    String id;
    String name;
    String age;
    String className;
    String sex;

    public User(String name, String age, String className) {
    }

    public User() {

    }
}
