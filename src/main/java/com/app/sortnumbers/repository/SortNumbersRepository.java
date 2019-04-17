package com.app.sortnumbers.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.sortnumbers.entity.SortEntity;

public interface SortNumbersRepository extends CrudRepository<SortEntity, Double> {
}
