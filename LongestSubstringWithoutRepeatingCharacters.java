/**
 * This problem has been solved. Start/Finish: 22 Jan 2021.
 **/

class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            String sub = s.substring(i, i + 1);
            for (int j = i + 1; j < s.length(); j++) {

                if (sub.indexOf(s.charAt(j)) == -1) {
                    System.out.println(sub + " does not contain " + s.charAt(j));
                    sub += s.substring(j, j + 1);
                } else {
                    break;
                }

                // System.out.println(sub);

            } // end inner for
            if (sub.length() > maxLength)
                maxLength = sub.length();
        } // end outer for

        return maxLength;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dovaraken"));
        // String s = "dovaraken";
        // System.out.println(s.charAt(3) == s.charAt(5));
        // System.out.println(s.contains("dova"));
    }

}