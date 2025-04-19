package com.mphasis;

public class FilterVowels {
public static void main(String[] args) {
	String word="stream";
	word.chars().filter(i->{
		char k=(char)i;
		return !(k=='a'||k=='e'||k=='i'||k=='o'||k=='u');
	}).forEach(i->System.out.print((char)i));
}
}
