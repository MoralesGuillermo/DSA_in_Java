package recursive.uniqueness;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 7, 5, 6, 7};
        boolean isUnique = unique(testArray, 0, testArray.length - 1);
        System.out.println("Checking array: " + Arrays.toString(testArray));
        System.out.println("Array contains unique elements only: " + isUnique);
    }

    public static boolean unique(int[] data, int low, int high){
        // Base case. Single value array
        if (low == high) return true;
        // Check if the element is unique in the array
        for (int i = low + 1; i <= high; i++){
            if (data[low] == data[i]) return false;
        }
        // Check if the subarray is unique
        return unique(data, low + 1, high);
    }
}