// 4. Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.Scanner;

public class Q4 {
    public static double get(double x)
    {
        return 2 * 3.14 * x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter radius of circle : ");
        double r = sc.nextDouble();

        System.err.println("Circumference of a circle is : "+get(r));
    }
}
