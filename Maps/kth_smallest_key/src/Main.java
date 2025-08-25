/*
 * Suppose we are given two sorted search tables S and T, each with n entries (with
 * S and T being implemented with arrays). Describe an O(log n)-time algorithm
 * for finding the kth smallest key in the union of the keys from S and T (assuming
 * no duplicates).
 */

public class Main {
    public static void main(String[] args){
        int[] S = {10, 17, 25, 35, 59};
        int[] T = {7, 15, 26, 30 ,50};
        int k = 7;
        int kSmallest = kSmallest(k, S, T);
        if (kSmallest < 0){
            System.out.println("Please input a k in the proper range");
            return;
        }
        System.out.println("The " + k +  " smallest value from the given lists is: " + kSmallest);

    }

    public static int kSmallest(int k, int[] S, int[] T){
        if (k > S.length + T.length){
            // Invalid k given
            return -1;
        }
        if (k == 1){
            // Asking for the first value
            return Math.min(S[0], T[0]);
        }
        if (k == S.length + T.length){
            // Asking for the last value
            return Math.max(S[S.length - 1], T[T.length - 1]);
        }
        if (k == S.length + T.length - 1){
            // Asking for the penultimate value
            return Math.min(S[S.length - 1], T[T.length - 1]);
        }
        int right  = k;
        int left = 0;
        do{
            int max = ((right + left) / 2);
            int tMax = k - max;
            int sMaxVal = S[max - 1];
            int tMaxVal = T[tMax - 1];
            if (sMaxVal < T[tMax] && tMaxVal < S[max]){
                return Math.max(sMaxVal, tMaxVal);
            }
            if (sMaxVal > tMaxVal){
                right = max - 1;
            }
            else{
                left = max + 1; 
            }
        }while(true);
    }
}
