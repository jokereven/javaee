package github.com.jokereven.controller;

// CLD controller service dao

import github.com.jokereven.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicantController {
    // 自动装置
    @Autowired
    private ApplicantService applicantService;
}
