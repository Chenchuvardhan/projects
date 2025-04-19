package com.mphasis;
import java.util.*;

class Employeee {
    String name;
    int age;

    Employeee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ComparatorOldWay {
    public static void main(String[] args) {
        List<Employeee> employees = Arrays.asList(
            new Employeee("John", 30),
            new Employeee("Alice", 25),
            new Employeee("Bob", 28)
        );

        // Sorting using an anonymous class
        Collections.sort(employees, new Comparator<Employeee>() {
        	@Override
        	public int compare(Employeee o1, Employeee o2) {
        		return o2.age-o1.age;
        	};
		} );

        System.out.println(employees);
    }
}
