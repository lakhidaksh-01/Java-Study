package com.daksh.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.daksh.domain.*;
import com.daksh.services.*;
import com.daksh.dto.*;
import java.util.*;
@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	public StudentService studentservice;
	
	@PostMapping("/create")
	public void createStudent(@RequestBody StudentDTO std){
		studentservice.createStudent(std);
	}
	
	@PutMapping("/update")
	public void updateStudent(@RequestBody StudentUpdateDTO std) {
		studentservice.updateNumberById(std.getNumber(),std.getId());
	}
	
	@GetMapping("/view")
	public List<Student> viewall() {
		return studentservice.viewall();
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody StudentDeleteDTO std) {
		studentservice.deleteById(std.getId());
	}
}
