package com.jse;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String name = "John";

        Optional<String> optionalName = Optional.of(name);
        System.out.println(optionalName.get()); // Output: John

        // Throws NullPointerException
        Optional<String> error = Optional.of(null); // ❌ Throws Exception
    }
}
