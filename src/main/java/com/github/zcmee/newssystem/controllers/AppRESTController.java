package com.github.zcmee.newssystem.controllers;

import com.github.zcmee.newssystem.entities.Comment;
import com.github.zcmee.newssystem.entities.News;
import com.github.zcmee.newssystem.services.CommentService;
import com.github.zcmee.newssystem.services.NewsService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/news")
public class AppRESTController {
    private final CommentService commentService;
    private final NewsService newsService;

    public AppRESTController(CommentService commentService, NewsService newsService) {
        this.commentService = commentService;
        this.newsService = newsService;
    }

    @GetMapping("/getNews")
    public List<News> findAll() {
        return newsService.getObj();
    }

    @PostMapping("saveNews")
    @ResponseStatus(value = HttpStatus.CREATED)
    public News createNews(@RequestBody News news) {
        return newsService.create(news);
    }

    @PostMapping("saveComment")
    public Comment createNews(@RequestBody Comment comment) {
        return commentService.create(comment);
    }
}
