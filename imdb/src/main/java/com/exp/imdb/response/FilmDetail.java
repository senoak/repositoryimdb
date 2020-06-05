package com.exp.imdb.response;

import java.util.List;

public class FilmDetail{

	private String tconst;
	private String titleType;
	private String primaryTitle;
	private String originalTitle;
	private boolean isAdult;
	private short startYear;
	private short endYear;
	private short runtimeMinutes;
	private List<String> genres;
	
	
	public String getTconst() {
		return tconst;
	}
	public String getTitleType() {
		return titleType;
	}
	public String getPrimaryTitle() {
		return primaryTitle;
	}
	public String getOriginalTitle() {
		return originalTitle;
	}
	public boolean isAdult() {
		return isAdult;
	}
	public short getStartYear() {
		return startYear;
	}
	public short getEndYear() {
		return endYear;
	}
	public short getRuntimeMinutes() {
		return runtimeMinutes;
	}
	public List<String> getGenres() {
		return genres;
	}
	public void setTconst(String tconst) {
		this.tconst = tconst;
	}
	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}
	public void setPrimaryTitle(String primaryTitle) {
		this.primaryTitle = primaryTitle;
	}
	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}
	public void setAdult(boolean isAdult) {
		this.isAdult = isAdult;
	}
	public void setStartYear(short startYear) {
		this.startYear = startYear;
	}
	public void setEndYear(short endYear) {
		this.endYear = endYear;
	}
	public void setRuntimeMinutes(short runtimeMinutes) {
		this.runtimeMinutes = runtimeMinutes;
	}
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	
}
