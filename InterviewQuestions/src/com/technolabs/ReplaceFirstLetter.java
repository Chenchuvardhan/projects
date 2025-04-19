package com.technolabs;
public class ReplaceFirstLetter {
    public static void main(String[] args) {
        String input = "  This  is   a example  sentence  ";
        System.out.println(input);
        String output = input.replaceAll("\\b(\\w)", "_");
        System.out.println(output);
    }
}