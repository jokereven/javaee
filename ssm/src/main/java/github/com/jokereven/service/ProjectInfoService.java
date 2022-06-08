package github.com.jokereven.service;

import github.com.jokereven.dao.ProjectInfoMapper;
import github.com.jokereven.entity.ProjectInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectInfoService {

    @Autowired
    private ProjectInfoMapper projectInfoMapper;

    // 业务操作

    // 查询所有项目
    public List<ProjectInfo> getAll(){
        return projectInfoMapper.selectByExampleWithApplicant(null);
    }

    //查询所有项目(两表联查)

    //添加项目
    public void saveProjectInfo(ProjectInfo projectInfo){
        projectInfoMapper.insertSelective(projectInfo);
    }

    //验证申报的项目是否存在

    //查询单个项目(两表联查)

    //修改项目

    //删除单个项目

    //批量删除项目

}
