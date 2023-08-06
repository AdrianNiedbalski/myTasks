package ProgrammingTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {
        ArrayList<Character> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tresc sms'a: ");
        String tresc = scanner.nextLine();
        boolean space = true;
        System.out.println("Liczba znakow: " + tresc.length());
        String result = tresc.trim();
        int count = 0;
        for(int i = 0; i < result.length(); i++){
            char currChar = result.charAt(i);
            if(Character.isUpperCase(currChar)){
                System.out.print(currChar);
                lista.add(currChar);
                space = false;
            }
            else if(Character.isWhitespace(currChar)){
                space = true;
            }
            else{
                if(space == true){
                    currChar = Character.toUpperCase(currChar);
                    space = false;
                }
                System.out.print(currChar);
                lista.add(currChar);
            }
        }
        System.out.print(lista);
        System.out.println("\n" + "Liczba znakow po kompresji: " + lista.size());
    }
}
