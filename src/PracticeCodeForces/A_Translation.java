package PracticeCodeForces;

import java.util.*;

public class A_Translation {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String lang1 = sc.next();
        String lang2 = sc.next();

        StringBuilder rev = new StringBuilder();
        rev.append(lang1);
        rev.reverse();
        //System.out.println(lang1+"    "+rev);
        if(lang2.equals(rev.toString())) System.out.print("YES");
        else System.out.println("NO");
    }
}
