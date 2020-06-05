package com.exp.imdb.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NAME_BASICS")
public class NameBasics implements Serializable{
	
	
	@Id
	@Column(name="nconst", unique = true, nullable=false)
	private String nconst;
	@Column(name="primaryName", length=255, nullable=false)
	private String primaryName;
	@Column(name="birthYear", nullable=false)
	private Short birthYear;
	@Column(name="deathYear", nullable=true)
	private Short deathYear;
	@Column(name="primaryProfession")
	@ElementCollection(targetClass=String.class)
	private List<String> primaryProfession;
	
	@Column(name="knownForTitles", columnDefinition = "VARCHAR(255) REFERENCES TITLE_BASICS(tconst)")
	@ElementCollection(targetClass=String.class)
	private List<String> knownForTitles;

	
	
	public String getNconst() {
		return nconst;
	}

	public void setNconst(String nconst) {
		this.nconst = nconst;
	}

	public String getPrimaryName() {
		return primaryName;
	}

	public void setPrimaryName(String primaryName) {
		this.primaryName = primaryName;
	}

	public Short getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Short birthYear) {
		this.birthYear = birthYear;
	}

	public Short getDeathYear() {
		return deathYear;
	}

	public void setDeathYear(Short deathYear) {
		this.deathYear = deathYear;
	}

	public List<String> getPrimaryProfession() {
		return primaryProfession;
	}

	public void setPrimaryProfession(List<String> primaryProfession) {
		this.primaryProfession = primaryProfession;
	}

	public List<String> getKnownForTitles() {
		return knownForTitles;
	}

	public void setKnownForTitles(List<String> knownForTitles) {
		this.knownForTitles = knownForTitles;
	}

	
	
}
