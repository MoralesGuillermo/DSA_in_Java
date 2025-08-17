package com.algorithms;


public class Main {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14};
        int missingInt = Solution.findMissingInteger(array);
        System.out.println("The integer that is not part of set A is: " + missingInt);
        System.out.println("Execution finished");
    }
}