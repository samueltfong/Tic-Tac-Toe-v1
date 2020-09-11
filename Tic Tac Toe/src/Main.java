import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables
        Scanner scanner = new Scanner(System.in);

        boolean inputSatisfied = false;

        // Game
        ConsoleOutput.printWelcomeMessage();
        while (!inputSatisfied) {
            switch (scanner.nextLine().toLowerCase()) {
                case "play":
                    GameController.startNewGame();
                    inputSatisfied = true;
                    break;
                case "exit":
                    System.exit(0);
                    inputSatisfied = true;
                    break;
                default:
                    System.out.println("INCORRECT INPUT PLEASE TRY AGAIN");
                    ConsoleOutput.printWelcomeMessage();
                    break;
            }
        }
    }
}
