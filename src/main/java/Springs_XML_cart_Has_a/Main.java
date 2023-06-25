package Springs_XML_cart_Has_a;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("findcart.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Cart cart = beanFactory.getBean("cart",Cart.class);
		System.out.println(cart);
		System.out.println(cart.name);
		System.out.println(cart.size);
		Item item = cart.item;
		System.out.println(item.name);
		System.out.println(item.cost);
		
	}
}
