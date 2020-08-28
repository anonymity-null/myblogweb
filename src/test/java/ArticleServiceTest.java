import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import rwl.ssm.bean.ArticleBean;
import rwl.ssm.dao.ArticleDao;
import rwl.ssm.service.ArticleService;

import java.util.List;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ArticleServiceTest {

    @Autowired
    ArticleService articleService;
    @Autowired
    ArticleDao articleDao;

    @Test
    public void testGetArticleByPage() {
        List<ArticleBean> articleByPage = articleService.getArticleByPage(4);
        for (ArticleBean articleBean : articleByPage) {

            System.out.println(articleBean);
        }
    }

    @Test
    public void testGetCount(){
        System.out.println(articleDao.getCount());
    }
}
