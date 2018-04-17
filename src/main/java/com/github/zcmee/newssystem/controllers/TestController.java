package com.github.zcmee.newssystem.controllers;

import com.github.zcmee.newssystem.classes.Skalka;
import com.github.zcmee.newssystem.entities.News;
import com.github.zcmee.newssystem.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {
    private final NewsRepository newsRepository;
    private final Skalka ska;

    @Autowired
    public TestController(NewsRepository newsRepository, Skalka skaleczka) {
        this.newsRepository = newsRepository;
        this.ska = skaleczka;
    }

    @GetMapping("skalka")
    public String getSkalka() {
        return ska.getLogin();
    }

    @GetMapping("allnews")
    public List<News> getAllNews() {
        return newsRepository.findAll();
    }

    @GetMapping("thread")
    public String threadTest() {

        new Thread(() -> {
            System.out.println("So close");
            if(true) throw new IllegalArgumentException("Lubie placki");
        }).start();

       for(Long i = 0L; i < 99999999; ++i);
        System.out.println("Wychodze");
       return "jebac ~Popek";
    }

}

//    So close
//[WARNING]
//        java.lang.IllegalArgumentException: Lubie placki
//        at com.github.zcmee.newssystem.controllers.TestController.lambda$threadTest$0(TestController.java:31)
//        at java.lang.Thread.run(Thread.java:748)
//        Wychodze
