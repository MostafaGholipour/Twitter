package org.example.base.repository;

import org.example.base.entity.BaseEntity;

import java.util.List;

public interface BaseRepository <E extends BaseEntity> {
    void save(E entity);
    void update(E entity);
    E loadById(long id);
    void delete(E entity);
    List<E> LoadAll();

}
