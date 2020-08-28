package rwl.ssm.service;


import rwl.ssm.bean.ArticleBean;
import rwl.ssm.bean.CategoryBean;

import java.util.List;

public interface ArticleService {
    //得到指定页的文章
    List<ArticleBean> getArticleByPage(Integer page_num);
    //获取总页数
    Integer getPageCount();
    //获取所有分类带有总数
    List<CategoryBean> getAllCategoryCount();
}
