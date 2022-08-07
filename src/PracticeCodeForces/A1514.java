package PracticeCodeForces;

/* https://codeforces.com/problemset/problem/1514/A */

import java.util.ArrayList;
import java.util.Scanner;
public class A1514 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0){
            boolean flag = true;
            int size = sc.nextInt();
            while(size--!=0)
            {
                int temp = sc.nextInt();
                if(!isPerfect(temp)) flag = false;
            }
            if(!flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean isPerfect(int ele)
    {
        return(Math.ceil(Math.sqrt(ele)) == Math.floor(Math.sqrt(ele)));
    }
}
