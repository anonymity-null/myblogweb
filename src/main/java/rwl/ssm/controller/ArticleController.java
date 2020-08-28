package rwl.ssm.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rwl.ssm.service.ArticleService;

@RestController
@RequestMapping(value = "article",produces = "application/json; charset=utf-8")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @PostMapping("get_pages")
    public String getArticleByPage(@RequestParam("page_num")Integer page_num){
        return new Gson().toJson(articleService.getArticleByPage(page_num));
    }

    @GetMapping("get_count")
    public Integer getPageCount(){
        return articleService.getPageCount();
    }

    @GetMapping("get_category_with_count")
    public String getAllCategoryCount(){
        return new Gson().toJson(articleService.getAllCategoryCount());
    }
}
