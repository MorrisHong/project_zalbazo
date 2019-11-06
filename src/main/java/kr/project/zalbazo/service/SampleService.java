package kr.project.zalbazo.service;

import kr.project.zalbazo.domain.TestMember;
import kr.project.zalbazo.mapper.MemberMapper;
import kr.project.zalbazo.mapper.TimeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {


    @Autowired
    private TimeMapper timeMapper;

    @Autowired
    private MemberMapper memberMapper;

    public String getName() {
        return "grace";
    }

    public String now() {
        return timeMapper.getTime();
    }

    public TestMember getMember(TestMember member) {
        return memberMapper.getMember(member);
    }
}
