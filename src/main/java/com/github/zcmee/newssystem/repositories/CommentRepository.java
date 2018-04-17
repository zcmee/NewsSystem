package com.github.zcmee.newssystem.repositories;

import com.github.zcmee.newssystem.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByNewsId(Long id);
}
