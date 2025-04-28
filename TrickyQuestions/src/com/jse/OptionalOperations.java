package com.jse;

import java.util.Optional;

public class OptionalOperations {
	public static void main(String[] args) {
    Optional<String> opt = Optional.ofNullable(null);
    //opt.ifPresentOrElse(System.out::println,()-> {throw new IllegalArgumentException("Dont have value");});
    opt.orElseGet(()->"Ganesh");
	}
}
