package com.exp.imdb;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.exp.imdb.entity.NameBasics;
import com.exp.imdb.entity.TitleBasics;
import com.exp.imdb.entity.TitlePrincipal;
import com.exp.imdb.enumeration.TitleTypeEnum;
import com.exp.imdb.repository.NameBasicsRepository;
import com.exp.imdb.repository.TitleBasicsRepository;
import com.exp.imdb.repository.TitlePrincipalRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Tester {

	@Autowired
	TitleBasicsRepository titleBasicsRepository;

	 @Test
	 public void test() {
	    	TitleBasics titleBasics1 = new TitleBasics();
	    	titleBasics1.setEndYear(null);
	    	titleBasics1.setGenres(Arrays.asList("Drama"));
	    	titleBasics1.setIsAdult(Boolean.FALSE);
	    	titleBasics1.setOriginalTitle("The Shawshank Redemption");
	    	titleBasics1.setPrimaryTitle("Esaretin Bedeli");
	    	titleBasics1.setRuntimeMinutes(Short.valueOf("144"));
	    	titleBasics1.setStartYear(Short.valueOf("1994"));
	    	titleBasics1.setTconst("THESHAWSHANKREDEMPTION");
	    	titleBasics1.setTitleType(TitleTypeEnum.MOVIE);

	    	TitleBasics titleBasics2 = new TitleBasics();
	    	titleBasics1.setEndYear(null);
	    	titleBasics1.setGenres(Arrays.asList("Crime","Drama"));
	    	titleBasics1.setIsAdult(Boolean.FALSE);
	    	titleBasics1.setOriginalTitle("Pulp Fiction");
	    	titleBasics1.setPrimaryTitle("Ucuz Roman");
	    	titleBasics1.setRuntimeMinutes(Short.valueOf("144"));
	    	titleBasics1.setStartYear(Short.valueOf("1994"));
	    	titleBasics1.setTconst("PULPFICTION");
	    	titleBasics1.setTitleType(TitleTypeEnum.MOVIE);

	    	TitleBasics titleBasics3 = new TitleBasics();
	    	titleBasics1.setEndYear(null);
	    	titleBasics1.setGenres(Arrays.asList("Drama"));
	    	titleBasics1.setIsAdult(Boolean.FALSE);
	    	titleBasics1.setOriginalTitle("Fight Club");
	    	titleBasics1.setPrimaryTitle("Dövüş Kulübü");
	    	titleBasics1.setRuntimeMinutes(Short.valueOf("144"));
	    	titleBasics1.setStartYear(Short.valueOf("1999"));
	    	titleBasics1.setTconst("FIGHTCLUB");
	    	titleBasics1.setTitleType(TitleTypeEnum.MOVIE);

	    	TitleBasics titleBasics4 = new TitleBasics();
	    	titleBasics1.setEndYear(null);
	    	titleBasics1.setGenres(Arrays.asList("Biography", "Drama", "History"));
	    	titleBasics1.setIsAdult(Boolean.FALSE);
	    	titleBasics1.setOriginalTitle("Schindler's List");
	    	titleBasics1.setPrimaryTitle("Schindler'in Listesi");
	    	titleBasics1.setRuntimeMinutes(Short.valueOf("195"));
	    	titleBasics1.setStartYear(Short.valueOf("1994"));
	    	titleBasics1.setTconst("SCHINDLERINLIST");
	    	titleBasics1.setTitleType(TitleTypeEnum.MOVIE);
	    	
	    	
	    	NameBasicsRepository  nameBasicsRepository;
	    	//nameBasicsRepository.save(entity)
	    	titleBasicsRepository.save(titleBasics1);
	    	titleBasicsRepository.save(titleBasics2);
	    	titleBasicsRepository.save(titleBasics3);
	    	titleBasicsRepository.save(titleBasics4);
	    	
	    	TitlePrincipalRepository titlePrincpalRepository;
	    	
	    	NameBasics nameBasics = new NameBasics();
	    	nameBasics.setBirthYear(Short.valueOf("1983"));
	    	nameBasics.setDeathYear(null);
//	    	nameBasics.setKnownForTitles(Arrays.asList("Actor","Writer"));
	    	nameBasics.setNconst("AHMETXYZ");
	    	nameBasics.setPrimaryName("AHMET");
	    	nameBasics.setPrimaryProfession(Arrays.asList("PULPFICTION"));

	    	NameBasics nameBasics1 = new NameBasics();
	    	nameBasics.setBirthYear(Short.valueOf("1983"));
	    	nameBasics.setDeathYear(null);
//	    	nameBasics.setKnownForTitles(Arrays.asList("Actor","Writer"));
	    	nameBasics.setNconst("MEHMETTGB");
	    	nameBasics.setPrimaryName("MEHMET");
	    	nameBasics.setPrimaryProfession(Arrays.asList("THESHAWSHANKREDEMPTION","PULPFICTION"));

	    	NameBasics nameBasics2 = new NameBasics();
	    	nameBasics.setBirthYear(Short.valueOf("1983"));
	    	nameBasics.setDeathYear(null);
//	    	nameBasics.setKnownForTitles(Arrays.asList("Actor","Writer"));
	    	nameBasics.setNconst("MAHMUTTTT");
	    	nameBasics.setPrimaryName("MAHMUT");
	    	nameBasics.setPrimaryProfession(Arrays.asList("FIGHTCLUB"));

	    	NameBasics nameBasics3 = new NameBasics();
	    	nameBasics.setBirthYear(Short.valueOf("1983"));
	    	nameBasics.setDeathYear(null);
//	    	nameBasics.setKnownForTitles(Arrays.asList("Actor","Writer"));
	    	nameBasics.setNconst("OSMANHHG");
	    	nameBasics.setPrimaryName("OSMAN");
	    	nameBasics.setPrimaryProfession(Arrays.asList("SCHINDLERINLIST","FIGHTCLUB","PULPFICTION"));
	    	
	    	TitlePrincipal titlePrincipal = new TitlePrincipal();
	    	titlePrincipal.setCategory("Main Character");
	    	titlePrincipal.setCharacters("Oskar Schindler");
	    	titlePrincipal.setJob("Actor");
	    	titlePrincipal.setNconst("AHMETXYZ");
	    	titlePrincipal.setOrdering(Integer.valueOf(0));
	    	titlePrincipal.setTconst("PULPFICTION");

	    	TitlePrincipal titlePrincipal1 = new TitlePrincipal();
	    	titlePrincipal.setCategory("Main Character");
	    	titlePrincipal.setCharacters("Andy Dufresne");
	    	titlePrincipal.setJob("Actor");
	    	titlePrincipal.setNconst("MEHMETTGB");
	    	titlePrincipal.setOrdering(Integer.valueOf(0));
	    	titlePrincipal.setTconst("THESHAWSHANKREDEMPTION");

	    	TitlePrincipal titlePrincipal2 = new TitlePrincipal();
	    	titlePrincipal.setCategory("Character");
	    	titlePrincipal.setCharacters("Waitress");
	    	titlePrincipal.setJob("Actor");
	    	titlePrincipal.setNconst("MEHMETTGB");
	    	titlePrincipal.setOrdering(Integer.valueOf(0));
	    	titlePrincipal.setTconst("PULPFICTION");

	    	TitlePrincipal titlePrincipal3 = new TitlePrincipal();
	    	titlePrincipal.setCategory("Main Character");
	    	titlePrincipal.setCharacters("Tyler Durden");
	    	titlePrincipal.setJob("Actor");
	    	titlePrincipal.setNconst("MAHMUTTTT");
	    	titlePrincipal.setOrdering(Integer.valueOf(0));
	    	titlePrincipal.setTconst("FIGHTCLUB");
	    	
	    	TitlePrincipal titlePrincipa4 = new TitlePrincipal();
	    	titlePrincipal.setCategory("Main Character");
	    	titlePrincipal.setCharacters("Oskar Schindler");
	    	titlePrincipal.setJob("Actor");
	    	titlePrincipal.setNconst("OSMANHHG");
	    	titlePrincipal.setOrdering(Integer.valueOf(0));
	    	titlePrincipal.setTconst("SCHINDLERINLIST");

	    	TitlePrincipal titlePrincipa5 = new TitlePrincipal();
	    	titlePrincipal.setCategory("Character");
	    	titlePrincipal.setCharacters("Marla Singer");
	    	titlePrincipal.setJob("Actor");
	    	titlePrincipal.setNconst("OSMANHHG");
	    	titlePrincipal.setOrdering(Integer.valueOf(0));
	    	titlePrincipal.setTconst("FIGHTCLUB");

	    	TitlePrincipal titlePrincipa6 = new TitlePrincipal();
	    	titlePrincipal.setCategory("Character");
	    	titlePrincipal.setCharacters("Trudi");
	    	titlePrincipal.setJob("Actor");
	    	titlePrincipal.setNconst("OSMANHHG");
	    	titlePrincipal.setOrdering(Integer.valueOf(0));
	    	titlePrincipal.setTconst("PULPFICTION");
	 }

}

