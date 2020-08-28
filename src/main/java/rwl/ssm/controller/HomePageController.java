package rwl.ssm.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rwl.ssm.service.HomePageService;

@RestController
@RequestMapping(value = "home",produces = "application/json; charset=utf-8")
public class HomePageController {
    @Autowired
    private HomePageService homePageService;
    @GetMapping("/get_articles")
    public String homeArticle(){
        return new Gson().toJson(homePageService.getHomeArticle());
    }
}
