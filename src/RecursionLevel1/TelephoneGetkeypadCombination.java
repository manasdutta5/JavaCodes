package RecursionLevel1;

import java.util.ArrayList;
import java.util.Scanner;

public class TelephoneGetkeypadCombination {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> s = new ArrayList<String>();
        s.add("?."); s.add("abc");s.add("ghi");s.add("jkl");s.add("mnop");
        s.add("qrst");s.add("uv");s.add("wxyz");s.add("./");

        System.out.println("Enter key combination :");
        String keys = sc.next();

        ArrayList<String> result = getCombinations(keys,s);
        System.out.println(result);

    }

    public static ArrayList<String> getCombinations(String keys, ArrayList<String> s)
    {
        if(keys.length()==0)
        {
            ArrayList<String> blank = new ArrayList<>();
            blank.add("");
            return blank;
        }

        char initialKey = keys.charAt(0);
        ArrayList<String> combinationWithoutFirstKey = getCombinations(keys.substring(1),s);

        // create new array list to store the final result
        ArrayList<String> result = new ArrayList<>();
        for(String combinations: combinationWithoutFirstKey)
        {
            for(int i=0;i<s.get(initialKey - '0').length();i++)
            {
                result.add(s.get(initialKey - '0').charAt(i)+combinations);
            }
        }

        return result;
    }
}
