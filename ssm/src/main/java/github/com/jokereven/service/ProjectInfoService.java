package github.com.jokereven.service;

import github.com.jokereven.dao.ProjectInfoMapper;
import github.com.jokereven.entity.ProjectInfo;
import github.com.jokereven.entity.ProjectInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectInfoService {

    @Autowired
    private  ProjectInfoMapper projectInfoMapper;

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
    public boolean checkprojectname(String projectName){
        // create select
        ProjectInfoExample example = new ProjectInfoExample();
        // get 条件
        ProjectInfoExample.Criteria criteria = example.createCriteria();
        criteria.andPiProjectnameEqualTo(projectName);
        long count = projectInfoMapper.countByExample(example);
        return count == 0; // no user
    }

    //查询单个项目(两表联查)

    //修改项目

    //删除单个项目
    public void DeleteProjectInfo(Integer id){
        projectInfoMapper.deleteByPrimaryKey(id);
    }

    //批量删除项目
    public void DeleteProjectInfos(List<Integer> ids){
        // create delete obj
        ProjectInfoExample example = new ProjectInfoExample();
        // 得到删除对象的条件
        ProjectInfoExample.Criteria criteria = example.createCriteria();
        // 将参数放到条件中
        criteria.andPiIdIn(ids);
        // 根据条件删除
        projectInfoMapper.deleteByExample(example);
    }

    public Object metadataProjectInfos(Integer id){
        return projectInfoMapper.selectByPrimaryKeyWithApplicant(id);
    }
}
