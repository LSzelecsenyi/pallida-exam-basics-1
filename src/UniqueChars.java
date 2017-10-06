// Create a function called `uniqueCharacters` that takes a string as parameter
// and returns a list with the unique letters of the given string
// Create basic unit tests for it with at least 3 different test cases
// Should print out:
// ["n", "g", "r", "m"]

import java.util.ArrayList;

public class UniqueChars {
    public static void main(String[] args) {

        System.out.println(uniqueCharacters("anagram"));
    }

    static ArrayList<Character> uniqueCharacters(String str) {
        int[] count = new int[256];
        int i;
        ArrayList<Character> uniqueChars = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count[(int) str.charAt(i)]++;
            }
        }
        int n = i;
        for (i = 0; i < n; i++) {
            if (count[(int) str.charAt(i)] == 1) {
                sb.append(str.charAt(i));
            }
        }
        String out = sb.toString();
        for (char c : out.toCharArray()) {
            uniqueChars.add(c);
    }   return uniqueChars;
        }

}