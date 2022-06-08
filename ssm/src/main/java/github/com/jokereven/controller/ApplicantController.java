package github.com.jokereven.controller;

// CLD controller service dao

import github.com.jokereven.entity.Applicant;
import github.com.jokereven.service.ApplicantService;
import github.com.jokereven.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ApplicantController {
    // 自动装置
    @Autowired
    private ApplicantService applicantService;

    @RequestMapping("/applicants")
    @ResponseBody
    public Msg getApplicants(){
        List<Applicant> list =  applicantService.getApplicants();
        return Msg.success().add("applicants",list);
     }
}
