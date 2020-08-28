package rwl.ssm.bean;

import lombok.Data;

@Data
public class ArticleBean {
    private Integer id;
    private String title;
    private String content;
    private Integer categoryid;
    private String categoryname;
    private String views;
    private String createtime;
    private String updatetime;
    private Integer userid;
    private String comments;
    private String img;
}
