public class Grid {
    private int rows, cols;
    private char[][] grid;
    public Grid(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.grid = new char[rows][cols];
    }
    public void initializeGrid() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = ' ';
            }
        }
    }
    public void writeText(int row, int col, String str) {
        for (int i = 0; i < str.length(); i++) {
            if (col + i < cols) {
                grid[row][col + i] = str.charAt(i);
            }
        }
    }
    public void display() {
        System.out.print("+");
        for (int j = 0; j < cols; j++) {
            System.out.print("-");
        }
        System.out.println("+");

        for (int i = 0; i < rows; i++) {
            System.out.print("|");
            for (int j = 0; j < cols; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println("|");
        }

        System.out.print("+");
        for (int j = 0; j < cols; j++) {
            System.out.print("-");
        }
        System.out.println("+\n");
    }
    public int getRows() {
        return rows;
    }
    public int getCols() {
        return cols;
    }
}