package com.exp.imdb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.exp.imdb.entity.TitleBasics;

@Repository
public interface TitleBasicsRepository extends JpaRepository<TitleBasics, Integer> {

	List<TitleBasics> findByTconst(String string);
	
	@Query(value = "select t from TitleBasics t where t.tconst IN (select a.tconst from TitlePrincipal a where a.nconst = :pnconst) ")
	List<TitleBasics> findByNconst(@Param("pnconst") String nconst);

}
