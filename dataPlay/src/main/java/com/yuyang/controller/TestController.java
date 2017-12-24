package com.yuyang.controller;

import com.yuyang.service.Test2Service;
import com.yuyang.service.TestService;
import com.yuyang.service.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private Test2Service test2Service;

    @RequestMapping(value = "/testMethod", method = RequestMethod.POST)
    public @ResponseBody Map<String,Object> test(){
        Map<String,Object> map = new HashMap<>();
        map.put("state","SUCCESS");
        map.put("xAixs",new String[]{"邮件营销111","联盟广告222","视频广告333","直接访问444","搜索引擎555"});
        map.put("mail",new Integer[]{220, 182, 191, 234, 2910, 330, 310});
        map.put("state","SUCCESS");
        map.put("str",test2Service.testMethod());
        return map;
    }

    @RequestMapping(value="/index", method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response){
        return new ModelAndView("index");
    }

}
