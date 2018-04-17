package com.github.zcmee.newssystem.services;

import com.github.zcmee.newssystem.entities.News;
import com.github.zcmee.newssystem.repositories.NewsRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class NewsService implements ServiceInterface<News> {
    private final NewsRepository newsRepository;

    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @Override
    public List<News> getObj() {
        return newsRepository.findAll();
    }

    @Override
    public News create(News obj) {
        return newsRepository.save(obj);
    }

    @Override
    public News findById(Long id) {
        return null;
    }

    @Override
    public News update(News obj) {
        return null;
    }

}
