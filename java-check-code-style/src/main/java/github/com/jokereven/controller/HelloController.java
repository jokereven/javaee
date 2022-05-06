package github.com.jokereven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 * @author jokereven
 */
@Controller
@RequestMapping("/hi")
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello World";
    }
    @RequestMapping("/hello_one")
    public String hello1(){
//        System.out.println("TEST");
        return "index_one";
    }
}
