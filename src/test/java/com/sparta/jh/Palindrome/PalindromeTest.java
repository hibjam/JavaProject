package com.sparta.jh.Palindrome;

import com.sparta.jh.Palindrome.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class PalindromeTest {
    String sentence = "The madam drove the incredibly speedy racecar to her kayak which had a radar";

    @Test
    @DisplayName("Does this retrieve longest Word")
    void getLongestWord() {
        ArrayList<String> word = new ArrayList<String>();
        word.add("racecar");
        Assertions.assertEquals(word, Palindrome.getLongestPalindromeFromSentence(sentence));
    }

    @Test
    @DisplayName("Does this retrieve longest Palindrome")
    void getLongestPalindrome() {
        ArrayList<String> word = new ArrayList<String>();
        word.add("racecar");
        Assertions.assertEquals(word, Palindrome.getLongestPalindromeFromSentence(sentence));
    }
    @Test
    @DisplayName("Check returns multiple words of same length")
    void getMultipleWordsOfSameLength(){
        String sentence = "The madam went to shop to buy a kayak and a radar";
        ArrayList<String> wordsInList = new ArrayList<String>();
        wordsInList.add("madam");
        wordsInList.add("kayak");
        wordsInList.add("radar");
        Assertions.assertArrayEquals(wordsInList.toArray(), Palindrome.getLongestPalindromeFromSentence(sentence).toArray());
    }
    @Test
    @DisplayName("Check words must be 3 or more characters - should expect nothing")
    void checkIsThreeCharacters() {
        String sentence = "Hello my name is aa";
        ArrayList<String> empty = new ArrayList<>();
        Assertions.assertArrayEquals(empty.toArray(), Palindrome.getLongestPalindromeFromSentence(sentence).toArray());
    }
    @Test
    @DisplayName("Check that case does not matter")
    void checkCaseDoesNotMatter() {
        ArrayList<String> word = new ArrayList<String>();
        word.add("RaCeCar");
        String sentence = "The madam drove the incredibly speedy RaCeCar to her kayak which had a radar";
        Assertions.assertEquals(word, Palindrome.getLongestPalindromeFromSentence(sentence));
    }
    @Test
    @DisplayName("Check Punctuation at the end/start of a word does not matter")
    void checkPunctuation(){
        ArrayList<String> word = new ArrayList<String>();
        word.add("RaCeCar");
        String sentence = "The madam drove the incredibly speedy .RaCeCar. to her kayak which had a radar";
        Assertions.assertEquals(word, Palindrome.getLongestPalindromeFromSentence(sentence));
    }
}