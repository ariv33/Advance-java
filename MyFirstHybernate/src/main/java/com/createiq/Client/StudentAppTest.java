package com.createiq.Client;

import java.util.ArrayList;
import java.util.List;

import com.createiq.Controller.Controller;
import com.createiq.model.Student;

public class StudentAppTest {
	
	public static void main(String[] args) {
		Controller controller=new Controller();
		Student student=new Student(102, "kamal", 25000.00);
		System.out.println("------------Student details Strat---------");
		controller.save(student);
		System.out.println("-------Student Datails End-----------");
//		System.out.println(controller.getById(101));
//		List<Student> list=new ArrayList<>();
//		list=controller.findAllStds();
//		for (Student student1 : list) {
//			System.out.println(student);
//		}
//		Student student1=new Student(102, "aravind", 25000.00);
//		controller.update(student);
	}

}
