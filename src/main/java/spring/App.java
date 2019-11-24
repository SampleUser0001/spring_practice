package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private static ApplicationContext app;
	
	public static void main(String[] args) {

		app = new ClassPathXmlApplicationContext("bean.xml");
		MyBeanInterface bean1 = (MyBeanInterface)app.getBean("mybean1");
		System.out.println(bean1);
	}
}
