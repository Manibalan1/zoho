public class ScreenSaver {
    private Grid grid;
    private String text;
    int row, col;
    private int dRow = 1, dCol = 1;
    public ScreenSaver(Grid grid, String text) {
        this.grid = grid;
        this.text = text;
        this.row = 0;
        this.col = 0;
    }
    public void move() {
        grid.initializeGrid();
        grid.writeText(row, col, text);
        grid.display();

        row = row + dRow;
        col =  col + dCol;

        if (row < 0 || row >= grid.getRows()) {
            dRow *= -1;
            row += dRow;
        }

        if (col < 0 || col + text.length() > grid.getCols()) {
            dCol *= -1;
            col += dCol;
        }
    }
}