package com.jagannadh;

/*
Q5) A school maintains a list of student roll numbers who attended a special
workshop. When a teacher wants to check if a particular student attended the
session, the system should allow them to search using the roll number.
Requirement:
Write a Java program that stores student roll numbers in an array and allows
the user to search for a specific roll number. If found, print a success
message, otherwise display "Roll number not found."
*/
import java.util.Arrays;
import java.util.Scanner;

class WorkShop {
	int[] rollNumbers;
public  void workshopattendies(int[] rollNo) {
	int[] clone = rollNo.clone();
     rollNumbers=clone;
     System.out.println(Arrays.toString(this.rollNumbers));
}
public void searchStudentByNumber(int key){
	boolean isAttended=false;
	for(int i:rollNumbers) {
		if(key==i) {
			isAttended=true;
			System.out.println(key+"Attended");
			break;
		}
	}
	if(!isAttended) {
		System.out.println("Not Attended");
	}
}
}

public class WorkShopService {
	public static void main(String[] args) {
     try(Scanner scan = new Scanner(System.in)){
    	 System.out.println("Enter roll numbers ");
    	 int[] rollNumbers=new int[10];
    	 for(int i=0;i<rollNumbers.length;i++) {
    		 rollNumbers[i]=scan.nextInt();
    	 }
    	 System.out.println(Arrays.toString(rollNumbers));
      WorkShop java = new WorkShop();
      java.workshopattendies(rollNumbers);
      System.out.println("Enter roll number to search  ");
      java.searchStudentByNumber(scan.nextInt());
     }
     catch (Exception e) {
		// TODO: handle exception
	}
	}
}
