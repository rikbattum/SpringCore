package Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		Auto auto = (Auto) context.getBean("auto");
		auto.printAuto();
		Fiets fiets = (Fiets) context.getBean("fiets");
	}

}
