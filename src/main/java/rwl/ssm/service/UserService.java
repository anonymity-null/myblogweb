package rwl.ssm.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import rwl.ssm.bean.UserBean;

public interface UserService extends UserDetailsService {
    UserBean getByName(String username);
}
