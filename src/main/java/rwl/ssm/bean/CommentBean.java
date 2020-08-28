package rwl.ssm.bean;

import lombok.Data;

@Data
public class CommentBean {
    private Integer id;
    private String detail;
    private Integer articleid;
    private Integer userid;
    private String publishtime;
}
