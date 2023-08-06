package Coursera.cipherProject;

public class VigenereCipher {
    CaesarCipher[] ciphers;
    private int[] key;

    public VigenereCipher(int[] key){
        this.key = key;
        ciphers = new CaesarCipher[key.length];
        for(int i=0; i < key.length; i++){
            ciphers[i] = new CaesarCipher(key[i]);
        }
    }

    public String encrypt(String input){
        StringBuilder encrypted = new StringBuilder();
        int index = 0;
        for(int i=0; i < encrypted.length(); i++){
            char currChar = encrypted.charAt(i);
            if(Character.isLetter(currChar)){
                char newChar = ciphers[index].encrypt(Character.toString(currChar)).charAt(0);
                encrypted.setCharAt(i, newChar);
                index = (index + 1) % ciphers.length;
            }
        }
        return encrypted.toString();
    }

    public String decrypt(String input) {
        StringBuilder decrypted = new StringBuilder(input);
        int index = 0;
        for (int i = 0; i < decrypted.length(); i++) {
            char currChar = decrypted.charAt(i);
            if (Character.isLetter(currChar)) {
                char newChar = ciphers[index].decrypt(Character.toString(currChar)).charAt(0);
                decrypted.setCharAt(i, newChar);
                index = (index + 1) % ciphers.length;
            }
        }
        return decrypted.toString();
    }

    public String toString(){
        StringBuilder keyString = new StringBuilder();
        for(int k : key){
            keyString.append(k).append(" ");
        }
        return keyString.toString().trim();
    }

}
