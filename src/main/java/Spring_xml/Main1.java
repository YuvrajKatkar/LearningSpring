package Spring_xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("myEmp.xml");
		Employee employee =  beanFactory.getBean(Employee.class,"emp");
		System.out.println(employee);
	}
}
