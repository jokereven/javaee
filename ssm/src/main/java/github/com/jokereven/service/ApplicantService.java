package github.com.jokereven.service;


import github.com.jokereven.dao.ApplicantMapper;
import github.com.jokereven.entity.Applicant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //业务类注解
public class ApplicantService {
    //自动注入spring容器中
    @Autowired
    private ApplicantMapper applicantMapper;

    // 业务操作待添加

    // get all

    public List<Applicant> getApplicants(){
        return applicantMapper.selectByExample(null);
    }

}
