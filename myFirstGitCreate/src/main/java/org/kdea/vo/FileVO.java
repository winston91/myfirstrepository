package org.kdea.vo;

import java.sql.Date;

public class FileVO {
	
	String storedname;
	String author;
    Date uploaddate;
	String filename;
	int filesize;
	public String getStoredname() {
		return storedname;
	}
	public void setStoredname(String storedname) {
		this.storedname = storedname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getUploaddate() {
		return uploaddate;
	}
	public void setUploaddate(Date uploaddate) {
		this.uploaddate = uploaddate;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public int getFilesize() {
		return filesize;
	}
	public void setFilesize(int filesize) {
		this.filesize = filesize;
	}		

}
