package tiktaktoe.solution;

import tiktaktoe.utils.InputReader;
import tiktaktoe.utils.Move;

public class Game {

    private InputReader inputReader = new InputReader();

    // TODO
    private Board board = new Board();

    // TODO
    // üblicherweise entweder 'X' or 'O'
    private char activePlayer = 'X';

    // TODO
    private boolean gameContinues() {
        /*
         * check if one Player has won
         * check if at least one cell is still open
         */
        return !this.board.isBoardFull() && !this.board.isGameWon();
    }

    // TODO
    private void printEndingMessage() {
        // check if the game was won or was a tie
        if (this.board.isGameWon()) {
            // the winner is the player who made the previous move
            System.out.println("Gratulation " + this.board.getWinner() + " diese Runde geht an dich!");

        } else {
            // the game was ended because the board was full
            System.out.println("Das Spiel endet unentschieden.");
        }
    }

    private void printWelcomeMessage() {
        System.out.println("Tik-Tak-Toe");
        System.out.println("Für die Spielzüge nach der Aufforderung die Koordinaten des Feldes eingeben.");
        System.out.println("Die Koordinaten sind mit einem Komma getrennt im Format '[Zeilenindex],[Spaltenindex]' einzugeben.");
    }

    // TODO
    private void switchPlayer() {
        if (this.activePlayer == 'X') {
            this.activePlayer = 'O';
        } else {
            this.activePlayer = 'X';
        }
    }

    // TODO
    public void startGame() {
        this.printWelcomeMessage();

        while (this.gameContinues()) {
            this.board.printBoard();

            Move move = inputReader.requestMove(this.activePlayer);

            if (this.board.isMoveValid(move)) {
                this.board.performMove(move);
                this.switchPlayer();
            } else {
                System.out.println("Der Spielzug ist nicht erlaubt, das Feld ist bereits belegt.");
                System.out.println("Bitte gib einen anderen Spielzug ein. ");
            }
        }

        this.board.printBoard();
        this.printEndingMessage();
    }

    public static void main(String[] args) {
        //        Game game = new Game(new char[][]{
        //                {' ', 'X', ' '},
        //                {' ', ' ', 'O'},
        //                {' ', 'X', ' '}
        //        });
        Game game = new Game();
        game.startGame();
    }
}
