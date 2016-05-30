package org.kdea.java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("first")
public class myFirstGit {

	@RequestMapping("/home")
	public String myGitIndex(){
		
		return "index";
		
	}
	
}
