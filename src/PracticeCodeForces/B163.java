package PracticeCodeForces;

import java.util.Scanner;

public class B163 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,t;

        n = sc.nextInt();
        t = sc.nextInt();
        String s = sc.next();
        while(t>0)
        {
            t--;
            for(int i = 0;i<s.length()-1;i++)
            {
                if(s.charAt(i)=='B' && s.charAt(i+1)=='G')
                {
                    s = s.substring(0,i) + 'G' + 'B' + s.substring(i+2);
                    i+=1;
                }
            }
        }
        System.out.print(s);
    }
}
