package kr.project.zalbazo.controller;

import kr.project.zalbazo.domain.TestMember;
import kr.project.zalbazo.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @GetMapping({"","/index"})
    public String home() {
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

    @GetMapping("/loginForm")
    public String loginForm(Model model) {
        model.addAttribute("member", new TestMember());
        return "loginForm";
    }

    @PostMapping("/loginProcess")
    public ResponseEntity<TestMember> loginProcess(@ModelAttribute TestMember member) {
        TestMember saved = sampleService.getMember(member);
        return saved == null ? new ResponseEntity<>(HttpStatus.BAD_REQUEST) : new ResponseEntity<>(saved, HttpStatus.OK);
    }
}
