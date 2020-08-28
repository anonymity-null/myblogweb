package rwl.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import rwl.ssm.bean.UserBean;
import rwl.ssm.dao.UserDao;
import rwl.ssm.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    public UserBean getByName(String username) {
        return userDao.getUserByName(username);
    }

    /**
     *
     * @param username 浏览器输入的用户名
     * @return UserDetails
     * @throws UsernameNotFoundException
     */
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserBean userByName = userDao.getUserByName(username);
        if (userByName==null){
            return null;
        }
        List<SimpleGrantedAuthority> authorities=new ArrayList<SimpleGrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        return new User(userByName.getUsername(),"{noop}"+userByName.getPassword(),authorities);
    }
}
