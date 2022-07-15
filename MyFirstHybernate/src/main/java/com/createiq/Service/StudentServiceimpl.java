package com.createiq.Service;

import java.util.List;


import com.createiq.Dao.StudentDAO;
import com.createiq.Dao.StudentDAOimpl;
import com.createiq.model.Student;

public class StudentServiceimpl implements StudentService{
	
	private StudentDAO studentDAO=new StudentDAOimpl();

	@Override
	public void save(Student student) {
		
		studentDAO.save(student);
	}

	@Override
	public void update(Student student) {
		
		studentDAO.update(student);
	}

	@Override
	public void delete(Student student) {
		studentDAO.delete(student);
	}

	@Override
	public List<Student> findAllStds() {
		return studentDAO.findAllStds();
	}

	@Override
	public Student getById(int sid) {
		return studentDAO.getById(sid);
	}

}
