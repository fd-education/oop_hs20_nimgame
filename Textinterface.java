public class Textinterface {
  public void welcome() {
    System.out.println("============================================================================================"
        + "\n                                            NIM"
        + "\n--------------------------------------------------------------------------------------------"
        + "\n> You challenge me to a nim game? Fine. Here are the rules:"
        + "\n> We'll play on a board with six lines of sticks."
        + "\n> After my explanation, you get to choose a random number of sticks for each line."
        + "\n> To improve your experience, this number must be lower or equal to 20."
        + "\n> The board in the end could look like this (just an example):" + "\n  | | |" + "\n  | | | | |"
        + "\n  | | | | | | |" + "\n  | |" + "\n  | | | |" + "\n  |"
        + "\n> Each round, one of the players has to take a freely chosen number of sticks from one line."
        + "\n> It is not allowed to remove sticks from multiple lines."
        + "\n> The player that has to take the last stick looses the game! \n");
  }

  public void askForStart() {
    System.out.println("\n--------------------------------------------------------------------------------------------"
        + "\n                   Enter 'Start' to start the game, or 'Stop' to finish!"
        + "\n============================================================================================\n");
  }

  public void chooseLine() {
    System.out.println("> Please enter the line you want to remove sticks from: ");
  }

  public void exitText(int exitCondition) {
    switch (exitCondition) {
      case 0:
        System.out.println("> Game stopped. Hope to see you again!");
        break;
      case 1:
        System.out.println("> Congrats, you beat me! Now I'm tired. Bye!");
        break;
      case 2:
        System.out.println("> That was easy. Eager to try again?");
        break;
      case 3:
        System.out.println("> You give up? Good for you!");
      case 4:
        System.out.println("> Invalid input! Game closed.");
    }
  }

  public void setupLines() {
    System.out.println("\n> Okay. Let's start!"
        + "\n> Please enter the number of lines and elements you want to have on the board." + "\n> Number of lines:");
  }

  public void setupElements(int line) {
    System.out.println("\n> Elements for line " + (line + 1) + ":");
  }

  public void confirmBoard() {
    System.out.println("\n> Your board looks like this:");
  }

  public void firstMove(String starter) {
    System.out.println("\n> The cointoss decided that the " + starter + " can start!");
  }

  public void computerMove(int line, int numOfElements) {
    System.out.println("\n> The computer removed " + numOfElements + " elements from line " + (line + 1) + ".");
  }
}