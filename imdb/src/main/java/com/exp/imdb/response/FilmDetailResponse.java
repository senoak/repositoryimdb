package com.exp.imdb.response;

import java.util.List;

public class FilmDetailResponse extends BaseResponse{

	
	private List<FilmDetail> filmDetailList;

	public List<FilmDetail> getFilmDetailList() {
		return filmDetailList;
	}

	public void setFilmDetailList(List<FilmDetail> filmDetailList) {
		this.filmDetailList = filmDetailList;
	}	
}
