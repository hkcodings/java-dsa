package basics.OOPs;

public class CarMain {
    public static void main(String[] args) {
        Car c = new Car();

        c.brand = "Honda";
        c.model = "HO26ZX";
        c.year = 2026;
        c.speed = 30;

        c.accelerate();
        c.accelerate();
        c.accelerate();

        c.brake();

        c.displaySpeed();
    }
}

class Car{
    String brand;
    String model;
    int year;
    float speed;

    void accelerate() {
        speed = speed + 10;
    }

    void brake() {
        if (speed < 10) {
            System.err.println("Use speed greater than 10");
        } else {
            speed = speed - 10;
        }
    }

    void displaySpeed() {
        System.out.println("Final Speed: " + speed);
    }
}