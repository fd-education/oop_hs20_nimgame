import java.util.ArrayList;

public class Board {
  private int[] board;

  public Board(int numOfLines, int[] helperBoard) {
    this.board = new int[numOfLines];

    for (int i = 0; i < helperBoard.length; i++) {
      this.board[i] = helperBoard[i];
    }
  }

  public void removeSticks(int line, int numberOfSticks) {
    if (enoughSticks(line, numberOfSticks)) {
      board[line] -= numberOfSticks;
    } else {
      System.out.println("There are not enough sticks in this line. Please choose less sticks or another line.");
    }
  }

  private boolean enoughSticks(int line, int numberOfSticks) {
    if (board[line] >= numberOfSticks) {
      return true;
    } else {
      return false;
    }
  }

  public void boardToConsole(int[] board) {
    for (int i = 0; i < board.length; i++) {
      ArrayList<String> row = new ArrayList<>();

      for (int j = 0; j < board[i]; j++) {
        row.add("|"); // row: [|, |, |, |, |, |]
      }

      String cleanRow = row.toString().replace("[", "").replace("]", "").replace(",", ""); // row: ||||||
      System.out.println("     Row " + (i + 1) + ":  " + cleanRow);
    }
  }

  public int getSticksTotal() {
    int sum = 0;

    for (int i = 0; i < board.length; i++) {
      sum += board[i];
    }

    return sum;
  }

  public int getNumOfLines() {
    return board.length;
  }

  public int getSticksPerRow(int line) {
    return board[line];
  }

  public int[] getBoard() {
    return board;
  }

}
