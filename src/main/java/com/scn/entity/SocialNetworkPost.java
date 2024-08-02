package com.scn.entity;

import jakarta.persistence.Column;

//import javax.persistence.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

@Entity

public class SocialNetworkPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date postDate;

    private String postCategory; 

    private String author;

    @Column(columnDefinition = "TEXT")
    private String content;

    private Long viewCount;

    
    
	public SocialNetworkPost() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SocialNetworkPost(Long id, Date postDate, String postCategory, String author, String content,
			Long viewCount) {
		super();
		this.id = id;
		this.postDate = postDate;
		this.postCategory = postCategory;
		this.author = author;
		this.content = content;
		this.viewCount = viewCount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public String getPostCategory() {
		return postCategory;
	}

	public void setPostCategory(String postCategory) {
		this.postCategory = postCategory;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getViewCount() {
		return viewCount;
	}

	public void setViewCount(Long viewCount) {
		this.viewCount = viewCount;
	}

    
    
    
}
