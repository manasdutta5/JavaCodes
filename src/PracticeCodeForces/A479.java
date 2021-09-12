package PracticeCodeForces;

import java.util.Scanner;

public class A479 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i=0;i<k;i++)
        {
            n = subtract(n);
        }
        System.out.print(n);
    }

    public static int subtract(int n)
    {
        if(n%10!=0) return n-1;
        else return n/10;
    }
}
