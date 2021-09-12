package PracticeCodeForces;

import java.util.Scanner;

public class A87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a,b;
        int current = 0;
        int max_count = 0;
        for(int i =0;i<n;i++)
        {
            a = sc.nextInt();
            b = sc.nextInt();

            current = current - a + b;
            if(current>max_count)
                max_count = current;
        }
        System.out.print(max_count);
    }
}
