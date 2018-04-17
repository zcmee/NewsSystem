package com.github.zcmee.newssystem.services;

import java.util.List;

public interface ServiceInterface<T> {
    List<T> getObj();
    T create(T obj);
    T findById(Long id);
    T update(T obj);
}
