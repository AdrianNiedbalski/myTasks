package Coursera.cipherProject;

/**
 * Write a description of CaesarCipher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CaesarCipher {
    private String alphabet;
    private String shiftedAlphabet;
    private String alphabetLowerCase;
    private String alphabetLowerCaseShifted;
    int mainKey;

    public CaesarCipher(int key){
        this.mainKey = key;
        alphabet  = "ABCDEFGHIJKPQRSTUVWXYZ";
        alphabetLowerCase = "abcdefghijkpqrstuvwxyz";
        shiftedAlphabet  = alphabet.substring(key) + alphabet.substring(0,key);
        alphabetLowerCaseShifted = alphabetLowerCase.substring(key) + alphabetLowerCase.substring(0,key);
    }
    public String decrypt(String input){
        CaesarCipher cc = new CaesarCipher(26 - mainKey);
        String decrypt = cc.encrypt(input);
        return decrypt;
    }

    public String encrypt(String message){
        StringBuilder encrypted = new StringBuilder(message);
        for(int i=0; i < encrypted.length(); i++){
            char currChar = encrypted.charAt(i);
            char newChar;

            if(Character.isLowerCase(currChar)){
                int index = alphabetLowerCase.toLowerCase().indexOf(currChar);
                if(index != -1){
                    newChar = alphabetLowerCaseShifted.charAt(index);
                    encrypted.setCharAt(i, newChar);
                }
            }
            else if(Character.isUpperCase(currChar)){
                int index = alphabet.indexOf(currChar);
                if(index != -1){
                    newChar = shiftedAlphabet.charAt(index);
                    encrypted.setCharAt(i,newChar);
                }

            }

        }
        return encrypted.toString();
    }


}
