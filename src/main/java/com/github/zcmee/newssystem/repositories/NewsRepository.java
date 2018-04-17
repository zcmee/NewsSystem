package com.github.zcmee.newssystem.repositories;

import com.github.zcmee.newssystem.entities.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface NewsRepository extends JpaRepository<News, Long> {
}
