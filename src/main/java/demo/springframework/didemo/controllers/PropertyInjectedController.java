package demo.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import demo.springframework.didemo.services.GreetingService;
@Controller
public class PropertyInjectedController {

	@Autowired
	@Qualifier("greetingServiceImpl")
	public GreetingService greetingServiceImpl; // in this case it used reflection instead of qualifier, also in case of @Primary, the primary bean is injected - not good practice - USE qualifiers
	
	public String sayHello() {
		return greetingServiceImpl.sayGreeting();
	}
}
