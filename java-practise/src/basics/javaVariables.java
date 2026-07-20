package basics;

/*
There are 5 different types of storing variables:
String, int, float, char, boolean
*/

public class javaVariables {
    public static void main(String[] args) {
        //Declaring (Creating) Variables
        String name = "Hari";
        System.out.println(name);
    }
}

//Java can overwrite the value of a variable hence final is used to avoid overwrite
final int myNum = 15;
myNum = 20;  // will generate an error: cannot assign a value to a final variable