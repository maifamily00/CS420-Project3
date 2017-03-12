// Sean Kim
// Loc Mai

public class FourLine
{
  int[][] board = new int[8][8];

  public static void main(String[] args) // used for testing methods
  {
    FourLine fl = new FourLine();// test instantiate the object to run some of the methods
    fl.setup(); // test setup
    fl.printBoard(); // test printBoard
  }

  public void printBoard() // prints out the contents of the board
  {
    System.out.print("  ");
    for(int a = 0; a < board.length; a++){
      System.out.print(a+1 + " ");
    }
    System.out.println();
    for(int i = 0; i < board.length; i++)
    {
      if(i == 0){
        System.out.print("A ");
      } else if ( i == 1){
        System.out.print("B ");
      } else if ( i == 2) {
        System.out.print("C ");
      } else if ( i == 3) {
        System.out.print("D ");
      } else if ( i == 4) {
        System.out.print("E ");
      } else if ( i == 5) {
        System.out.print("F ");
      } else if ( i == 6) {
        System.out.print("G ");
      } else if ( i == 7) {
        System.out.print("H ");
      }
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

  public int checkForWinner() // checks the state of the board to determine the winner (Probably gonna rewrite this portion -Sean 2:41 AM :P)
  {
    // check the rows for player 1
    for(int i = 0; i < 5; i++)
    {
      for(int j = 0; j < 8; j++)
      {
        if(board[i][j] == 1 && board[i + 1][j] == 1 && board[i + 2][j] == 1 && board[i + 3][j] == 1)
        {
          return 5000; // possibly filler values
        }
      }
    }

    // check the rows for player 2
    for(int i = 0; i < 5; i++) // ceiling is 5 since were checking just the rows for 4 consecutive 1's
    {
      for(int j = 0; j < 8; j++)
      {
        if(board[i][j] == 2 && board[i + 1][j] == 2 && board[i + 2][j] == 2 && board[i + 3][j] == 2)
        {
          return -5000; // possibly filler values
        }
      }
    }

    // check to see if to continue the game
    for(int i = 0; i < 8; i++)
    {
      for(int j = 0; j < 8; j++)
      {
        if(board[i][j] == 0)
        {
          return 0;
        }
      }
    }

    return 0;
  }

}
