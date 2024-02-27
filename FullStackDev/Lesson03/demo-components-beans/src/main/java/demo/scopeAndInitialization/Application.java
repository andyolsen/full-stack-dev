package demo.scopeAndInitialization;

import demo.components.MyComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		System.out.println("********** Before SpringApplication.run **********");
		ApplicationContext ctx = SpringApplication.run(Application.class);
		System.out.println("********** After SpringApplication.run **********");

		demoSingleton(ctx);
		demoPrototype(ctx);
	}

	private static void demoSingleton(ApplicationContext ctx) {

		MySingletonComponent ref1 = ctx.getBean(MySingletonComponent.class);
		MySingletonComponent ref2 = ctx.getBean(MySingletonComponent.class);
		MySingletonComponent ref3 = ctx.getBean(MySingletonComponent.class);

		System.out.println(ref1);
		System.out.println(ref2);
		System.out.println(ref3);
	}

	private static void demoPrototype(ApplicationContext ctx) {

		MyPrototypeComponent bean1 = ctx.getBean(MyPrototypeComponent.class);
		MyPrototypeComponent bean2 = ctx.getBean(MyPrototypeComponent.class);
		MyPrototypeComponent bean3 = ctx.getBean(MyPrototypeComponent.class);

		System.out.println(bean1);
		System.out.println(bean2);
		System.out.println(bean3);
	}
}
