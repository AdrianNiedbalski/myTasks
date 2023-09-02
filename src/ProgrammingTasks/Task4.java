package ProgrammingTasks;

//Napisz mechanizm szyfrujący i deszyfrujący wykorzystujący szyfr cezara (https://pl.wikipedia.org/wiki/Szyfr_Cezara)
//
//Tekst jawny: MĘŻNY BĄDŹ, CHROŃ PUŁK TWÓJ I SZEŚĆ FLAG
//Tekst zaszyfrowany: OHBÓŻ DĆFĄ, EKTRP ŚZŃM YŹSŁ L UAGWĘ INCJ

public class Task4 {
    public static String encrypt(String s) {
        String alphabet = "AĄBCĆDEĘFGHIJKLŁMNŃOÓPRSŚTUWYZŹŻ";
        String shiftedAlphabet = alphabet.substring(3) + alphabet.substring(0, 3);
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            char newChar = ' ';
            if (Character.isLowerCase(currChar)) {
                int index = alphabet.toLowerCase().indexOf(currChar);
                if (index != -1) {
                    newChar = shiftedAlphabet.toLowerCase().charAt(index);
                }
            } else if (Character.isUpperCase(currChar)) {
                int index = alphabet.toUpperCase().indexOf(currChar);
                    if(index != -1) {
                        newChar = shiftedAlphabet.toUpperCase().charAt(index);
                    }
                }
            encrypted.append(newChar);
            }
        return encrypted.toString();
    }
    public static void main(String[] args) {
        String text = "MĘŻNY BĄDŹ, CHROŃ PUŁK TWÓJ I SZEŚĆ FLAG";

        String encryptedText = encrypt(text);
        System.out.println(encryptedText);
    }
}
