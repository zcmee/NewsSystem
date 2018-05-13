package com.github.zcmee.newssystem.services;

import com.github.zcmee.newssystem.entities.News;
import com.github.zcmee.newssystem.repositories.NewsRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

@Service
@Transactional
public class DataLoaderService {
    private final NewsRepository newsRepository;

    public DataLoaderService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @PostConstruct
    private void loadData() {
        News news = new News();
        news.setId(666L); // Wartość nie jest w ogóle brana pod uwagę???
        news.setData("30-12-1988");
        news.setTitle("Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...");
        news.setText("Lorem Ipsum jest tekstem stosowanym jako przykładowy wypełniacz w przemyśle poligraficznym. Został po raz pierwszy użyty w XV w.");
        newsRepository.save(news);

    }

}
