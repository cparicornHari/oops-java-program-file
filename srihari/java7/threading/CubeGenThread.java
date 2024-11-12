package threading;

public class CubeGenThread extends Thread {
    int number;
    int cube;  // Corrected variable name

    public CubeGenThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("CubeGenThread interrupted.");
        }
        this.cube = this.number * this.number * this.number;  // Corrected variable name
        System.out.println("CubeGenThread --> Cube of " + number + " is " + cube);
    }
}
