package com.learning.movie;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movies")
public class Movie {
	@Id
	private String id;
	private String title;
	private String content;

	public Movie() {

	}

	public Movie(String title, String content) {
		this.setTitle(title);
		this.setContent(content);
	}

	public Movie(String id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Topic{" + "id=" + id + ", title='" + title + '\'' + ", content='" + content + '\'' + '}';
	}
}
