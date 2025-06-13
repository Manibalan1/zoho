import java.util.Scanner;
public class Game {
    Scanner in = new Scanner(System.in);
    String player1 = "X";
    String player2 = "O";
    String currPlayer = player1;
    boolean isOver = false;
    void startGame()
    {
        Board board = new Board(3,3);
        board.initializeBoard();
        while(isOver==false)
        {
            System.out.println("Player "+currPlayer+" Enter the input row , col : ");
            int row = in.nextInt();
            int col = in.nextInt();
            boolean isValid = board.changePosition(row,col,currPlayer.charAt(0));
            if(!isValid)
            {
                System.out.println("Re-Enter the input");
            }
            else
            {
                if(currPlayer.equals(player1))
                {
                    currPlayer = player2;
                }
                else
                {
                    if(isGameOver(board))
                    {
                        isOver = true;
                    }
                    currPlayer = player1;
                }
            }
        }
    }
    boolean isGameOver(Board board)
    {
        if(board.checkPosition(currPlayer.charAt(0)))
        {
            System.out.println("Player "+currPlayer+" Wins");
            return true;
        }
        return false;
    }
}