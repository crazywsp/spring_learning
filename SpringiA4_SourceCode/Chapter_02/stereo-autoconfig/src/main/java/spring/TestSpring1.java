package spring;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.ProductService;

public class TestSpring1 {

	@Test
	public void test(){
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[]{"applicationContext2.xml"});
		
		ProductService s = (ProductService) context.getBean("productService");
		s.doSomeService();
	}
}
