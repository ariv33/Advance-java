
package com.createiq.Dao;

import java.util.List;


import org.hibernate.Session;

import com.createiq.model.Student;
import com.createiq.util.SessionUtil;

public class StudentDAOimpl implements StudentDAO {

	public void save(Student student) {
		Session session = SessionUtil.getSession();
		session.save(student);
		session.beginTransaction().commit();
		SessionUtil.close(session);
	}

	public void update(Student student) {
		Session session = SessionUtil.getSession();
		session.update(student);
		session.beginTransaction().commit();

		SessionUtil.close(session);
	}

	public void delete(Student student) {
		Session session = SessionUtil.getSession();
		session.delete(student);
		session.beginTransaction().commit();

		SessionUtil.close(session);
	}

	@Override
	public List<Student> findAllStds() {
		return SessionUtil.getSession().createQuery("from Student").list();
	}

	@Override
	public Student getById(int sid) {
		return (Student) SessionUtil.getSession().get(Student.class, sid);
	}

}
