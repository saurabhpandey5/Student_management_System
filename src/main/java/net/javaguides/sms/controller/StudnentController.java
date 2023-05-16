package net.javaguides.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguides.sms.service.StudentService;

@Controller
public class StudnentController {

	private StudentService studentService;

	public StudnentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	//handler method to handle list student and return mode and view
	@GetMapping("/students")
	public String listStudent(Model m) {
		
		m.addAttribute("student",studentService.getallStudents());
		return "students";
	}
}
