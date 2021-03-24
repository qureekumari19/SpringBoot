package com.psl.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.psl.entity.Employee;
import com.psl.service.TestService;

//@RestController
@Controller
public class TestController {

	@Autowired
	TestService ts;
	@GetMapping("/hel")
	public String sayHello()
	{
		return "details";
	}
	
	@GetMapping("/emp/{id}")
	public Employee getEmployee(@PathVariable String id)
	{
		return ts.getEmployee(Integer.parseInt(id));
	}
	
	@PostMapping("/emp")
	public void addEmployee(@RequestBody Employee e)
	{
		ts.addEmployee(e);
	}
	@PutMapping("/emp")
	public void updateEmployee(@RequestBody Employee e)
	{
		ts.updateEmployee(e);
	}
	@DeleteMapping("/emp/{id}")
	public void deleteEmployee(@PathVariable String id)
	{
		ts.deleteEmployee(Integer.parseInt(id));
	}
}
