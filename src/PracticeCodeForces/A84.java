package PracticeCodeForces;

import java.util.Scanner;

public class A84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n,c=0,cc=0;
        n = sc.nextLong();

        while(n>0)
        {
            if(n%10==4 || n%10==7) c++;
            n/=10;
        }
        long temp = c;
        boolean flag = true;
        while(c>0)
        {
            if(c%10!=4 && c%10!=7)
            {
                flag = false;
                break;
            }
            c/=10;
        }
        if(temp!=0 && flag)
            System.out.print("YES");
        else
            System.out.print("NO");

    }
}
