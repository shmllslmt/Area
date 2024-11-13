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
        // sequential control structure
        // declaration and initialisation of local variable
        int length = 9;
        double width = 100;

        // call the calcArea function to calculate the area of rectangle
        // length and width are passed to the calcArea module as parameters
        area = calcArea(length, width);

        // call the displayResult function to display some user-friendly messages to the user
        // area is passed to the displayResult module as parameter
        displayResult();
    }
}