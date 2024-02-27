package demo.components;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		MyComponent beanRef = ctx.getBean("myComponent", MyComponent.class);
		System.out.println(beanRef);
	}

}
