// Sean Kim
// Loc Mai
// 4 in a line

public class FourLine // Game board class
{
  int[][] board = new int[8][8]; // 8 x 8 grid used to play the four in a row game

  public static void main(String[] args) // used for testing methods
  {
    FourLine fl = new FourLine();// test instantiate the object to run some of the methods
    fl.setup(); // test setup
    fl.printBoard(); // test printBoard
    // fl.setSquare(1, 1, 2); // test values for horizontal winnner
    // fl.setSquare(1, 2, 2);
    // fl.setSquare(1, 3, 2);
    // fl.setSquare(1, 4, 2); // 4 in a row

    fl.setSquare(1, 1, 2); // test values for vertical winner
    fl.setSquare(2, 1, 2);
    fl.setSquare(3, 1, 2);
    fl.setSquare(4, 1, 2);

    fl.printBoard();
    fl.checkForWinner(2); // check if there's an instance of 4 in a row for player 1
  }

  public int getSquare(int x, int y) // return int value of the selected square
  {
    return board[x][y]; // returns the value of the specified square
  }

  public void setSquare(int x, int y, int turn) // 'turn' variable will contain either 1 or 2 that represents both of the players and specifies who's turn it is
  {
    board[x][y] = turn; // will set the value of a square at (x,y) to the value of turn, either 1 or 2
  }

  public void printBoard() // prints out the contents of the board
  {
    System.out.print("  ");
    for(int a = 0; a < board.length; a++){
      System.out.print(a + 1 + " "); // gets the value of the incrementor a and adds one to label the columns
    }
    System.out.println();
    for(int i = 0; i < board.length; i++)
    {
      if(i == 0) // prints out the Row letters A-H
      {
        System.out.print("A ");
      }
      else if ( i == 1)
      {
        System.out.print("B ");
      }
      else if ( i == 2)
      {
        System.out.print("C ");
      }
      else if ( i == 3)
      {
        System.out.print("D ");
      }
      else if ( i == 4)
      {
        System.out.print("E ");
      }
      else if ( i == 5)
      {
        System.out.print("F ");
      }
      else if ( i == 6)
      {
        System.out.print("G ");
      }
      else if ( i == 7)
      {
        System.out.print("H ");
      }
      for(int j = 0; j < board[i].length; j++) // prints out the actual board
      {
        System.out.print(board[i][j] +  " ");
      }
      System.out.println();
    }
    System.out.println();
  }

  public void setup() // the initial setup of the board
  {
    for(int i = 0; i < board.length; i++)
    {
      for(int j = 0; j < board[i].length; j++)
      {
        board[i][j] = 0; // populates the board with all zeros, which is the neutral state of the game
      }
    }
  }

  public void checkForWinner(int playerTurn)
  {
    int counter = 0; // this counter will be used to count the consecutive instances of either 1 or 2

    // This for-loop will check the horizontal axis' for consecutive 4's
    for(int i = 0; i < 8; i++) // rows
    {
      for(int j = 0; j < 8; j++) // columns
      {
        if(board[j][i] != 0)
        {
          counter++;
          System.out.println("Counter value: " +  counter);
          if(counter == 4)
          {
            System.out.println("Player " + playerTurn + " is the winner!");
            System.exit(0); // quits the program once the winner has been decided
          }
        }
        else if(board[j][i] == 0)
        {
          counter = 0; // reset counter if the value is 0 (neutral square)
          System.out.println("Counter value: " +  counter); // test
        }
      }

    }

    // this for loop will check the vertical axis for a winner
    for(int i = 0; i < 8; i++) // rows
    {
      for(int j = 0; j < 8; j++) // columns'
      {
        if(board[i][j] == playerTurn)
        {
          counter++;
          System.out.println("Counter value: " +  counter); //test
          if(counter == 4)
          {
            System.out.println("Player " + playerTurn + " is the winner!");
            System.exit(0); // quits the program once the winner has been decided
          }
        }
        else if(board[i][j] == 0)
        {
          counter = 0; // reset counter if the value is 0 (neutral square)
          System.out.println("Counter value: " +  counter);
        }
      }
    }

    System.out.println("No winner detected"); // test if there are currently no winners

    // check the diagonals for a winner

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
    for(int i = 0; i < 5; i++) // ceiling is 5 since were checking just the rows for 4 consecutive 1's (so index 4 (5) + 4 consecutive 1's will land us in index 7)
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
