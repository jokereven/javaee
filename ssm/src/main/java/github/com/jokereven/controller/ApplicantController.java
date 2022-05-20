package github.com.jokereven.controller;

// CLD controller service dao

import github.com.jokereven.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jokereven
 */

@Controller
@RequestMapping("/api")
public class ApplicantController {
    /**
     * 自动装置
     * */
   private ApplicantService applicantService;
    /**
     * 查询所有申报人
     */
    @RequestMapping("/all")
    public String all(){
        return "all";
    }
}
