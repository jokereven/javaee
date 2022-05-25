package github.com.jokereven.service;

import github.com.jokereven.dao.ApplicantMapper;
import github.com.jokereven.entity.Applicant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jokereven
 */

@Service
public class ApplicantService {

    @Autowired
    private ApplicantMapper applicantMapper;

    // 业务操作待添加

    // get all

    public List<Applicant> getAllApplicant(){
        return applicantMapper.selectByExample(null);
    }
}