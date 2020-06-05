package com.exp.imdb.service;

import com.exp.imdb.request.TogetherPlayedRequest;
import com.exp.imdb.response.FilmDetailResponse;
import com.exp.imdb.response.TogetherPlayedResponse;

public interface IImdbService {
	
	public FilmDetailResponse getActorActressFilmDetail(String actorActress);
	
	public TogetherPlayedResponse getActorActressTogetherPlayed(TogetherPlayedRequest actorActressList);

}
