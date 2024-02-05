package com.info.Service;

import com.info.dto.Test;
import com.info.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    TestMapper testMapper;

    public List<Test> getAll() throws Exception {
        return testMapper.getAll();
    }
}
