package basics.method;

public class Task4M {
    public static void main(String[] args) {

        NumberOperations n = new NumberOperations();

        n.add(10);
        n.multiply(2);
        n.subtract(5);
        n.display();
    }
}

public class NumberOperations {
    static int add(int num) {
        return num += num ;
    }

    static int multiply(int num) {
        return add(num) * num;
    }

    static int subtract(int num) {
        return multiply(num) - num;
    }

    static int display() {
        System.out.println("Final Number is:" + " " + subtract(num));
    }
}