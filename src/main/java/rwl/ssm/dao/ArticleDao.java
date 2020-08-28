package rwl.ssm.dao;

import org.springframework.stereotype.Repository;
import rwl.ssm.bean.ArticleBean;

import java.util.List;

@Repository
public interface ArticleDao {
    //获取推荐文章
    List<ArticleBean> getThreeArticle();
    //获取指定页的文章
    List<ArticleBean> getArticleByPage(Integer page_num);
    //获取总文章数
    int getCount();
    //通过分类的id获取该分类总数
    int getCategoryCount(Integer categoryid);
}
