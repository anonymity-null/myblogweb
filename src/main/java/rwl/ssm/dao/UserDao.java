package rwl.ssm.dao;

import org.springframework.stereotype.Repository;
import rwl.ssm.bean.UserBean;

import java.util.List;

@Repository
public interface UserDao {
    UserBean getUserByName(String username);
    List<UserBean> getAllUser();
}
