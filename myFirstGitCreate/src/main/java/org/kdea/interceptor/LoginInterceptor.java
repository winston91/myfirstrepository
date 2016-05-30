package org.kdea.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {                                     /*많은 컨트롤러를 담을 수 있게 Object형 파라미터*/
		                                                                               /*Controller*/
		// TODO Auto-generated method stub
		
		// 뒤돌아가는 컨트롤러에 접근이 가능하다.
/*		MyController chat = (MyController)handler;
		if(chat.msg==null){
			
			chat.msg="userid";
			
		}*/
		System.out.println("interceptor 실행");
		
		HttpSession session = request.getSession(false);
		if(session==null){
			
			System.out.println("session 없음");
			response.sendRedirect("../login/form");
			return false;
			
		}
		if(session.getAttribute("ID") == null){
			System.out.println("session 값 없음");
			response.sendRedirect("../login/form");
			return false;
			
		}
	    
		return true;
	}

}
