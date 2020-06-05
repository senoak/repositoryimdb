package com.exp.imdb.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.exp.imdb.enumeration.ExceptionEnum;
import com.exp.imdb.response.BaseResponse;

/**
 * @author Å�.A
 *
 */
public class Helper {
	
	private static final Logger logger = LoggerFactory.getLogger(Helper.class);	
	
	private Helper() {

	}

	public static BaseResponse getExceptionEmbededGenericResponse(ExceptionEnum exception) {
		
		BaseResponse baseResponse = new BaseResponse(exception.getCode(), exception.getMessage());
		return baseResponse;
	}
	
}
