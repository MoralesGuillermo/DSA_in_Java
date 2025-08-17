package recursion.lk;

import java.util.Arrays;

public class LessK {
    public static void main(String[] args) {
        int[] array = {5, 10, 24, 1, 2, 7, 9};
        int k = 2;
        System.out.println("Moving all elements from " + Arrays.toString(array) +  " that are less than " + k + " to the start...");
        array = orderLessK(array, k);
        System.out.println("New array: " + Arrays.toString(array));
    }

    public static int[] orderLessK(int[] array, int k){
        return orderLessK(array, 0, 0, k);
    }

    private static int[] orderLessK(int[] array, int swapIndex, int index, int k){
        /*Given an array of integers, make all elements n that k > n appear first than all elements i that i >= k */
        if (index >= array.length){
            return array;
        }
        if (array[index] < k){
            swap(array, index, swapIndex);
            return orderLessK(array, swapIndex + 1, index + 1, k);
        }
        return orderLessK(array, swapIndex, index + 1, k);
    }

    private static void swap(int[] array, int index, int swapIndex){
        /*Swap to elements in an array */
        int temp = array[swapIndex];
        array[swapIndex] = array[index];
        array[index] = temp;
    }
}