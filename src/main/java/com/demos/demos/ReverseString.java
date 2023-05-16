package com.demos.demos;

public class ReverseString {

    public static void main(String[] args) {

//        String input = "olleH"; // Hello
//        String input = "avaJ";
//        String input = "esreveR";
        String input = "racecaR";


        String reversed = reverseString("");
        System.out.println(reversed);
    }

    private static String reverseString(String input) {

        if (input == null || input.isEmpty()) {
            return input;
        }

        char[] chars = input.toCharArray();

        int leftIndex = 0;
        int rightIndex = chars.length - 1;

        while (leftIndex < rightIndex) {

            char temp = chars[leftIndex];

            chars[leftIndex] = chars[rightIndex];
            chars[rightIndex] = temp;

            leftIndex++;
            rightIndex--;

        }
        return new String(chars);
    }

}
