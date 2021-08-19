package com.teresaj.demo.controller;

import com.teresaj.demo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class TeresajController {
    @GetMapping("/hello")
    public String test() {
        return "Hello Docker!! && Devops ~~~"+new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss").format(new Date());
    }

    @GetMapping("/getUserList")
    @ResponseBody
    public List<User> test1() {
        List<User> list = new ArrayList<>();
        list.add(new User("张三", 23));
        list.add(new User("李四", 22));
        list.add(new User("王五", 25));
        return list;
    }
}
