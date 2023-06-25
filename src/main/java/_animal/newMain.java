package _animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class newMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myGST.xml");
		GST gst =applicationContext.getBean(MahaGST.class, "mah");
		gst.setGST();
	}
}
