package DataStructures.Strings;
/*
// Problem link: https://practice.geeksforgeeks.org/problems/maximum-number-of-characters-between-any-two-same-character4552/1
 */
import java.util.HashMap;

public class MaxNoOfCharBtwTwoSameChar {

    public static void main(String[] args) {
        String str = new String("MacDonaldsWithanExtraM");
        System.out.println(maxChars(str));
    }

    public static int maxChars(String s) {
        //code here
        HashMap<Character, Integer> map = new HashMap<>();

        int maxYet = -1;

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
            } else {
                /*
                // letters in between = initial index - current index
                */
                int lettersInBetween = i - map.get(s.charAt(i)) - 1;
                maxYet = Math.max(maxYet, lettersInBetween);
            }
        }
        return maxYet;
    }
}
