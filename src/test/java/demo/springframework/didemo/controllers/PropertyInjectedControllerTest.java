package demo.springframework.didemo.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import demo.springframework.didemo.services.GreetingServiceImpl;

class PropertyInjectedControllerTest {
	
	private PropertyInjectedController propertyInjectedController;
	
	@BeforeAll
	public void setUp() throws Exception {
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
	}

	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());
	}

}
