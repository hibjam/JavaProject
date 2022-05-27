package com.sparta.jh.Palindrome;

import java.awt.*;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {
        String wordToCheck = "racecar";
        String sentence = "\"ALULA ANANA CIVIC DEKED DELED DERED DEWED KAIAK KAYAK LEMEL LEVEL MADAM MALAM MINIM RADAR REFER ROTOR SAGAS SAMAS \" +\n" +
                "        \"SEDES SELES SEMES SERES SEXES SHAHS SIMIS SIRIS SOLOS STATS STETS STOTS SULUS SUSUS TENET TOROT ARAARA ATAATA kayak deified rotator \" +\n" +
                "        \"repaper deed peep wow noon civic racecar level mom bird rib taco cat UFO tofu Borrow or rob? Never odd or even. We panic in a pew. \" +\n" +
                "        \"Won’t lovers revolt now? Ma is a nun, as I am. Don’t nod. Sir, I demand, I am a maid named Iris. Was it a car or a cat I saw? Yo, \" +\n" +
                "        \"Banana Boy! Eva, can I see bees in a cave? Madam, in Eden, I’m Adam. A man, a plan, a canal, Panama! Never a foot too far, even. \" +\n" +
                "        \"Red roses run no risk, sir, on Nurse’s order. He lived as a devil, eh? Ned, I am a maiden. Now, sir, a war is won! Evade me, Dave! \" +\n" +
                "        \"Dennis and Edna sinned. Step on no pets!\"";

        System.out.println(getLongestPalindromeFromSentence(sentence));

    }
    //Working off the getLongestWord method, all this does is check to see the longest word found
    // is the same legnth as any other palindromes, if it is it will add it to an ArrayList
    public static ArrayList<String> getLongestPalindromeFromSentence(String sentence) {
        String[] splitSentence = splitSentence(sentence);
        ArrayList<String> longestPalendrome = new ArrayList<String>();
        for (String singleWords : splitSentence) {
            if (singleWords.length() == getLongestWord(sentence).length()
                    && isPalindrome(singleWords)) {
                longestPalendrome.add(singleWords);
            }
        }
        return longestPalendrome;
    }
    // loops through the list of words and picks out the longest palindrome
    private static String getLongestWord(String sentence) {
        String[] splitToSingleWords = splitSentence(sentence);
        int currentMaximumWordLength = 0;
        String longestWord = "";
        for (String singleWord : splitToSingleWords) {
            if (singleWord.length() >= 3) {
                if (singleWord.length() > currentMaximumWordLength
                        && isPalindrome(singleWord)) {
                    currentMaximumWordLength = singleWord.length();
                    longestWord = singleWord;
                }
            }
        }
        return longestWord;
    }
    // Splits the sentence into separate words
    private static String[] splitSentence(String sentenceToCheck) {
        String[] splitStringToSingleWords = sentenceToCheck.replaceAll("\\p{Punct}","").split(" ");
        return splitStringToSingleWords;
    }
    // reverses the word
    private static String reverse(String wordToCheck) {
        String reverseString = "";
        String lowerCaseWordToCheck = wordToCheck.toLowerCase();
        for (int i = wordToCheck.length() - 1; i >= 0; i--) {
            reverseString += wordToCheck.charAt(i);
        }
        return reverseString.toLowerCase();
    }
    // checks if a word is a palindrome
    private static boolean isPalindrome(String wordToCheck) {
        String reverseString = "";
        String lowerCaseWordToCheck = wordToCheck.toLowerCase();
        reverseString = reverse(lowerCaseWordToCheck);
        return reverseString.equals(lowerCaseWordToCheck);
    }
}

