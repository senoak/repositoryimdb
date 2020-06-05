package com.exp.imdb.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.exp.imdb.enumeration.TitleTypeEnum;

@Entity
@Table(name = "TITLE_BASICS")
public class TitleBasics implements Serializable {
	
	
	@Id
	@Column(name="tconst", unique = true, nullable=false)
	private String tconst;  

	@Column(name="titleType", length=50, nullable=false )
	@Enumerated(EnumType.STRING)
	private TitleTypeEnum titleType;
	@Column(name="primaryTitle", length=255, nullable=false)
	private String primaryTitle;
	@Column(name="originalTitle", length=255, nullable=false)
	private String originalTitle;
	@Column(name="isAdult")
	private Boolean isAdult;
	@Column(name="startYear")
	private Short startYear;
	@Column(name="endYear", nullable=true)
	private Short endYear;
	@Column(name="runtimeMinutes")
	private Short runtimeMinutes; 

	@Column(name="genres")
	@ElementCollection(targetClass=String.class)
	private List<String> genres;

	public String getTconst() {
		return tconst;
	}

	public TitleTypeEnum getTitleType() {
		return titleType;
	}

	public String getPrimaryTitle() {
		return primaryTitle;
	}

	public String getOriginalTitle() {
		return originalTitle;
	}

	public Boolean getIsAdult() {
		return isAdult;
	}

	public Short getStartYear() {
		return startYear;
	}

	public Short getEndYear() {
		return endYear;
	}

	public Short getRuntimeMinutes() {
		return runtimeMinutes;
	}

	public List<String> getGenres() {
		return genres;
	}

	public void setTconst(String tconst) {
		this.tconst = tconst;
	}

	public void setTitleType(TitleTypeEnum titleType) {
		this.titleType = titleType;
	}

	public void setPrimaryTitle(String primaryTitle) {
		this.primaryTitle = primaryTitle;
	}

	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}

	public void setIsAdult(Boolean isAdult) {
		this.isAdult = isAdult;
	}

	public void setStartYear(Short startYear) {
		this.startYear = startYear;
	}

	public void setEndYear(Short endYear) {
		this.endYear = endYear;
	}

	public void setRuntimeMinutes(Short runtimeMinutes) {
		this.runtimeMinutes = runtimeMinutes;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}
	
	
	

}
