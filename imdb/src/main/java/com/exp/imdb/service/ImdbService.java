package com.exp.imdb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exp.imdb.converter.FilmDetailConverter;
import com.exp.imdb.entity.NameBasics;
import com.exp.imdb.entity.TitleBasics;
import com.exp.imdb.enumeration.ExceptionEnum;
import com.exp.imdb.repository.NameBasicsRepository;
import com.exp.imdb.repository.TitleBasicsRepository;
import com.exp.imdb.repository.TitlePrincipalRepository;
import com.exp.imdb.request.TogetherPlayedRequest;
import com.exp.imdb.response.FilmDetailResponse;
import com.exp.imdb.response.TogetherPlayedResponse;

@Service
public class ImdbService implements IImdbService {

    
	private final static Logger LOGGER = LoggerFactory.getLogger(ImdbService.class);
	
	@Autowired
	NameBasicsRepository  nameBasicsRepository;
	
	@Autowired
	TitleBasicsRepository titleBasicsRepository;
	
	@Autowired
	TitlePrincipalRepository titlePrincpalRepository;
	
	@Autowired
    private FilmDetailConverter filmDetailConverter;
	
	public FilmDetailResponse getActorActressFilmDetail(String actorActress) {
		FilmDetailResponse response = new FilmDetailResponse();
		
		try {
			NameBasics nameBasics = nameBasicsRepository.findByPrimaryName(actorActress);
			List<TitleBasics> titleBasicsList = titleBasicsRepository.findByNconst(nameBasics.getNconst());
			response.setFilmDetailList(titleBasicsList.stream().map(filmDetailConverter::toEntity).collect(Collectors.toList()));		
		} catch (Exception e) {
			response.setStatus(ExceptionEnum.INTERNAL_ERROR.getCode());
			response.setErrorMessage(ExceptionEnum.INTERNAL_ERROR.getMessage());
			LOGGER.error(ExceptionEnum.INTERNAL_ERROR.getMessage());
		}
		return response;
	}
	
	public TogetherPlayedResponse getActorActressTogetherPlayed(TogetherPlayedRequest actorActressList) {
		TogetherPlayedResponse response = new TogetherPlayedResponse();
		try {
			List<String> nConstList = new ArrayList<String>();
			for(String actor:actorActressList.getActorActressList()) {
				nConstList.add(nameBasicsRepository.findByPrimaryName(actor).getNconst());
			}
			List<Object[]> temp = titlePrincpalRepository.findByNconstForList(nConstList);
			if(!temp.isEmpty() && temp.size()>0) {
				response.setPlayed(Boolean.TRUE);
			}
		}catch (Exception e) {
			response.setStatus(ExceptionEnum.INTERNAL_ERROR.getCode());
			response.setErrorMessage(ExceptionEnum.INTERNAL_ERROR.getMessage());
			LOGGER.error(ExceptionEnum.INTERNAL_ERROR.getMessage());
		}
		
		return response;
	}	
}
