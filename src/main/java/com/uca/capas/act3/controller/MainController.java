package com.uca.capas.act3.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.act3.domain.Student;

@Controller
public class MainController {
	
	private List<Student> students = new ArrayList<Student>();
	
	@GetMapping(path ="/ejemplo1", produces = MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public String ejemplo1() {
		return "Prueba :v";
	}
	
	@GetMapping("/ejemplo2")
	public @ResponseBody java.util.List<Student> ejemplo2(){
		return Arrays.asList(
				new Student("Luisa", "Arevalo", "5/3/2017","Carrera X", true),
				new Student("Student 2","Lastname", "3/2/2012","Carrera X2", false)
				);
	}
	
	@GetMapping("/inicio")
	public String inicio(Student student) {
		return "index";
	}
	
	@PostMapping("/formData")
	public ModelAndView procesar(Student student) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("prueba");
		mav.addObject("estado", new Student());
		
		return mav;
	}
	
	@GetMapping("/listado")
	public ModelAndView listado() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("listado");
		mav.addObject("studentList", this.students);
		
		return mav;
	}
	
	
}
