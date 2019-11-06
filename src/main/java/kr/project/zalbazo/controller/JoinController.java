package kr.project.zalbazo.controller;

import kr.project.zalbazo.domain.CommonMember;
import kr.project.zalbazo.service.JoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.awt.*;

@Controller
public class JoinController {
    @Autowired
    private JoinService joinService;

    @PostMapping(value = "/joinProcess")
    public String join(CommonMember member) {
        joinService.insertMember(member);
        return "redirect:/index";
    }
}
