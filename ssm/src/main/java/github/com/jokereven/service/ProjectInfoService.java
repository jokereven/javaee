package github.com.jokereven.service;

import github.com.jokereven.dao.ProjectInfoMapper;
import github.com.jokereven.entity.ProjectInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jokereven
 */

@Service
public class ProjectInfoService {
    @Autowired
    private ProjectInfoMapper projectInfoMapper;

    // 业务操作

    // 查询所有项目
    public List<ProjectInfo> getAll(){
        return projectInfoMapper.selectByExample(null);
    }
}
