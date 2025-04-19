package com.jse;
import java.util.Arrays;
import java.util.List;

public class PeekExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.stream()
            .peek(name -> System.out.println("Before filter: " + name))
            .filter(name -> name.startsWith("A"))
            .peek(name -> System.out.println("After filter: " + name))
            .forEach(System.out::println);
    }
}
