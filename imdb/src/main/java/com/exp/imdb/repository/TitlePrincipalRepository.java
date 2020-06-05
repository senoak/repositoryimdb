package com.exp.imdb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.exp.imdb.entity.TitlePrincipal;

@Repository
public interface TitlePrincipalRepository extends JpaRepository<TitlePrincipal, Long> {

	List<TitlePrincipal> findAllByNconst(String nconst);
	
//	@Query(value = "select t.tcount,count(*) tpcount from TITLE_PRINCIPAL t where t.tconst IN =?1 GROUP BY t.tcount HAVING COUNT(tpcount) > =?2 ",nativeQuery=true)
//	List<Object[]> findByNconstForList(List<String> nconstList, int size);

	@Query(value = "select t.tconst,count(*) tpcount from TITLE_PRINCIPAL t where t.tconst IN :nconstList GROUP BY t.tconst HAVING COUNT(tpcount) > 1 ",nativeQuery=true)
	List<Object[]> findByNconstForList(@Param("nconstList") List<String> nconstList);

}
