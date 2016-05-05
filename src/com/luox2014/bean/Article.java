package com.luox2014.bean;

import java.sql.Date;
import java.sql.Timestamp;

public class Article {
private String id;
private String author;
private String title;
private String content;
private int mark;
private Date date;
private Timestamp createTime;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
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
public int getMark() {
	return mark;
}
public void setMark(int mark) {
	this.mark = mark;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public Timestamp getCreateTime() {
	return createTime;
}
public void setCreateTime(Timestamp createTime) {
	this.createTime = createTime;
}



}
