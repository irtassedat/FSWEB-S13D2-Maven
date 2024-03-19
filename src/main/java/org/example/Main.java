package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221)); // true dönmeli
        System.out.println(isPalindrome(707));   // true dönmeli
        System.out.println(isPalindrome(11212)); // false dönmeli
        System.out.println(numberToWords(123));   // "One Two Three" dönmeli
        System.out.println(numberToWords(1010));  // "One Zero One Zero" dönmeli
        System.out.println(numberToWords(-12));   // "Invalid Value" dönmeli
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return true;
        }
        int reversed = 0;
        int original = number;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }
        if (number == 0) {
            return "Zero";
        }

        String[] numberWords = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String result = "";

        String numberStr = Integer.toString(number);
        for (int i = 0; i < numberStr.length(); i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            result = result + numberWords[digit];
            if (i < numberStr.length() - 1) {
                result += " ";
            }
        }

        return result;
    }
}