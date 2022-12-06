package tiktaktoe.solution;

import tiktaktoe.utils.Move;

public class Board {

    // TODO
    private char[][] board;
    private char winner;

    // TODO
    public Board() {
        this.board = createEmptyBoard();
        checkBoardDimensions();
    }

    // TODO
    public Board(char[][] board) {
        this.board = board;
        checkBoardDimensions();
    }

    public char[][] getBoard() {
        return this.board;
    }

    public char getWinner() {
        return this.winner;
    }

    // überprüft, ob das Spielfeld die Dimensionen 3x3 besitzt
    private void checkBoardDimensions() {
        int requiredLength = 3;
        if (this.board.length != requiredLength) {
            throw new RuntimeException("Board dimensions are not the expected 3x3!");
        }

        for (char[] row : this.board) {
            if (row.length != requiredLength) {
                throw new RuntimeException("Board dimensions are not the expected 3x3!");
            }
        }
    }

    // Gibt das Spielfeld in der Konsole aus
    public void printBoard() {
        String divider = "---+---+---";
        for (int i = 0; i < this.board.length; i++) {
            String rowOutput = "";
            for (int j = 0; j < this.board[i].length; j++) {
                rowOutput = rowOutput + " " + this.board[i][j] + " ";
                if (j < this.board[i].length - 1) {
                    rowOutput = rowOutput + "|";
                }
            }
            System.out.println(rowOutput);
            if (i < this.board.length - 1) {
                System.out.println(divider);
            }
        }
    }

    // TODO
    private char[][] createEmptyBoard() {
        char[][] board = new char[3][];
        for (int i = 0; i < 3; i++) {
            board[i] = new char[] { ' ', ' ', ' ' };
        }
        return board;
    }

    // TODO
    public boolean isMoveValid(Move move) {
        return this.board[move.getRowIndex()][move.getColumnIndex()] == ' ';
    }

    // TODO
    public void performMove(Move move) {
        // setze das angegebene Feld auf das entsprechende Spielerzeichen
        this.board[move.getRowIndex()][move.getColumnIndex()] = move.getPlayer();
    }

    // TODO
    public boolean isBoardFull() {
        // iteriere über alle Zellen und gib false zurück, wenn noch eine offene Zelle existiert
        for (char[] row : this.board) {
            for (char cell : row) {
                if (cell == ' ') {
                    return false;
                }
            }
        }

        // gib true zurück, wenn alle Zellen belegt sind
        return true;
    }

    // TODO
    public boolean isGameWon() {
        // überprüfe alle Zeilen, Spalten und Diagonalen auf ein gewonnenes Spiel
        return this.checkForWinInRows() || this.checkForWinInColumns() || this.checkForWinInDiagonals();
    }

    //// TODO
    private boolean checkForWinInRows() {
        for (char[] row : this.board) {
            char first = row[0];
            if (first != ' ' & first == row[1] & first == row[2]) {
                this.winner = first;
                return true;
            }
        }
        return false;
    }

    // TODO
    private boolean checkForWinInColumns() {
        for (int i = 0; i < this.board.length; i++) {
            char first = this.board[0][i];
            if (first != ' ' & first == this.board[1][i] & first == this.board[2][i]) {
                this.winner = first;
                return true;
            }
        }
        return false;
    }

    // TODO
    private boolean checkForWinInDiagonals() {
        char center = this.board[1][1];

        if (center != ' ') {
            // überprüfe die Diagonale von oben-links nach unten-rechts
            if (center == this.board[0][0] & center == this.board[2][2]) {
                this.winner = center;
                return true;
            }

            // überprüfe die Diagonale von unten-links nach oben-rechts
            if (center == this.board[2][0] & center == this.board[0][2]) {
                this.winner = center;
                return true;
            }
        }

        return false;
    }

    //private boolean checkForWinInRows() {
    //    return checkForWin(0, 0, 0, 1)
    //            || checkForWin(1, 0, 0, 1)
    //            || checkForWin(2, 0, 0, 1);
    //}
    //
    //private boolean checkForWinInColumns() {
    //    return checkForWin(0, 0, 1, 0)
    //            || checkForWin(0, 1, 1, 0)
    //            || checkForWin(0, 2, 1, 0);
    //}
    //
    //private boolean checkForWinInDiagonals() {
    //    return checkForWin(0, 0, 1, 1)
    //            || checkForWin(0, 2, 1, -1);
    //}
    //
    //private boolean checkForWin(int startRow, int startColumn, int rowIncrement, int columnIncrement) {
    //    char first = this.board[startRow][startColumn];
    //    char second = this.board[startRow + rowIncrement][startColumn + columnIncrement];
    //    char third = this.board[startRow + (2 * rowIncrement)][startColumn + (2 * columnIncrement)];
    //
    //    if (first != ' ' && first == second && second == third) {
    //        this.winner = first;
    //        return true;
    //    } else {
    //        return false;
    //    }
    //}

}
