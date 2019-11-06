package kr.project.zalbazo.controller;

import kr.project.zalbazo.domain.CommonMember;
import kr.project.zalbazo.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @GetMapping({"","/index"})
    public String home(CommonMember member) {
        return "index";
    }


    @GetMapping("/hi")
    @ResponseBody
    public String hi() {
        return "hi " +sampleService.getName() + " : " + sampleService.now();
    }


    @GetMapping("/sampleview")
    public String sampleView() {
        return "sampleView";
    }
}
