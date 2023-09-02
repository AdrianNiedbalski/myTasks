package ProgrammingTasks;
public class Task40 {
    //W podanym ciągu znaków znajdź najdłuższy podciąg składający się z jednego znaku:
    //AABCDDBBBEA -> “B:3” <br>
    public static int longestSubstring(String s) {
        int numbChar = 1;
        int maxChar = 1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); i++) {
                if (s.charAt(i) == s.charAt(j)) {
                    numbChar++;
                } else {
                    break;
                }
                if (numbChar > maxChar) {
                    maxChar = numbChar;
                }
            }
            numbChar = 1;
        }
        return maxChar;
    }

    public static void main(String[] args) {
        String s = "AABCDDBBBEA";
        int longestSub = longestSubstring(s);
        System.out.println(longestSub);
    }
}
