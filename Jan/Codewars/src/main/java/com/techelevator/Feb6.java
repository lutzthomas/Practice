package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Feb6 {

    public String toJadenCase(String phrase) {

        String answer = "";

        if(phrase.equals("") || phrase == null){
            return null;
        }

        String[] arr = phrase.split(" ");
        for(String word: arr){
            String start = word.substring(0,1).toUpperCase();
            String end = word.substring(1);
            answer += start + end + " ";
        }

        return answer.substring(0, answer.length()-1);
    }

    public static String high(String s) {

        String[] arr = s.split(" ");
        String answer = "";
        int highScore = 0;

        for(String word: arr){
            int score = 0;
            char[] letterArr = word.toCharArray();
            for(char letter: letterArr){
                score += letter - 96;
            }

            if(score > highScore){
                highScore = score;
                answer = word;
            }

        }
        return answer;
    }

    public static String solve(final String str) {

        char[] arr = str.toCharArray();
        int lower = 0;
        int upper = 0;
        String answer = "";

        for(char letter : arr){
            if(Character.isUpperCase(letter)){
                upper++;
            }else{
                lower++;
            }

            if(upper>lower){
                answer = str.toUpperCase();
            } else{
                answer = answer.toLowerCase();
            }
        }

        return answer; //your code here
    }

    public static List<Object> filterList(final List<Object> list) {

        List<Object> answer = new ArrayList<>();

        for(Object thing: list){
            if(!thing.getClass().equals(String.class)){
                answer.add(thing);
            }
        }

        return answer;
    }
}
