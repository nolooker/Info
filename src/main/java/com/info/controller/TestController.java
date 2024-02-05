package com.info.controller;

import com.info.Service.TestService;
import com.info.dto.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/query")
    public List<Test> query() throws Exception {
        return testService.getAll();
    }
}
