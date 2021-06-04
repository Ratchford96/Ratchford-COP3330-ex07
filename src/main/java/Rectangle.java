import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args)
    {
        // creates our int variables
        int area;
        int length;
        int width;
        double m;
        double f2 = 0.009290304;

        Scanner scanner = new Scanner(System.in);
        // Declares variable for what is length
        System.out.print("What is the length of the room in feet?");
        length = scanner.nextInt();

        // Declares variable for what is width
        System.out.print("What is the width of the room in feet?");
        width = scanner.nextInt();

        System.out.println("You entered dimensions of " + length + " by " + width + " feet.");

        // creates the formulas to do our math
        area = length * width;
        System.out.println("The area is\n" + area + " square feet");

        m = area * f2;
        System.out.println(m + " square meters");




    }
}
