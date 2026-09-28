package basics.method;

public class Task3M {
    public static void main(String[] args) {
        Calculator1 calculator = new Calculator1();

        calculator.add(10, 20);
        calculator.add(10, 20, 30);
        calculator.add(10.5, 20.5);
        calculator.add(10, 20.5);
    }
}
public class Calculator1 {
    static void add(int a, int b){
        System.out.println("Sum is" + " " + (a+b));
    }

    static void add(int a, int b, int c){
        System.out.println("Sum is" + " " + (a+b+c));
    }

    static void add(double a, double b){
        System.out.println("Sum is" + " " + (a+b));
    }

    static void add(int a, double b){
        System.out.println("Sum is" + " " + (a+b));
    }
}