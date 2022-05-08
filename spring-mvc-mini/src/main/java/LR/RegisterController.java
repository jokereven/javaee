package LR;

import entity.U;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    private Object tenantid;

    @RequestMapping(value = "/register")
    public String RequiredMethodLR(
            @RequestParam(value = "name",required = true) String name ,
            @RequestParam(value = "password",required = true) String password,
            @RequestParam(value = "tenantid",required = false) String tenantid,
            Model model)
    {

        // if验证
        if (name.equals("testaccount") & password.equals("888888")){
            logger.debug("欢迎testaccount登陆成功，您的租户号为00000");

            U u = new U();
            u.setName(name);
            u.setPassword(password);
            u.setTenantid(tenantid);
            model.addAttribute(u);

            return "welcome";
        }else{
            logger.debug("对不起，用户名密码不正确，需要重新登录！");


            U u = new U();
            u.setName(name);
            u.setPassword(password);
            u.setTenantid(tenantid);
            model.addAttribute(u);
            return "fail";
        }
    }
    //    public ModelAndView register(){
//        ModelAndView mav=new ModelAndView("register");
//        mav.addObject("time", new Date());
//        mav.getModel().put("account", account);
//        mav.getModel().put("password", password);
//        return mav;
//    }

}
