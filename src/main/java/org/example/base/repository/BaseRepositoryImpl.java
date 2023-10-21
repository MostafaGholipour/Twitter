package org.example.base.repository;

import org.example.base.entity.BaseEntity;
import org.example.util.Hibernate;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public abstract class BaseRepositoryImpl<E extends BaseEntity> implements BaseRepository<E>{
    protected abstract Class getClassName();
    @Override
    public void save(E entity) {
        EntityTransaction transaction = null;
        EntityManager entityManager = null;
        try {
            entityManager = Hibernate.getEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(entity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }

    }

    @Override
    public void update(E entity) {
        EntityTransaction transaction = null;
        EntityManager entityManager = null;
        try {
            entityManager = Hibernate.getEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.merge(entity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }
    }

    @Override
    public E loadById(long id) {
        EntityManager entityManager=Hibernate.getEntityManager();
        EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();
        E e=(E)entityManager.find(getClassName(),id);
        transaction.commit();
        return e;
    }

    @Override
    public void delete(E entity) {
            EntityManager entityManager = Hibernate.getEntityManager();
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.remove(entity);
            transaction.commit();
    }

    @Override
    public List<E> LoadAll() {
        return null;
    }
}
