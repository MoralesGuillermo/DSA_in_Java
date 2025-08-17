/* 
The following code is the implementation of the solution of problem
C-4.45 from the Data Structures and Algorithms in Java Book by Goodrich,
Tamassia and Goldwasser.

The presented algorithm runs in O(n) and has additional storage complexity
of O(1)
*/ 

package com.algorithms;

public class Solution {
    public static int findMissingInteger(int[] setA){
        // A is a set containing n-1 unique integers from range [0, n-1]
        // The purpose of this algorithm is to find the integer that is not part of A
        int setSum = 0;
        // The range's size is n (Which is one more than the array's size)
        int fullSetLength = setA.length + 1;
        int fullSum = (int) (Math.pow(fullSetLength, 2) - fullSetLength) / 2;
        for (int value: setA){
            setSum += value;
        }
        return fullSum - setSum;
    }
}
