package kr.project.zalbazo.service;

import kr.project.zalbazo.domain.CommonMember;
import kr.project.zalbazo.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinService {

    @Autowired
    private MemberMapper memberMapper;

    public int insertMember(CommonMember member) {
        return memberMapper.insert(member);
    }
}
