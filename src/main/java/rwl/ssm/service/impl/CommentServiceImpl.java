package rwl.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rwl.ssm.bean.CommentBean;
import rwl.ssm.dao.CommentDao;
import rwl.ssm.service.CommentService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentDao commentDao;
    public void publishComment(CommentBean commentBean) {
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String publishtime = format.format(new Date());
        commentBean.setUserid(1);
        commentBean.setPublishtime(publishtime);
        System.out.println(commentBean);
        commentDao.insertComment(commentBean);
    }

    public List<CommentBean> getByArticleId(Integer id) {
        return commentDao.getByArticleId(id);
    }
}
