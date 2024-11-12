import shape.Rectangle;
import shape.Shape;
import shape.Triangle;
import shape.Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Finding Area");
            System.out.println("************");
            System.out.println(
                "\n1. Rectangle" +
                "\n2. Triangle" +
                "\n3. Circle" +
                "\n4. Exit" +
                "\n\nEnter your choice: "
            );

            choice = userInput.nextInt();
            Shape shape = null;

            switch (choice) {
                case 1:
                    shape = new Rectangle();
                    break;
                case 2:
                    shape = new Triangle();
                    break;
                case 3:
                    shape = new Circle();
                    break;
                case 4:
                    System.out.println("\n\nThank You !!!");
                    userInput.close();
                    return; // Exit the program
                default:
                    System.out.println("Please enter a valid input");
                    continue; // Restart the loop
            }

            shape.printArea(); // Call printArea if shape is not null

        } while (true); // Infinite loop; exit handled inside the switch
    }
}
