// Create a function called `uniqueCharacters` that takes a string as parameter
// and returns a list with the unique letters of the given string
// Create basic unit tests for it with at least 3 different test cases
// Should print out:
// ["n", "g", "r", "m"]
public class UniqueChars {
    public static void main(String[] args) {



        uniqueCharacters("anagram");
    }

    static void  uniqueCharacters(String str)
    {
        int[] count = new int[256];
        int i;
        for (i = 0; i < str.length(); i++)
            if(str.charAt(i)!=' ')
                count[(int)str.charAt(i)]++;
        int n = i;
        for (i = 0; i < n; i++)
            if (count[(int)str.charAt(i)] == 1)
                System.out.print("\"" + str.charAt(i) + "\" ");
    }



}



//    public static String uniqueCharacters(String strToFilter){
//        String temp = "";
//        for (int i = 0; i < strToFilter.length(); i++){
//            char current = strToFilter.charAt(i);
//            if (temp.indexOf(current) < 0){
//                temp = temp + current;
//            } else {
//                temp = temp.replace(String.valueOf(current), "");
//            }
//        }
//
//        return temp;