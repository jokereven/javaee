package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hi")
public class IndexController {
    @RequestMapping("/hello")
    public String hello(){
        return "index";
    }
}
