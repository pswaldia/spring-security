package tech.pswaldia.jpaauthentication.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String hello() {
		return "<h1>Welcome</h1>";
	}
	
	@RequestMapping("/user")
	public String helloUser() {
		return "<h1>Welcome user</h1>";
	}
	
	@RequestMapping("/admin")
	public String helloAdmin() {
		return "<h1>Welcome admin</h1>";
	}
	
	
	
	
}
