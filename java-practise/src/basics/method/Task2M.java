package basics.method;

public class Task2M {
    public static void main (String[] args) {
        Student s = new Student();

        int marks = 90;

        s.displayName();
        s.setMarks(marks);
        System.out.println(s.getMarks());
        System.out.println(s.calculateGrade(marks));


    }
}

public class Student {
    static void displayName() {
        System.out.println("Harish Kumar");
    }

    static void setMarks(int marks) {
        System.out.println("Marks is: " + marks);
    }

    static int getMarks() {
        return 10;
    }

    static int calculateGrade(int marks) {
        return marks;
    }
}
