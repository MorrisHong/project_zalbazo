package kr.project.zalbazo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
public class TestMember {
    private Long uid;
    private String username;
    private String password;
}
