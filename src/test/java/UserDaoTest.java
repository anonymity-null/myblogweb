import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import rwl.ssm.bean.UserBean;
import rwl.ssm.dao.UserDao;

import java.util.List;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDaoTest {

    @Autowired
    UserDao userDao;
    @Test
    public void testGetUserByName(){
        UserBean admin = userDao.getUserByName("admin");
        System.out.println(admin.toString());
    }
    @Test
    public void testGetAllUser(){
        List<UserBean> allUser = userDao.getAllUser();
        for (UserBean u : allUser) {
            System.out.println(u);
        }

    }
}
