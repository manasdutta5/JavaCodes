package PracticeCodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class MirrorInTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0)
        {
            int n = sc.nextInt();
            String str = sc.next();
            System.out.println(solve(str));
        }
    }

    public static String solve(String str)
    {
        ArrayList<String> s = new ArrayList<>();
        int mirror = 1;
        s.add(0,""+str.charAt(0)+str.charAt(0));
        for(int i=1;i<=str.length();i++)
        {
            String curr = str.substring(0,mirror);
            String temporaryString = curr+reverse(curr);

            if(s.get(0).compareTo(temporaryString) > 0)
            {
                s.add(0,temporaryString);
            }
            mirror++;
        }


        return s.get(0);
    }

    public static String reverse(String str1)
    {
        StringBuffer st = new StringBuffer();
        st.append(str1);
        st.reverse();
        return st.toString();
    }
}
