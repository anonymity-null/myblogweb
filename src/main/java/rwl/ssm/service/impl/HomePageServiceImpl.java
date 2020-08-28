package rwl.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rwl.ssm.bean.ArticleBean;
import rwl.ssm.dao.ArticleDao;
import rwl.ssm.service.HomePageService;

import java.util.List;

@Service
public class HomePageServiceImpl implements HomePageService {
    @Autowired
    ArticleDao articleDao;

    public List<ArticleBean> getHomeArticle() {
        return articleDao.getThreeArticle();
    }
}
