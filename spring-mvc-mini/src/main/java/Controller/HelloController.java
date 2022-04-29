package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hi")
public class HelloController {

    // 访问 http://localhost:8080/spring_mvc_mini_war_exploded/hi/hello
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello World";
    }

    // 访问 http://localhost:8080/spring_mvc_mini_war_exploded/hi/api
    @RequestMapping("/api")
    @ResponseBody
    public String username(String username){
        return username;
    }

    // 请求 http://localhost:8080/spring_mvc_mini_war_exploded/hi/name?uname=jokereven
    @RequestMapping("/name")
    @ResponseBody
    public String NameParam(@RequestParam("uname") String username){
        return username;
    }

    // 请求 http://localhost:8080/spring_mvc_mini_war_exploded/hi/required?uname=jokereven
    // 必须 设置请求参数
    @RequestMapping("/required")
    @ResponseBody
    public String Required(@RequestParam(value = "uname") String username){
        return username;
    }

    // 请求 http://localhost:8080/spring_mvc_mini_war_exploded/hi/np?uname=jokereven
    // 不必须 设置请求参数
    // 请求 http://localhost:8080/spring_mvc_mini_war_exploded/hi/np
    @RequestMapping("/np")
    @ResponseBody
    public String RequiredNoParam(@RequestParam(value = "uname",required = false) String username){
        return username;
    }

    // GET请求
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String RequiredMethodGet(@RequestParam(value = "uname",required = false) String username){
        return username;
    }

    // POST请求
    // must use post to request the url
    @RequestMapping(value = "/post", method = RequestMethod.POST)
    @ResponseBody
    public String RequiredMethodPost(@RequestParam(value = "uname",required = false) String username){
        return username;
    }
}
