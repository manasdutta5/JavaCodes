package ProblemPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String s = sc.next();
        System.out.println("Input string is :"+s);
        System.out.println("All possible subseqences are:");
        System.out.println(printSubSeq(s));
    }

    private static ArrayList<String> printSubSeq(String s)
    {
        if(s.length()==0) {
            ArrayList<String> empty = new ArrayList<>();
            empty.add("");
            return empty;
        }
        ArrayList<String> ans_without_start_ele = printSubSeq(s.substring(1));
        ArrayList<String> ans = new ArrayList<>();
        ans.addAll(ans_without_start_ele);
        for(int i=0;i<ans_without_start_ele.size();i++)
        {
            ans.add(s.charAt(0)+ans_without_start_ele.get(i));
        }
        return ans;
    }

}
