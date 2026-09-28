package basics.method;

public class Task1M {
    public static void main (String[] args) {
        Calculator c = new Calculator();

        int a = 10;
        int b = 5;

        System.out.println("Addition: " + c.add(a,b));
        System.out.println("Subtraction: " + c.subtract(a,b));
        System.out.println("Multiplication: " + c.multiply(a,b));
        System.out.println("Division: " + c.divide(a,b));

    }

}

public class Calculator {
    static int add(int a, int b) {
        return (a + b);
    }

    static int subtract (int a, int b) {
        return (a - b);
    }

    static int multiply(int a, int b){
        return (a * b);
    }

    static int divide(int a, int b) {
        return (a / b);
    }
}