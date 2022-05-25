package github.com.jokereven.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import github.com.jokereven.entity.ProjectInfo;
import github.com.jokereven.service.ProjectInfoService;
import github.com.jokereven.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author jokereven
 */

@Controller
public class ProjectInfoController {

    /**
     * 自动装置
     * */

    @Autowired
    private ProjectInfoService projectInfoService;

    // 请求分页查询页面数据 get all return json data

    @RequestMapping("/3a")
    public String api(){
        return "api";
    }

    @RequestMapping("/projectInfos")
    @ResponseBody
    public Msg GetAllProjectInfoWithJson(@RequestParam(value="pn",defaultValue = "1") Integer pn){
        System.out.println("ok ok ok ok");
        PageHelper.startPage(pn,5);
        List<ProjectInfo> infos = projectInfoService.getAll();
        PageInfo page = new PageInfo(infos,5);
        System.out.println("get page list to string"+page.getList().toString());
        return Msg.success().add("pageInfo",page);
    }
}