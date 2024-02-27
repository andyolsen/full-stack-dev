package demo.scopeAndInitialization;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class MySingletonComponent {

    private static int nextId;
    private int id = nextId++;

    public MySingletonComponent() {
        System.out.printf("MySingletonComponent bean %d created\n", id);
    }

    @Override
    public String toString() {
        return String.format("Hi from MySingletonComponent %d", id);
    }
}