package rwl.ssm.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rwl.ssm.bean.CommentBean;
import rwl.ssm.service.CommentService;

@RestController
@RequestMapping(value = "comment",produces = "application/json; charset=utf-8")
public class CommentController {
    @Autowired
    CommentService commentService;
    @PostMapping("publish_comment")
    public String publishComment(@ModelAttribute CommentBean commentBean){
        commentService.publishComment(commentBean);
        return "success";
    }
    @GetMapping("get_by_article_id")
    public String getByArticleId(@RequestParam("id")Integer id){
        return new Gson().toJson(commentService.getByArticleId(id));
    }
}
