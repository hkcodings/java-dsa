package basics;

import java.util.Scanner;

public class inputOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println(sum);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double sumDouble = a + b + c;
        System.out.println(sumDouble);
    }
}
