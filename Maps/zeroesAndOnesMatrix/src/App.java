public class App {
    public static void main(String[] args){
        int[][] matrix = 
        {
            {1,1,0,0}, 
            {1,1,0,0}, 
            {1,1,0,0}, 
            {1,1,0,0}
        };
        int oneCount = countOnesInMatrix(matrix);
        System.out.println("The amount of 1s in the matrix is: " + oneCount);
    }

    /**
     * Count the amount of ones that are found in a nxn matrix.
     * This matrix only has 1's and 0's and at each row, all 0s
     * are found after all the ones 
     * @param matrix: Matrix of size nxn containing rows of one and 0s
     * @timeComplexity: O(nlogn)
     * @return: Amount of ones found in the matrix
     */
    public static int countOnesInMatrix(int[][] matrix){
        int oneCount = 0;
        for (int i = 0; i < matrix.length; i++){
            int zeroFrontier = findZeroFrontier(matrix[i]);
            if (zeroFrontier > 0){
                // The position of the first zero equals to the amount of ones in the array
                oneCount += zeroFrontier;
            }
        }
        return oneCount;
    }

    /**
     * Find the position of the first 0 after the last 1
     * @param array: List of 1s and 0s. All 1s come before all 0s
     * @timeComplexity: O(log n) (Binary Search) (O(1) for the best case)
     * @return: Index where the first 0 is found
     */
    private static int findZeroFrontier(int[] array){
        int right = array.length - 1;
        int left = 0;
        if (array[right] == 1){
            // The array is full of ones
            return array.length;
        }
        while (left <= right){
            int mid = ((right + left) / 2);
            if (mid > 0 && array[mid] == 0 && array[mid - 1] == 1){
                // Frontier was found
                return mid;
            }
            if (array[mid] == 1){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        // An array full of 0s was given
        return -1;
    }
}
