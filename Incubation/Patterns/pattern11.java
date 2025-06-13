public class pattern11 {
    public static void main(String[] args) {
        int n = 4;
        int current,previous = 0;

        for (int row = 1; row <= n; row++) {
            current = previous + (row % 2 == 1 ? 1 : 2 * row - 2);
            previous = current;
            System.out.print(current + " ");

            for (int col = 2; col <= n; col++) {
                if ((row % 2 == 1 && col % 2 == 1) || (row % 2 == 0 && col % 2 == 0)) {
                    current += Math.min(col, n - row + 1);
                    current += Math.min(col - 1, n - row + 1);
                    --current;
                    System.out.print(current + " ");
                }
                else {
                    current += Math.min(row, n - col + 1);
                    current += Math.min(row, n - (col - 1) + 1);
                    --current;
                    System.out.print(current + " ");
                }
            }
            System.out.println();
        }
    }
}