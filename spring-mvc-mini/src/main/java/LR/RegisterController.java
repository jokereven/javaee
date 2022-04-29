package LR;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

// TODO 中文乱码
/**
 * @author jokereven
 * @date 2022/4/29
 * @Description:
 * [springMVC:Controller接受前端数据中文出现问号？问题解决](https://blog.csdn.net/qq_36929553/article/details/107691367)
 * [SpringMVC ---- 关于在配置了 produces=“application/json； charset=UTF-8“，依然响应数据中文乱码](https://blog.csdn.net/haduwi/article/details/110288543)
 * [springmvc中解决post请求中文乱码问题](https://github.com/Light-long/Interview/commit/97ebb3be5d4d3e1b182a0663747f0544e5b48748)
 */

@Controller
@RequestMapping("/api")
public class RegisterController {
    Logger logger = LogManager.getLogger(LoginController.class);
    private Object account;
    private Object password;

    @RequestMapping(value = "/register")
    @ResponseBody
    public String RequiredMethodPost(
            @RequestParam(value = "account",required = false) String account ,
            @RequestParam(value = "password",required = false) String password)
    {
        logger.debug("用户名"+account+"密码"+password);
        return "用户名"+account+"密码"+password;
    }
    //    public ModelAndView register(){
//        ModelAndView mav=new ModelAndView("register");
//        mav.addObject("time", new Date());
//        mav.getModel().put("account", account);
//        mav.getModel().put("password", password);
//        return mav;
//    }

}
