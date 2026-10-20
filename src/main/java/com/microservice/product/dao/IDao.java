package com.microservice.product.dao;

import java.util.List;

/**
 * Interface générique définissant le contrat CRUD (Create, Read, Update, Delete)
 * pour toutes les entités du microservice.
 *
 * @param <T> Le type de l'entité manipulée
 */
public interface IDao<T> {
    void save(T entity);
    void update(T entity);
    void delete(T entity);
    T findById(Long id);
    List<T> findAll();
}
