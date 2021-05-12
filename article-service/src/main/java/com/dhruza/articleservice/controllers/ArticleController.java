package com.dhruza.articleservice.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @GetMapping("/get")
    public String getArticle(){
        return "get article";
    }

    @PostMapping("/add")
    public String addArticle(){
        return "add article";
    }

    @DeleteMapping("/delete")
    public String deleteArticle(){
        return "delete article";
    }

    @PutMapping("/update")
    public String updateArticle(){
        return "update article";
    }
}
