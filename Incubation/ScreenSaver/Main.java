import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter grid rows: ");
        int rows = in.nextInt();
        System.out.print("Enter grid cols: ");
        int cols = in.nextInt();
        System.out.print("Enter text: ");
        String text = in.next();

        Grid grid = new Grid(rows, cols);
        ScreenSaver screensaver = new ScreenSaver(grid, text);

        while (true) {
            screensaver.move();
            Thread.sleep(1000);
        }
    }
}