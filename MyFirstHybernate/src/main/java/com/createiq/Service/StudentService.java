package com.createiq.Service;

import java.util.List;

import com.createiq.model.Student;

public interface StudentService {
public void save(Student student);
	
	public void update(Student student);
	
	public void delete(Student student);
	
	public List<Student> findAllStds();
	
	public Student getById(int sid);
}
