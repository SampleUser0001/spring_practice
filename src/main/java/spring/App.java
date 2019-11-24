package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private static ApplicationContext app;
	
	public static void main(String[] args) {

		app = new ClassPathXmlApplicationContext("bean.xml");
		MyBean bean1 = (MyBean)app.getBean("mybean2");
		System.out.println(bean1);
	}
}
