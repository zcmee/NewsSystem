package com.github.zcmee.newssystem.repositories;

import com.github.zcmee.newssystem.entities.Comment;

import java.util.List;

public interface CustomInterfaceComment {
    List<Comment> findByNewsId(Long id);
}
