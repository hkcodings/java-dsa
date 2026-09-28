package basics;

import java.util.Scanner;

/* Write a program that:

1. Prints numbers from 1 to 20 using for.
2. Prints numbers from 20 to 1 using while.
3. Prints all even numbers from 1 to 50 using do-while. */

public class loops {
    public static void main(String args[]) {
        for(int i=1; i<=20; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        int i = 20;
        while(i>0){
            System.out.print(i + " ");
            i--;
        }

        System.out.println();

        int j = 50;
        do {
            if(j % 2 == 0){
                System.out.print(j + " ");
            }
            j--;
        } while (j > 0);

        System.out.println();


        /* Task 2 — Sum & Counting 🎯

        Take an integer N from the user.

        Print:

        Sum of numbers from 1 to N
        Count of even numbers
        Count of odd numbers
        Sum of even numbers
        Sum of odd numbers */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int N = sc.nextInt();

        int sum = 0;
        for (int a = 1; a<=N; a++){
            sum += a;
        }
        System.out.println("Sum: " + sum);

        int evenCount = 0;
        for (int m=1; m<=N; m++) {
            if (m%2 == 0) {
                evenCount++;
            }
        }
        System.out.print("Even Count: " + evenCount);

        System.out.println();

        int oddCount = 0;
        for (int m=1; m<=N; m++) {
            if (m%2 != 0) {
                oddCount++;
            }
        }
        System.out.print("Odd Count: " + oddCount);
        System.out.println();

        int evenSum = 0;
        for (int m=1; m<=N; m++) {
            if (m%2 == 0) {
                evenSum += m;
            }
        }
        System.out.print("Even Sum: " + evenSum);
        System.out.println();

        int oddSum = 0;
        for (int m=1; m<=N; m++) {
            if (m%2 != 0) {
                oddSum += m;
            }
        }
        System.out.print("odd Sum: " + oddSum);

        // ------------------------------- Break Statements ---------------------------------- //

        Scanner sc1 = new Scanner(System.in);

        int numSum = 0;
        int count3 = 0;

        while(true) {
            System.out.print("Enter a number repeatedly:");
            int number = sc1.nextInt();

            if (number <= 0) {
                break;
            }
            count3++;
            numSum += number;
        }
        System.out.println("Total numbers entered: " + count3);
        System.out.println("Sum: " + numSum);

    }
}
