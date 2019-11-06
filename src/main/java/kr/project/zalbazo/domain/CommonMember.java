package kr.project.zalbazo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
public class CommonMember {
    private String login_id;
    private String phone_number;
    private String username;
    private String password;
    private String email;
    private Date join_date;
    private Date last_login_date;
    private Date updated_date;
    private String role;
    private String address;

    @Builder
    public CommonMember(String login_id, String phone_number, String username, String password, String email, Date join_date, Date last_login_date, Date updated_date, String role, String address) {
        this.login_id = login_id;
        this.phone_number = phone_number;
        this.username = username;
        this.password = password;
        this.email = email;
        this.join_date = join_date;
        this.last_login_date = last_login_date;
        this.updated_date = updated_date;
        this.role = role;
        this.address = address;
    }
}
