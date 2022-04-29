package IndexController;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

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
}
