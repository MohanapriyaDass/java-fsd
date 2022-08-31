package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {
@Autowired
	EmployeeDAO dao;
	
@PostMapping("/insert")
	public Employee insert(@RequestBody Employee e) {
		return dao.insert(e);
	}


@PostMapping("/insertall")
public List<Employee> insertall(@RequestBody List<Employee> e){
	return dao.insertall(e);
}


@GetMapping("/getall")
public List<Employee> getall(){
	return dao.getall();
}

@PutMapping("/update")
public Employee updateByName(@RequestBody Employee e) {
	return dao.updateByName(e);
}


@DeleteMapping("/delete/{id}")
public String delete(@PathVariable  int id) {
	 return dao.delete(id);
}

@GetMapping("/getbyname/{name}")
public List<Employee> findbyname(@PathVariable String name) throws Exception{
	if(dao.findbyname(name).size()==0) {
		throw new NameNotFoundException("name not found");
	}
	return dao.findbyname(name);
}

@GetMapping("/getbyid/{id}")
public Employee getbyid(@PathVariable int id) throws ResourceNotFoundException {
	return dao.getbyid(id).orElseThrow(()->new ResourceNotFoundException("id value is not found"));
}


}




