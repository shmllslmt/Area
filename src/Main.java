import java.util.Scanner;

public class Main {
    static double area = 0;

    // calcArea module
    public static double calcArea(double l, double w) {
        double a = 0;
        a = l * w;
        return a;
    }

    // displayResult module
    public static void displayResult() {
        // displaying output
        System.out.println("The area of rectangle is "+area);
        // selection control structure
        if(area > 100) {
            System.out.println("This rectangle is big.");
        }
    }

    // main module
    // execution starts from this module
    public static void main(String[] args) {
        // Scanner object declaration
        Scanner keyboard = new Scanner(System.in);

        // sequential control structure
        // declaration and initialisation of local variable
        int length = 0;
        double width = 0;
        String name;

        // prompt user for String value
        System.out.print("What's your name? ");
        name = keyboard.nextLine();
        // displaying user input
        System.out.println("Hello "+name);

        // prompt user for int value
        System.out.print("Enter length: ");
        length = keyboard.nextInt();

        // prompt user for double value
        System.out.print("Enter width: ");
        width = keyboard.nextDouble();

        // call the calcArea function to calculate the area of rectangle
        // length and width are passed to the calcArea module as parameters
        area = calcArea(length, width);

        // call the displayResult function to display some user-friendly messages to the user
        // area is passed to the displayResult module as parameter
        displayResult();
    }
}
