package com.cyh.business.controller;

import com.cyh.business.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * Created by ruochu on 2017/8/3.
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(){

        return "login/login";
    }

    @GetMapping("/gettabledata")
    @ResponseBody
    public Map<String,Object> getTableData(){
        List<User> users = new ArrayList<>();
        Map<String,Object> dataMap = new HashMap<>();
        User u = new User();
        u.setSex("1");
        u.setUserId(123);
        u.setUsername("cyh");
        u.setCreateTime(new Date());
        users.add(u);
        dataMap.put("count",users.size());
        dataMap.put("list",users);
        return dataMap;
    }

}
