package github.com.jokereven.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import github.com.jokereven.entity.ProjectInfo;
import github.com.jokereven.entity.ProjectInfoExample;
import github.com.jokereven.service.ProjectInfoService;
import github.com.jokereven.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProjectInfoController {

    //自动装配业务层组件
    @Autowired
    private ProjectInfoService projectInfoService;

    // 请求分页查询页面数据 get all return json data

    @RequestMapping("/projectInfos")
    @ResponseBody
    public Msg GetAllProjectInfoWithJson(@RequestParam(value="pn",defaultValue = "1") Integer pn){
        PageHelper.startPage(pn,5);
        System.out.println(pn);
        List<ProjectInfo> infos = projectInfoService.getAll();
        System.out.println("=====");
        System.out.println(infos);
        System.out.println("=====");
        PageInfo page = new PageInfo(infos,5);
        System.out.println("=====");
        System.out.println(page);
        System.out.println("=====");
        System.out.println("get page list to string"+page.getList().toString());
        return Msg.success().add("pageInfo",page);
    }

    @RequestMapping(value = "/projectInfo",method= RequestMethod.POST)
    @ResponseBody
    public Msg saveProjectInfo(ProjectInfo projectInfo){
        projectInfoService.saveProjectInfo(projectInfo);
        return Msg.success();
    }

    @RequestMapping("/checkprojectname")
    @ResponseBody
    public Msg checkprojectname(@RequestParam("projectName") String projectName){
        // 判断项目名是否合理
        String regProjectName = "^[a-zA-Z][a-zA-Z0-9_]{4,15}$";
        // 判断
        if(!projectName.matches(regProjectName)){
            return Msg.fail().add("validate_msg","字母开头，允许5-16字节，允许字母数字下划线 back");
        }
        // 执行查询
         boolean flag = projectInfoService.checkprojectname(projectName);
        if (flag){
            return Msg.success();
        }else {
            return Msg.fail().add("validate_msg","× 不可以 back");
        }
    }
}
