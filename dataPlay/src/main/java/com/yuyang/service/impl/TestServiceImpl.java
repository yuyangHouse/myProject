package com.yuyang.service.impl;

import com.yuyang.service.TestService;
import org.springframework.stereotype.Service;

public class TestServiceImpl implements TestService {

    public String testMethod() {
        return "hellow test";
    }
}