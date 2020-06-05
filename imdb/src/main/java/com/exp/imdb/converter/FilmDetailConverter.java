package com.exp.imdb.converter;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.exp.imdb.entity.TitleBasics;
import com.exp.imdb.response.FilmDetail;

@Component
public class FilmDetailConverter implements ModelConverter<FilmDetail,TitleBasics> {

	    @Autowired
	    private EntityManager entityManager;

	    @Override
	    public FilmDetail toEntity(TitleBasics model) {
	        if (model == null) {
	            return null;
	        }

	        FilmDetail content = new FilmDetail();
	        content.setTconst(model.getTconst());
	        boolean isAdult = (model.getIsAdult() != null) ? model.getIsAdult().booleanValue() : false;

	        content.setAdult(isAdult);
	        if(model.getEndYear()!=null) {
	        	content.setEndYear(model.getEndYear());
	        }
	        if(model.getGenres()!=null) {
	        	content.setGenres(model.getGenres());
	        }
	        content.setOriginalTitle(model.getOriginalTitle());
	        content.setPrimaryTitle(model.getPrimaryTitle());
	        content.setRuntimeMinutes(model.getRuntimeMinutes());
	        content.setStartYear(model.getStartYear());
	        if(model.getTitleType()!=null) {
	        	content.setTitleType(model.getTitleType().toString());
	        }

	        return content;
	    }

		@Override
		public TitleBasics toModel(FilmDetail entity) {
			// TODO Auto-generated method stub
			return null;
		}

}
