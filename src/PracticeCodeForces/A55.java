package PracticeCodeForces;

import java.util.Scanner;

public class A55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int cap=0,sma=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                sma ++;
            }
            else
                cap ++;
        }
        if(cap==sma) System.out.print(s.toLowerCase());
        else if(cap<sma) System.out.print(s.toLowerCase());
        else System.out.print(s.toUpperCase());
    }
}
