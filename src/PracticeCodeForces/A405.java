package PracticeCodeForces;

import java.util.Scanner;

public class A405 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        while(a<=b)
        {
            a*=3;b*=2;
            c++;
        }
        System.out.print(c);
    }
}
