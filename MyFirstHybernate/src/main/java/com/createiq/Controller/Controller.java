package com.createiq.Controller;

import java.util.List;


import org.hibernate.service.Service;

import com.createiq.Service.StudentServiceimpl;
import com.createiq.model.Student;

public class Controller {

	private StudentServiceimpl studentServiceimpl = new StudentServiceimpl();

	public void save(Student student) {
		studentServiceimpl.save(student);
	}

	public void update(Student student) {
		studentServiceimpl.update(student);
	}

	public void delete(Student student) {
		studentServiceimpl.delete(student);
	}

	public List<Student> findAllStds(){
		return studentServiceimpl.findAllStds();
	}

	public Student getById(int sid) {
		return studentServiceimpl.getById(sid);
	}
}
