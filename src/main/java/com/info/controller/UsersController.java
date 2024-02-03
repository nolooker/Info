package com.info.controller;

import com.info.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @GetMapping(value = "/users")
    public User test() {
        User bean = new User();
        bean.setId("admin");
        bean.setName("관리자");
        return bean;
    }
}
