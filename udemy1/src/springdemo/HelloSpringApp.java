package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach thecoach = Context.getBean("mycoach", Coach.class);

		// call methods on the bean
		System.out.println(thecoach.getDailyWorkout());
		
		// close the context
		Context.close();
	}

}
