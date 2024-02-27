package demo.techniques.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        System.setProperty("spring.config.name", "actuator-demo-app");
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
    }
}
