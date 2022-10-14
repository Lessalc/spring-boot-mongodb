package com.lessalc.workshopmongo.dto;

import java.util.Date;

public class CommentDTO {

	private String text;
	private Date date;
	private AuthorDTO authorDTO;
	
	public CommentDTO() {
		// TODO Auto-generated constructor stub
	}

	public CommentDTO(String text, Date date, AuthorDTO authorDTO) {
		super();
		this.text = text;
		this.date = date;
		this.authorDTO = authorDTO;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AuthorDTO getAuthorDTO() {
		return authorDTO;
	}

	public void setAuthorDTO(AuthorDTO authorDTO) {
		this.authorDTO = authorDTO;
	}
	
	
}
