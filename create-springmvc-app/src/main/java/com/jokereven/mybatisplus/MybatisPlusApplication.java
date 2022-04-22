package com.jokereven.mybatisplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@SpringBootApplication
public class MybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusApplication.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return "hello, now is: " + new Date().toString();
    }

    @RequestMapping("/welcome")
    @ResponseBody
    public String welcome() {
        return "欢迎来到SpringMVC课堂";
    }
}
