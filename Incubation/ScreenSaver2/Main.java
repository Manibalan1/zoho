import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter grid rows: ");
        int rows = in.nextInt();
        System.out.print("Enter grid cols: ");
        int cols = in.nextInt();
        System.out.print("Enter first text: ");
        String text1 = in.next();
        System.out.print("Enter second text: ");
        String text2 = in.next();

        Grid grid = new Grid(rows, cols);
        ScreenSaver s1 = new ScreenSaver(grid, text1);
        ScreenSaver s2 = new ScreenSaver(grid, text2);

        s2.row = rows - 1;
        s2.col = cols - text2.length();

        while (true) {
            grid.initializeGrid();

            if (s1.getRow() == s2.getRow()) {
                int s1Start = s1.getCol();
                int s1End = s1Start + s1.getText().length() - 1;
                int s2Start = s2.getCol();
                int s2End = s2Start + s2.getText().length() - 1;

                if (!(s1End < s2Start || s2End < s1Start)) {
                    s1.reverseDirection();
                    s2.reverseDirection();
                }
            }
            s1.move();
            s2.move();
            grid.writeText(s1.getRow(), s1.getCol(), s1.getText());
            grid.writeText(s2.getRow(), s2.getCol(), s2.getText());
            grid.display();

            Thread.sleep(500);
        }
    }
}
