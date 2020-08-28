package rwl.ssm.bean;

import lombok.Data;

@Data
public class UserBean {
    private Integer id;
    private String username;
    private String password;
    private String registertime;
}
