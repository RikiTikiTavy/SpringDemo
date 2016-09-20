package ru.spring.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.spring.pool.T1000Pool;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("T1000.xml");
		//
		// ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
		// t1000.action();
		//
		// RobotConveyor t1000Conveyor = (RobotConveyor)
		// context.getBean("t1000Conveyor");
		//
		// Robot teminator1 = t1000Conveyor.createRobot();
		// Robot teminator2 = t1000Conveyor.createRobot();
		// Robot teminator3 = t1000Conveyor.createRobot();
		//
		// System.out.println("terminator1 " + teminator1);
		// System.out.println("terminator1 " + teminator2);
		// System.out.println("terminator1 " + teminator3);

		T1000Pool t1000Pool = (T1000Pool) context.getBean("t1000Pool");
		t1000Pool.action();
	}
}
