package recursion.palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a word to check if it is a palindrome: ");
        String s = scanner.next();
        scanner.close();
        System.out.println("The string: " + s + "is a palindrome: " + isPalindrome(s));
    }


    public static boolean isPalindrome(String s){
        return isPalindrome(s, 0, s.length() - 1);
    }

    private static boolean isPalindrome(String s, int low, int high){
        /*Check if a given string is a palindrome */
        if (low >= high){
            return true;
        }
        if (s.charAt(low) == s.charAt(high)){
            return isPalindrome(s, low + 1, high - 1);
        }
        return false;
    }
}