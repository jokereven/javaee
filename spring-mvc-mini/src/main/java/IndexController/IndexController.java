package IndexController;

import entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/api")
public class IndexController {
    // 定义logger对象
    /**
     * @author jokereven
     * @date 2022/4/29
     * @Description: 添加logger
     * [程序包 org.slf4j 不存在 _](https://www.cnblogs.com/ageovb/p/14459561.html)
     * [Web项目Spring 5.x使用log4j 2](https://blog.csdn.net/liudun_cool/article/details/120868975)
    */
    Logger logger = LogManager.getLogger(IndexController.class);
    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView mav=new ModelAndView("index");
        mav.addObject("time", new Date());
        mav.getModel().put("name", "周靖");
        logger.debug("use logger ok");
        return mav;
    }

    @RequestMapping("/user")
    public String index(String userName, Model model){
        // Model 不需要手动创建
        logger.info("从前台传过来的username"+userName);

        // 通过 key value 形式存储
        model.addAttribute("current_name","前台传递过来的"+userName);
        // 直接放到model中
        model.addAttribute(userName);

        // User
        User user = new User();
        user.setId(1);
        user.setuName("jokereven");
        user.setuAge(20);
        // user to model
        model.addAttribute("current_user",user);
        model.addAttribute(user);

        return "jokereven";
    }
    
    /**
     * @author jokereven
     * @date 2022/5/5
     * @Description: controller to view by map
    */

    @RequestMapping("/map")
    public String map(String userName, Map<String , Object> model){
        // Model 不需要手动创建
        logger.info("从前台传过来的username"+userName);

        // 添加map集合到model
        model.put("current_name",userName);

        // User
        User user = new User();
        user.setId(1);
        user.setuName("jokereven");
        user.setuAge(20);

        // 将后台创建的对象放到map集合中
        model.put("current_user",user);

        return "jokereven";
    }
}
