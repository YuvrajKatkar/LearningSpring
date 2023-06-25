package _animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myAnimal.xml");
//		Cow cow =applicationContext.getBean("cow",Cow.class);
//		cow.sound();
//		Animal animal =applicationContext.getBean("lion",Lion.class);
//		animal.sound();
		
	}
}
