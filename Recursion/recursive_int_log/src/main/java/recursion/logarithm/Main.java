package recursion.logarithm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input value n to calculate its log_2 integer part: ");
        while (!scanner.hasNextLong()){
            scanner.nextLine();
            System.out.print("Invalid integer; Please input an integer value: ");
        }
        long input = scanner.nextLong();
        scanner.close();
        System.out.println("The int log_2 of " + input + " is: " + intLog(input));
        
    }

    public static int intLog(long n){
        // Caluclate the integer part of log_2(n)
        if (n < 2) {
            return 0;
        }
        return 1 + intLog(n/2);
    }
}