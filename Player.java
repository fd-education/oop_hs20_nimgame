import java.util.Scanner;
import java.util.Random;

public class Player {
  private int status = -1; // -1 = playing; 0 = looser; 1 = winner

  public Player() {
  }

  public int chooseLine() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\n> Please enter the line, you want to remove sticks from: ");

    int input = scanner.nextInt();
    return input;
  }

  public int chooseNumOfSticks() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\n> Please enter the number of sticks, you want to remove: ");

    int input = scanner.nextInt();
    return input;
  }

  public int chooseLine(int numberOfLines) {
    Random rnd = new Random();
    int line = rnd.nextInt(numberOfLines);
    System.out.println("Computer chose: " + line);
    return line;
  }

  public int chooseNumOfSticks(int sticksInLine) {
    Random rnd = new Random();
    int numOfSticks = rnd.nextInt(sticksInLine - 1) + 1;
    System.out.println("Computer wants to remove " + numOfSticks);
    return numOfSticks;
  }

  public int isWinner() {
    status = 1;
    return 1;
  }

  public int getStatus() {
    return status;
  }
}
