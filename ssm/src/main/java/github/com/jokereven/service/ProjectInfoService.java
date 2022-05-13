package github.com.jokereven.service;

import github.com.jokereven.dao.ProjectInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jokereven
 */

@Service
public class ProjectInfoService {
    @Autowired
    private ProjectInfoMapper projectInfoMapper;

    // 业务操作
}
