package rwl.ssm.service;

import rwl.ssm.bean.CommentBean;

import java.util.List;

public interface CommentService {
    void publishComment(CommentBean commentBean);
    List<CommentBean> getByArticleId(Integer id);
}
