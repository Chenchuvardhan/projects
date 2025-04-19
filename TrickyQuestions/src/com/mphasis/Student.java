package com.mphasis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
	private Integer studentId;
	private String studentName;
	private Double studentFee;

	public Student(Integer studentId, String studentName, Double studentFee) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFee = studentFee;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 2;
	}

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(101, "Niranjan", 89843.00));
		list.add(new Student(102, "Tagore", 20934.00));
		list.add(new Student(103, "Manish", 90934.00));
		list.add(new Student(104, "Vijay", 9898.00));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFee=" + studentFee + "]";
	}
}
