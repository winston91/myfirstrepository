package org.kdea.vo;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
/*Java Bean Validation API, Hibernate Validation */
public class LoginVO {
	
	boolean ok;
	
	/*어노테이션에 붙는 조건만으로는 상세하게 검증 못하나보다 */
	/*validator 인터페이스 이용*/
	// servlet-context.xml에 messageSource 빈즈를 추가해서 에러메세지를 저장해 놓는다.
	
	@Size(min=1,max=10)
	String id;
	
	@NotEmpty
	String pwd;
	
	public boolean isOk() {
		return ok;
	}
	public void setOk(boolean ok) {
		this.ok = ok;
	}
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
	
}
