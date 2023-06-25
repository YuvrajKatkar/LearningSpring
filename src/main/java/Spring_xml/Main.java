package Spring_xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("myMobile.xml");
		Mobile mobile= (Mobile) beanFactory.getBean("mob");
		mobile.used();
		System.out.println(mobile.getCost());
		beanFactory.getBean(Mobile.class).used();
	}

}
