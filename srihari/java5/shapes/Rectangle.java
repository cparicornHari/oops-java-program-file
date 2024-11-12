package shapes;

import java.util.Scanner;

public class Rectangle implements Shape {
    private double length;
    private double height;

    @Override
    public void printArea() {
        System.out.println("\nRectangle");
        System.out.println("---------\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Length of Rectangle: ");
        this.length = input.nextDouble();
        System.out.println("Enter Height of Rectangle: ");
        this.height = input.nextDouble();
        double area = this.length * this.height;
        System.out.println("Area of the Rectangle is: " + area);
    }
}
