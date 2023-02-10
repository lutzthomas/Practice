package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Jan16 {
    public static void main(String[] args) {
        capitalize("abcdef");
//        multipleOfIndex(new int[]{22, -6, 32, 82, 9, 25});
    }

    public static String[] capitalize(String s){
        String[] arr = s.split("");
        String[] evenArr = new String[arr.length];
        String[] oddArr = new String[arr.length];

        evenArr[0] = arr[0].toUpperCase();
        oddArr[0] = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(i % 2 == 0){
                evenArr[i] = arr[i].toUpperCase();
            } else {
                evenArr[i] = arr[i];
            }
        }

        for(int i = 1; i < arr.length; i++){
            if (i % 2 != 0){
                oddArr[i] = arr[i].toUpperCase();
            } else {
                oddArr[i] = arr[i];
            }
        }

        String evenAnswer = "";
        String oddAnswer = "";

        for(String letter: evenArr){
            evenAnswer = evenAnswer + letter;
        }

        for(String letter: oddArr){
            oddAnswer = oddAnswer + letter;
        }


        String[] answerArr = new String[2];
        answerArr[0] = evenAnswer;
        answerArr[1] = oddAnswer;
        System.out.println(answerArr);

        return answerArr;
    }

//    public static int[] multipleOfIndex(int[] array) {
//        List<Integer> answer = new ArrayList<>();
//        for(int i = 1 ; i < array.length ; i++){
//            if(array[i] % i == 0){
//                answer.add(array[i]);
//            }
//        }
//
//        int[] answerArr = new int[answer.size()];
//
//        for(int i = 0; i < answer.size() ; i++){
//            answerArr[i] = answer.get(i);
//        }
//
//        return answerArr;
//    }
//
//    public static void fizzBuzz(int n) {
//        if(n % 3 == 0 && (n & 5) == 0){
//            System.out.println("FizzBuzz");
//        } else if( )
//
//    }

}
