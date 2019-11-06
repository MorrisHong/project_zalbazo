package kr.project.zalbazo.mapper;

import kr.project.zalbazo.domain.TestMember;

import java.util.List;

public interface MemberMapper {
    int insert(TestMember member);
    TestMember getMember(TestMember member);
    List<TestMember> getAllMember();
}
