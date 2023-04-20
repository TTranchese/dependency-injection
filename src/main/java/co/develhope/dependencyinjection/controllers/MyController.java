package co.develhope.dependencyinjection.controllers;

import co.develhope.dependencyinjection.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
	public MyService myService;
	@Autowired
	public MyController(MyService myService) {
		this.myService = myService;
	}
	
	@GetMapping("/")
	public String getWelcomeMessage(){
		return "Welcome!";
	}
	
	@GetMapping("/getName")
	public String getName(){
		return myService.getName();
	}
}
