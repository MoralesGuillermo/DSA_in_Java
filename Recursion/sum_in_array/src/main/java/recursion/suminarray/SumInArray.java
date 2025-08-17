package recursion.suminarray;

import java.util.Arrays;

public class SumInArray {
    public static void main(String[] args) {
        int[] data = {1, 7, 10, 11, 13};
        int k = 11;
        System.out.println("Searching for a pair that adds to  " + k + " in the array " + Arrays.toString(data));
        int[] response = sumInArray(data, k);
        if (response.length == 0){
            System.out.println("No pair that adds to " + k + " was found.");
        }else{
            System.out.println("The pair {" + response[0] + ", " + response[1] + "} adds to " + k);
        }

    }

    public static int[] sumInArray(int[] data, int k){
        return sumInArray(data,0 , 1, k, k - data[0]);
    }

    private static int[] sumInArray(int[] data, int index, int jIndex, int k, int search){
        /* Check if two numbers that sum k exists in the array data*/
        // Base Cases
        if (index >= data.length - 1 || data[index] > k ){
            return new int[0];
        }
        if (jIndex < data.length && data[jIndex] == search){
            return new int[] {data[index], data[jIndex]};
        }
        // Recursive steps
        if (jIndex >= data.length || data[jIndex] > search){
            // Iterate to check the next value
            return sumInArray(data, index + 1, index + 2, k, k - data[index + 1]);
        }
        // Iterate over the array checking the next jIndex
        return sumInArray(data, index, jIndex + 1, k, search);
    }
}