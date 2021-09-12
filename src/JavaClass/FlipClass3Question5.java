package JavaClass;

import java.util.Scanner;

public class FlipClass3Question5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter main string:");
        String s =sc.nextLine(); //"the quick brown fox";

        System.out.println("Enter mask string:");
        String mask = sc.nextLine(); //"queen";

        System.out.println(replace(s,mask));
    }

    public static String replace(String s, String mask)
    {
        String ans = "";
        int i = 0;
        while(i<s.length()-1)
        {
            if(mask.indexOf(s.charAt(i))==-1) {
                ans += s.substring(i, i + 1);
            }
            i++;
        }

        // for last character
        if(mask.indexOf(s.charAt(i))==-1) {
            ans += s.substring(i);
        }

        return ans;
    }
}


