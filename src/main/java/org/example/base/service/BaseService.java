package org.example.base.service;

import org.example.base.entity.BaseEntity;
import org.example.base.repository.BaseRepository;

import java.util.List;

public interface BaseService<E extends BaseEntity> {
    void save(E entity);
    void update(E entity);
    E loadById(long id);
    void delete(E entity);
    List<E> LoadAll();
}
