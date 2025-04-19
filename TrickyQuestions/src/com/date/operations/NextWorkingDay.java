package com.date.operations;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NextWorkingDay {
	public static void main(String[] args) {
		try {
		LocalDate date = LocalDate.now();

		do {
		    date = date.plusDays(1);
		} while (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY);

		System.out.println("Next working day: " + date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		System.out.println(LocalDate.now().getYear());
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
