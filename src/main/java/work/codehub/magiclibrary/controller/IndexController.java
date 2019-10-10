package work.codehub.magiclibrary.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping({"/", "/index"})
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");

        JSONObject article;

        JSONArray array = new JSONArray();

        for (int i = 1; i <= 10; i++) {
            article = new JSONObject();
            article.put("id", i);
            article.put("title", "文章标题" + i);
            article.put("content", "文章内容文章内容文章内容文章内容文章内容文章内容文章内容文章内容文章内容");
            array.add(article);
        }

        modelAndView.addObject("articles", array);

        return modelAndView;
    }

}
