package com.nttdata.bootcamp.productservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{
	
	//Modo 1 via @Autowired
	@Autowired
	Environment environment;
	
	@GetMapping("/port2")
	public String getPort2() {
		return "El puerto del micro es "+ environment.getProperty("local.server.port");
	}
	
	//Modo 2  via @Value
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/port")
	public String getPort() {
		return "El puerto del micro es "+ port;
	}
}
