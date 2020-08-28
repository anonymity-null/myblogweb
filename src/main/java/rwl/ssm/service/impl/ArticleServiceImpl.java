package rwl.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rwl.ssm.bean.ArticleBean;
import rwl.ssm.bean.CategoryBean;
import rwl.ssm.dao.ArticleDao;
import rwl.ssm.dao.CategoryDao;
import rwl.ssm.service.ArticleService;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleDao articleDao;
    @Autowired
    CategoryDao categoryDao;

    public List<ArticleBean> getArticleByPage(Integer page_num) {
        List<ArticleBean> articlesByPage = articleDao.getArticleByPage(page_num);

        for (ArticleBean a : articlesByPage) {
            String name = categoryDao.getNameById(a.getCategoryid());
            a.setCategoryname(name);
        }
        return articlesByPage;
    }

    public Integer getPageCount() {
        int count = articleDao.getCount();
        if (count % 4 > 0) {
            return (count / 4) + 1;
        }
        return count / 4;

    }

    public List<CategoryBean> getAllCategoryCount() {
        List<CategoryBean> allCategorys = categoryDao.getAllCategorys();
        for (int i = 0; i < allCategorys.size(); i++) {
            int categoryCount = articleDao.getCategoryCount(allCategorys.get(i).getId());
            allCategorys.get(i).setCategorycount(categoryCount);
        }
        return allCategorys;
    }

}
