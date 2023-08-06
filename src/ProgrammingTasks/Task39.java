package ProgrammingTasks;

import java.util.Scanner;

public class Task39 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj schemat: ");
        String input = scanner.nextLine();

        char result = checkWin(input);
        if (result == 'X') {
            System.out.println("Wygrał gracz X!");
        } else if (result == 'O') {
            System.out.println("Wygrał gracz O!");
        } else if (result == 'R') {
            System.out.println("Remis!");
        } else {
            System.out.println("Brak wyniku.");
        }

    }

    public static char checkWin(String board){
        for(int i = 0; i < 9; i += 3){
            if(board.charAt(i) != '_' && board.charAt(i) == board.charAt(i+3) && board.charAt(i) == board.charAt(i+6)){
                return board.charAt(i);
            }
        }

        for(int i = 0; i < 3; i++){
            if(board.charAt(i) != '_' && board.charAt(0) == board.charAt(4) && board.charAt(0) == board.charAt(8)){
                return board.charAt(0);
            }
        }

        if(board.charAt(2) != '_' && board.charAt(2) == board.charAt(4) && board.charAt(2) == board.charAt(6)){
            return board.charAt(2);
        }
        if(!board.contains("_")) {
            return 'R';
        }
        return 'R';
    }
}
