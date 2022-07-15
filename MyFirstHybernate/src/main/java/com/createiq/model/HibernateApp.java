package com.createiq.model;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.createiq.model.Student;

public class HibernateApp {
	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		Student student = new Student(102, "Aravind", 25000.0);
		session.update(student);
		session.beginTransaction().commit();
		session.close();
	}
}

