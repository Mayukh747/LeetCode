/**
 * This problem has been solved. Finish: 28 May 2021.
 **/

public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        String mergedString = "";

        while (word1.length() > 0 && word2.length() > 0) {
            mergedString += word1.substring(0, 1);
            word1 = word1.substring(1);
            mergedString += word2.substring(0, 1);
            word2 = word2.substring(1);
        }

        if (word2.length() > 0) {
            mergedString += word2;
        }
        if (word1.length() >= 0){
            mergedString += word1;
        }

        return mergedString;
    }

    public static void main(String[]args){
        String w1 = "abc";
        String w2 = "pqr";
        System.out.println(mergeAlternately(w1,w2));
    }



}
