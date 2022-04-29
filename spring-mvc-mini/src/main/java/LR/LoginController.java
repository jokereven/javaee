package LR;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class LoginController {
    Logger logger = LogManager.getLogger(LoginController.class);

    @RequestMapping("/login" )
    @ResponseBody
    public String login(String account){
        logger.debug("Hello + "+account);
        return "Hello + " + account;
    }
}
