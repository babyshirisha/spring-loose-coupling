package com.bridgelabz.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
//	Student student = new Student();
//	MathCheat cheat = new MathCheat();
//	student.setMathcheat(cheat);
//	student.cheating();
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student = context.getBean("student",Student.class);
		student.cheating();
//		Student2 student2 = context.getBean("student2",Student2.class);
//		student2.startCheating();
	} 
}

 