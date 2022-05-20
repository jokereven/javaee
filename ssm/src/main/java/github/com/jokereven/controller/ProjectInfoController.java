package github.com.jokereven.controller;

import github.com.jokereven.service.ProjectInfoService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jokereven
 */

public class ProjectInfoController {

    /**
     * 自动装置
     * */

    @Autowired
    private ProjectInfoService projectInfoService;

    // 请求分页查询页面数据 get all return json data
}
