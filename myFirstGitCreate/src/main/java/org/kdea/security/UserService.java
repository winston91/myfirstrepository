package org.kdea.security;

import java.util.ArrayList;
import java.util.List;

import org.kdea.vo.UserAuthVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/*@Service : �뼱�끂�뀒�씠�뀡�씠硫� 鍮덉쑝濡� �벑濡앸맖*/
@Service
public class UserService implements UserDetailsService{
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		System.out.printf("loadUserByUsername(), username=%s \n", username);
		/*CustomAuthDAO dao = sqlSessionTemplate.getMapper(CustomAuthDAO.class);*/
		UserAuthVO loginauth = /*dao.loginAuth(username)*/null;
		
		String password;
/*		if(loginauth!=null){
			password = loginauth.getPwd();
		}else{
			throw new UsernameNotFoundException("�빐�떦 �쑀��媛� �뾾�뒿�땲�떎.");
		}*/
		
		GrantedAuthority role = new SimpleGrantedAuthority(loginauth.getAuthority());
		
		List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
		roles.add(role);
		User user = /*new User(username, password, roles)*/null;		
		return user;
		
	}

}
