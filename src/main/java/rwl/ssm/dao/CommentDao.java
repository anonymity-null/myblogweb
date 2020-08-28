package rwl.ssm.dao;

import org.springframework.stereotype.Repository;
import rwl.ssm.bean.CommentBean;

import java.util.List;

@Repository
public interface CommentDao {
    List<CommentBean> getByArticleId(Integer id);
    void insertComment(CommentBean commentBean);
}
