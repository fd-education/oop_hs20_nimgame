import java.util.Scanner;

public class Parser {
  public Parser() {
  }

  public int checkStart(String startOrStop) {
    if (startOrStop.equals("start")) {
      return 0;
    } else if (startOrStop.equals("stop")) {
      return 1;
    } else {
      return 4;
    }
  }

  public int getInputInteger() {
    Scanner scanner = new Scanner(System.in);

    int input = scanner.nextInt();
    return input;
  }

  public String getInputString() {
    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine().strip().toLowerCase();
    return input;
  }
}
