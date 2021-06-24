package com.protecao.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/")
public class Test {

	
	@GetMapping
	public String getHello() {
		return "Funcionando no ar!";

	}

}
 