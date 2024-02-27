package demo.components;

import org.springframework.stereotype.Component;
import java.time.LocalTime;

@Component
public class MyComponent {

    private LocalTime ts = LocalTime.now();

    public MyComponent() {
        System.out.printf("MyComponent bean created at %s\n", ts);
    }

    @Override
    public String toString() {
        return String.format("Hi from MyComponent bean created at %s\n", ts);
    }
}