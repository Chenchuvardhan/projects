package com.date.operations;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DateOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			LocalDate.parse("12-03-2023");
		} catch (Exception e) {
			System.out.println("Wrong Format");
			System.out.println(LocalDate.parse("12-03-2023", DateTimeFormatter.ofPattern("dd-MM-yyyy")).getMonth());
			String format = LocalDate.now().plusDays(84).format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			System.out.println(format);
			
		}
		System.out.println(LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.SUNDAY)).format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		Optional<Character> map = "".chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().sorted((i,j)->j.getValue().compareTo(i.getValue())).skip(1).findFirst().map(i->i.getKey());
		map.ifPresentOrElse(i->System.out.println(i),()->System.out.println("The Second Most Repeated Charcter is not presented"));
		Date date = new Date();
		System.out.println(date);
		"hellohe".chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().sorted(Map.Entry.comparingByValue()).skip(2).findFirst().ifPresentOrElse(System.out::println,()->System.out.println("There is no Character"));
	}

}
