package teng.spring04webrestful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import teng.spring04webrestful.exception.UserNotExistException;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String sayHello(@RequestParam("user") String username) {
        if ("aaa".equals(username)) {
            throw new UserNotExistException();
        }
        return "<h1>HELLO world!";
    }

    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("hello", "<h1>你好</h1>");
        map.put("users", Arrays.asList("zhangsan", "lisi", "wangmazi"));
        return "success";
    }
}
