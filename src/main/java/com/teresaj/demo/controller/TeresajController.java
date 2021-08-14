package com.teresaj.demo.controller;

import com.teresaj.demo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TeresajController {
    @GetMapping("/hello")
    public String test() {
        return "Hello Docker!! && Devops ~~~";
    }

    @GetMapping("/getUserInfo")
    public void test1() {
        List<User> list = new ArrayList<>();
        list.add(new User("张三", 23));
        list.add(new User("李四", 22));
        list.add(new User("王五", 25));
        JSONArray userJson = JSONArray.parseArray(JSON.toJSONString(list));
        userJson.forEach(User -> System.out.println(userJson.toJSONString()));
    }
}
