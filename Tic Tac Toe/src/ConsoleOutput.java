public class ConsoleOutput {
    // Variables

    // Methods
    public static void updateGameBoard() {
        System.out.println("@----------------------- TIC TAC TOE -----------------------@");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("@-----------------------------------------------------------@");

    }

    public static void printMessage(String ln1, String ln2, String ln3, String ln4, String ln5) {
        System.out.println("@----------------------- TIC TAC TOE -----------------------@");
        System.out.println("");
        System.out.println(ln1);
        System.out.println(ln2);
        System.out.println(ln3);
        System.out.println(ln4);
        System.out.println("");
        System.out.println(ln5);
        System.out.println("");
        System.out.println("@-----------------------------------------------------------@");
    }

    // Preset Messages
    public static void printWelcomeMessage() {
        System.out.println("@----------------------- TIC TAC TOE -----------------------@");
        System.out.println("Programmed By: Samuel Fong");
        System.out.println("");
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("");
        System.out.println("To start the game, enter \"play\"!");
        System.out.println("");
        System.out.println("To exit the game, enter \"exit\"!");
        System.out.println("");
        System.out.println("@-----------------------------------------------------------@");
    }
}
