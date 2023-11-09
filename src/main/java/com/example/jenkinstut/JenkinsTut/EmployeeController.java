package com.example.jenkinstut.JenkinsTut;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class EmployeeController {
	
	@RequestMapping("/emp")
	public String EmployeeDetails() {
		
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("santanu");
		e1.setContact("9774301990");
		
		return e1.toString();
	}

}
