package com.xworkz.configuration;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.TestDto;

@Component
@RequestMapping("/test")
public class TestComponent {

	public TestComponent() {
		System.out.println("created " + this.getClass().getSimpleName());
	}
	
	@GetMapping
	public String writeTest(TestDto dto) {
		
		System.out.println("running the writeTest");
		System.out.println("dto is"+dto);
		return "Testjsp.jsp";
		
	}

}