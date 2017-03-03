// Sean Kim
// Loc Mai

public class FourLine
{
  int[][] board = new int[8][8];

  public static void main(String[] args) // used for testing methods
  {
    System.out.println("Hello World");
    FourLine fl = new FourLine();
    fl.setup(); // test setup
    fl.printBoard(); // test printBoard
  }

  public void printBoard() // prints out the contents of the board
  {
    for(int i = 0; i < board.length; i++)
    {
      for(int j = 0; j < board[i].length; j++)
      {
        System.out.print(board[i][j] +  " ");
      }
      System.out.println();
    }
  }

  public void setup() // the initial setup of the board
  {
    for(int i = 0; i < board.length; i++)
    {
      for(int j = 0; j < board[i].length; j++)
      {
        board[i][j] = 0;
      }
    }
  }

  public void checkForWinner()
  {

  }

}
