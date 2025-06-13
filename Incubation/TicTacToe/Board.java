public class Board {
    char[][] board ;
    int row = 0;
    int col = 0;
    Board(int row , int col)
    {
        this.row = row;
        this.col = col;
        this.board = new char[row][col];
    }
    void initializeBoard()
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                board[i][j] = '-';
            }
        }
    }
    boolean changePosition(int rowDup , int colDup , char ch)
    {
        if(board[rowDup][colDup]=='X' || board[rowDup][colDup]=='O')
        {
            return false;
        }
        else if((rowDup<0 || rowDup>=col)||(colDup<0 && colDup>=col))
        {
            return false;
        }
        board[rowDup][colDup] = ch;
        printBoard();
        return true;
    }
    boolean checkPosition(char ch)
    {
        for(int i=0;i<row;i++)
        {
            if(board[i][0]==ch && board[i][0]==board[i][1] && board[i][0]==board[i][2])
            {
                return true;
            }
        }
        for(int i=0;i<col;i++)
        {
            if(board[i][0]==ch && board[i][0]==board[i][1] && board[i][0]==board[i][2])
            {
                return true;
            }
        }
        if(board[0][0]==ch && board[0][0]==board[1][1] && board[0][0]==board[2][2])
        {
            return true;
        }
        if(board[0][2]==ch && board[0][2]==board[1][1] && board[0][2]==board[2][0])
        {
            return true;
        }
        return false;
    }
    void printBoard()
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(board[i][j]+"  ");
            }
            System.out.println();
        }
    }
}