package basics.OOPs;

public class RectangleMain {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        Rectangle r2= new Rectangle();

        r1.rectangleNo = 1;
        r1.length = 10;
        r1.width = 10;

        r2.rectangleNo = 2;
        r2.length = 11.5f;
        r2.width = 11.5f;

        r1.displayDetails();
        r2.displayDetails();
    }
}

class Rectangle {
    int rectangleNo;
    float length;
    float width;

    float calculateArea(){
        return length * width;
    }

    float calculatePerimeter() {
        return 2* (length + width);
    }

    void displayDetails() {
        System.out.println("Rectangle:" + rectangleNo + " " + "Area:" + calculateArea() + " " + "Perimeter:" + calculatePerimeter() );
    }
}
