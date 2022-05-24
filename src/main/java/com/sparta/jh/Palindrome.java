package com.sparta.jh;

public class Palindrome {
    public static void main(String[] args) {
        String wordToCheck = "racecar";
        System.out.println(isPalindrome(wordToCheck));
    }

    public static boolean isPalindrome(String wordToCheck) {
        String reverseString = "";
        String lowerCaseWordToCheck = wordToCheck.toLowerCase();
        reverseString = reverse(lowerCaseWordToCheck);
        return reverseString.equals(lowerCaseWordToCheck);
        }

    public static String reverse(String wordToCheck){
        String reverseString = "";
        for (int i = wordToCheck.length() - 1; i >= 0; i--) {
            reverseString += wordToCheck.charAt(i);}
        return reverseString;
    }
}

