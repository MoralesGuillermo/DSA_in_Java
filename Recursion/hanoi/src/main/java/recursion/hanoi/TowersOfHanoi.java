package recursion.hanoi;

import java.util.Scanner;

public class TowersOfHanoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solving instances of the Towers of Hanoi problem!");
        System.out.print("Write the amount of disks in the problem: ");
        while (!scanner.hasNextInt()){
            scanner.nextLine();
            System.out.print("Please insert a valid integer: ");
        }
        int n = scanner.nextInt();
        hanoi(n);
        scanner.close();
        
    }

    public static void hanoi(int n){
        hanoi(n, 'A', 'C', 'B');
    }

    private static void hanoi(int n, char start, char destiny, char tempPole){
        /*Solve instances of the Towers of Hanoi */
        if (n == 0){
            return;
        }
        hanoi(n-1, start, tempPole, destiny);
        System.out.println("Moved Disk " + n + " from pole " + start + " to pole " + destiny );
        hanoi(n-1, tempPole, destiny, start);
    }
}