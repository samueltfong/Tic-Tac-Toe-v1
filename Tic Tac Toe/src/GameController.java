import java.util.Scanner;

public class GameController {
    // Variables
    public static int[][] board = new int[3][3];
    public static final int BOARD_SIZE = 3;
    private static boolean gameOver = false;

    // Methods
    public static void startNewGame() {
        // Reset the board
        board = new int[BOARD_SIZE][BOARD_SIZE];

        boolean player1Turn = true;

        Scanner scanner = new Scanner(System.in);

        String markTile = "";
        int markX = 0;
        int markY = 0;

        // Start the game
        while(!gameOver) {
            // Print the game board
            System.out.println("@----------------------- TIC TAC TOE -----------------------@"); // Print top banner
            printMap(); // Print the current board
            // Print the current players turn
            System.out.print("It is currently ");
            if(player1Turn) {
                System.out.print("Player 1s turn. Please enter the coordinate you want to mark\n");
            }
            else {
                System.out.print("Player 2s turn. Please enter the coordinates you want to mark\n");
            }

            // Do player turns
            System.out.println("Please format your input: x,y");
            System.out.println("@-----------------------------------------------------------@");

            // Check player inputs
            // Check for a correct input
            boolean satisfiedInput = false;
            while(!satisfiedInput) {
                // Set the mark tiles
                markTile = scanner.nextLine();
                // Test the mark tile
                if(markTile.matches("[0-2],[0-2]") &&
                        board[Integer.parseInt(markTile.substring(0,1))][Integer.parseInt(markTile.substring(2,3))] == 0) {
                    markX = Integer.parseInt(markTile.substring(0,1));
                    markY = Integer.parseInt(markTile.substring(2,3));
                    satisfiedInput = true;
                }
                else {
                    System.out.println("Your input didn't match! Please try again!");
                }
            }

            // Place the marking
            if(player1Turn) {
                setBoardTile(markX, markY, 1);
                // Player 1s turn is over
                player1Turn = false;
            }
            else {
                setBoardTile(markX, markY, 2);
                // Its now player 1s turn
                player1Turn = true;
            }

            // Check for wins
            // Check for horizontal wins
            for(int y = 0; y < BOARD_SIZE; y++) {
                // If the tile being checked isn't 0
                if(board[0][y] != 0 && board[1][y] == board[0][y] && board[2][y] == board[0][y]) {
                    System.out.println("Found a horizontal win at " + y);
                    gameOver = true;
                }
            }
            // Check for vertical wins
            for(int x = 0; x < BOARD_SIZE; x++) {
                // If the tile being checked isn't 0 and
                if(board[x][0] != 0 && board[x][1] == board[x][0] && board[x][2] == board[x][0]) {
                    System.out.println("Found a vertical win at " + x);
                    gameOver = true;
                }
            }
            // Check for diagonal wins
            if(board[0][0] != 0 && board[1][1] == board[0][0] && board[2][2] == board[0][0]) {
                System.out.println("Found a diagonal win going top left to bottom right");
                gameOver = true;
            }
            if(board[0][2] != 0 && board[1][1] == board[0][2] && board[2][0] == board[0][2]){
                System.out.println("Found a diagonal win going bottom left to top right");
                gameOver = true;
            }
        }
    }

    public static void printMap() {
        // Loop through each tile and print our its value
        for(int y = 0; y < BOARD_SIZE; y++) { // Loop through Y
            // Print Left to right
            System.out.println("                          " + board[0][y] + " | " + board[1][y] + " | " + board[2][y] + " ");

            // Print separator
            if(y != BOARD_SIZE - 1) {
                System.out.println("                         ---+---+---");
            }
        }
    }

    private static boolean validateTile(int x, int y, int[][] map) {
        // Variables
        boolean tileIsClear = false;

        if(map[x][y] == 0) {
            tileIsClear = true;
        }

        return tileIsClear;
    }

    public static void setBoardTile(int x, int y, int value) {
        // Set a boards tile for testing
        board[x][y] = value;
    }
}
