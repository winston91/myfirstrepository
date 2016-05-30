package org.kdea.vo;

public class UserAuthVO {

	String id;
	String pwd;
	String authority;
	boolean saveok;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}	
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public boolean isSaveok() {
		return saveok;
	}
	public void setSaveok(boolean saveok) {
		this.saveok = saveok;
	}
	
	
}
