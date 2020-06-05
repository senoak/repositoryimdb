package com.exp.imdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exp.imdb.entity.NameBasics;

@Repository
public interface NameBasicsRepository extends JpaRepository<NameBasics, Integer> {

	NameBasics findByPrimaryName(String actorActress);

}
