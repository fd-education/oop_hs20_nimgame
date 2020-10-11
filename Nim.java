import java.util.Random;

public class Nim {
  public static void main(String[] args) {
    Textinterface textinterface = new Textinterface();
    Parser parser = new Parser();
    Board board;
    Player player;
    Player computer;

    textinterface.welcome();
    textinterface.askForStart();

    if (parser.checkStart(parser.getInputString()) == 0) {
      textinterface.setupLines();
      int numberOfLines = parser.getInputInteger();
      int[] helperBoard = new int[numberOfLines];

      for (int i = 0; i < numberOfLines; i++) {
        textinterface.setupElements(i);
        int elementsPerLine = parser.getInputInteger();
        helperBoard[i] = elementsPerLine;
      }

      player = new Player();
      computer = new Player();
      board = new Board(numberOfLines, helperBoard);

      textinterface.confirmBoard();
      board.boardToConsole(board.getBoard());

      play(player, computer, board, textinterface);

      if (player.isWinner() == 1) {
        textinterface.exitText(1);
      } else {
        textinterface.exitText(2);
      }

    } else {
      textinterface.exitText(parser.checkStart(parser.getInputString()));
    }
  }

  private static int play(Player player, Player computer, Board board, Textinterface textinterface) {
    int winner = -1;
    boolean playerStarts = cointoss();
    String starter = cointoss() ? "player" : "computer";
    textinterface.firstMove(starter);

    while (winner == -1) {
      if (playerStarts) {
        int line = player.chooseLine() - 1;
        int numOfSticks = player.chooseNumOfSticks();
        board.removeSticks(line, numOfSticks);
        winner = board.getSticksTotal() == 0 ? computer.isWinner() : -1;
        playerStarts = false;
      } else {
        int line = computer.chooseLine(board.getNumOfLines());
        int numOfSticks = computer.chooseNumOfSticks(board.getSticksPerRow(line));
        board.removeSticks(line, numOfSticks);
        textinterface.computerMove(line, numOfSticks);
        textinterface.confirmBoard();
        board.boardToConsole(board.getBoard());
        winner = board.getSticksTotal() == 0 ? player.isWinner() : -1;
        playerStarts = true;
      }
    }
    return winner;
  }

  private static boolean cointoss() {
    Random rnd = new Random();
    int toss = rnd.nextInt(100) % 2;
    boolean cointoss;

    if (toss == 0) {
      cointoss = true;
    } else {
      cointoss = false;
    }

    return cointoss;
  }

}
