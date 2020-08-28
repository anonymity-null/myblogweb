package rwl.ssm.service;

import rwl.ssm.bean.ArticleBean;

import java.util.List;

public interface HomePageService {
    List<ArticleBean> getHomeArticle();
}
