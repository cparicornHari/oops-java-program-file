package threading;

public class SquareGenThread extends Thread {
    int number;
    int square;  // Corrected variable name

    public SquareGenThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("SquareGenThread interrupted.");
        }
        this.square = this.number * this.number;  // Corrected variable name
        System.out.println("SquareGenThread --> Square of " + number + " is " + square);
    }
}

