package org.kdea.vo;

import java.sql.Date;

public class BoardVO {

	int rowno;
	
	int boardno;
	
	String author;
	
	String title;
	
	String contents;
	
	Date wdate;
	
	int ref;
	
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
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getBoardno() {
		return boardno;
	}
	public void setBoardno(int boardno) {
		this.boardno = boardno;
	}
	public Date getWdate() {
		return wdate;
	}
	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public int getRowno() {
		return rowno;
	}
	public void setRowno(int rowno) {
		this.rowno = rowno;
	}

}
