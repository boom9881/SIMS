package com.tt.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tt.sms.dao.StudentRepository;
import com.tt.sms.vo.Student;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	
	public List<Student> findByClassId(){
		return studentRepository.findByClassId(null, null);
	}
}
