package ProgrammingTasks;

import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj schemat: ");
        String input = scanner.nextLine();
        drawBoard(input);

    }

    public static void drawBoard(String board) {
        char[][] tablica = new char[3][3];

        for (int i = 0; i <= 2; i++) {
            if (i == 0) {
                for (int j = 0; j <= 2; j++) {
                    tablica[i][j] = board.charAt(j);
                    System.out.print(tablica[i][j]);
                }
            }

            if (i == 1) {
                for (int j = 0; j <= 2; j++) {
                    tablica[i][j] = board.charAt(j + 3);
                    System.out.print(tablica[i][j]);
                }
            }

            if (i == 2) {
                for (int j = 0; j <= 2; j++) {
                    tablica[i][j] = board.charAt(j + 6);
                    System.out.print(tablica[i][j]);
                }
            }
            System.out.println();
        }
        char winner = checkWinner(tablica);

        if (winner == 'X' || winner == 'x') {
            System.out.println("Wygrał gracz X!");
        } else if (winner == 'O' || winner == '0' || winner == 'o') {
            System.out.println("Wygrał gracz O!");
        } else if (winner == 'R') {
            System.out.println("Remis!");
        } else {
            System.out.println("Brak wyniku.");
        }
    }
    public static char checkWinner(char[][] board){

        for(int row=0; row < board.length; row++){
            if(board[row][0] != '_' && board[row][0] == board[row][1] && board[row][0] == board[row][2]){
                return board[row][0];
            }
        }
        for(int col = 0; col < board[0].length; col++){
            if(board[0][col] != '_' && board[0][col] == board[1][col] && board[0][col] == board[2][col]){
                return board[0][col];
            }
        }

        if(board[0][0] != '_' && board[0][0] == board[1][1] && board[0][0] == board[2][2]){
            return board[0][0];
        }
        if (board[0][2] != '_' && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return board[0][2];
        }
        return ' ';
    }
}
