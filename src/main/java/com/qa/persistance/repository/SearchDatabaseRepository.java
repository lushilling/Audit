package com.qa.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.persistance.entity.Search;

@Repository
public interface SearchDatabaseRepository extends JpaRepository<Search, Long> {

}
