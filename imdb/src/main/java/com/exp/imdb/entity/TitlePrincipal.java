package com.exp.imdb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TITLE_PRINCIPAL")
public class TitlePrincipal implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable=false)
	private Integer id;
	
	@Column(name="tconst", nullable=false)
	private String tconst;  

	@Column(name="ordering")
	private Integer ordering;
	@Column(name="nconst")
	private String nconst;
	@Column(name="category")
	private String category;
	@Column(name="job", length=255, nullable=true)
	private String job;
	@Column(name="characters", length=255, nullable=true)
	private String characters;
	
	
	public String getTconst() {
		return tconst;
	}
	public Integer getOrdering() {
		return ordering;
	}
	public String getNconst() {
		return nconst;
	}
	public String getCategory() {
		return category;
	}
	public String getJob() {
		return job;
	}
	public String getCharacters() {
		return characters;
	}
	public void setTconst(String tconst) {
		this.tconst = tconst;
	}
	public void setOrdering(Integer ordering) {
		this.ordering = ordering;
	}
	public void setNconst(String nconst) {
		this.nconst = nconst;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setCharacters(String characters) {
		this.characters = characters;
	}
	
	
	
}
