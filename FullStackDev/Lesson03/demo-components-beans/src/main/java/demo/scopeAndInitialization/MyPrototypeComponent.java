package demo.scopeAndInitialization;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope("prototype")
public class MyPrototypeComponent {

    private static int nextId;
    private int id = nextId++;

    public MyPrototypeComponent() {
        System.out.printf("MyPrototypeComponent bean %d created\n", id);
    }

    @Override
    public String toString() {
        return String.format("Hi from MyPrototypeComponent %d", id);
    }
}