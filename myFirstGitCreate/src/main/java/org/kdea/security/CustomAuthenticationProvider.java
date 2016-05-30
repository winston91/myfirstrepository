package org.kdea.security;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

/*@Component : 어노테이션이면 빈으로 등록됨*/
@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
		
	@Autowired
	private UserService userService;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		String username = authentication.getName();
		String password = (String)authentication.getCredentials();
		
		User user = null;
		Collection<? extends GrantedAuthority> authorities = null;
		
		System.out.printf("athenticate(), username=%s \n", username);
		if(userService==null){
			
			System.out.printf("userService가 null입니다.");
			
		}
		
		user = (User)userService.loadUserByUsername(username);
		 
        if (!passwordEncoder.matches(password, user.getPassword())) 
                throw new BadCredentialsException("비밀번호 불일치");

        authorities = user.getAuthorities();
		
		return new UsernamePasswordAuthenticationToken(username, password, authorities);
		
	}
	
}