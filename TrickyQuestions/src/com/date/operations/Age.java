package com.date.operations;

import java.time.LocalDate;
import java.time.Period;

public class Age {
	public static void main(String[] args) {
    LocalDate birthDate = LocalDate.of(2000, 3, 10);
    LocalDate today = LocalDate.now();
    Period age = Period.between(birthDate, today);
    System.out.println(age.getYears());
	}
}
