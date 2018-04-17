package com.github.zcmee.newssystem.services;

import com.github.zcmee.newssystem.entities.Comment;
import com.github.zcmee.newssystem.repositories.CommentRepository;
import com.github.zcmee.newssystem.repositories.CustomInterfaceComment;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CommentService implements ServiceInterface<Comment>, CustomInterfaceComment {
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public List<Comment> getObj() {
        return commentRepository.findAll();
    }


    @Override
    public Comment create(Comment obj) {
        return commentRepository.save(obj);
    }
    @Override
    public Comment findById(Long id) {
        return null;
    }

    @Override
    public Comment update(Comment obj) {
        return null;
    }

    @Override
    public List<Comment> findByNewsId(Long id) {
        return commentRepository.findByNewsId(id);
    }
}
