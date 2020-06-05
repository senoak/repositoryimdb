package com.exp.imdb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.exp.imdb.enumeration.ExceptionEnum;
import com.exp.imdb.helper.Helper;
import com.exp.imdb.request.TogetherPlayedRequest;
import com.exp.imdb.response.BaseResponse;
import com.exp.imdb.service.IImdbService;


/**
 * @author 
 *
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/imdb")
public class ImdbServiceController {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private IImdbService imdbService;
	
    @RequestMapping(value = "/getActorActressFilmDetails", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public BaseResponse getActorActressFilmDetails (@RequestParam(required=false, name="actorActress") String  actorActress) {
		return imdbService.getActorActressFilmDetail(actorActress);
    }

    @RequestMapping(value = "/getActorActressTogetherPlayed", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public BaseResponse getActorActressTogetherPlayed (@RequestBody TogetherPlayedRequest  actorActressList) {
    	return imdbService.getActorActressTogetherPlayed(actorActressList);
    }

    
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public BaseResponse handleTypeMismatch(MethodArgumentTypeMismatchException ex) {
    	logger.error(ex.getMessage());
		return Helper.getExceptionEmbededGenericResponse(ExceptionEnum.INVALID_PARAMETERS );
    }
}
