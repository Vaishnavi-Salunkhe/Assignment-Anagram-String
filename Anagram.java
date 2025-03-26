package com.topic.anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (areAnagram(str1, str2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
	public static boolean areAnagram(String str1, String str2) {
        // Remove non-alphabetic characters and convert to lowercase
        String Str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String Str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();
        

        // Sort the strings
        char[] charArray1 = Str1.toCharArray();
        char[] charArray2 = Str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted strings
        return Arrays.equals(charArray1, charArray2);
    }
    
}
