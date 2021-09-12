package Practice_Leetcode;

import java.util.Scanner;

public class ArrayPlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n;
        n = sc.nextInt();
        int[] digits = new int[n];


        for(i=0;i<n;i++)
        {
            digits[i] = sc.nextInt();
        }


        digits[digits.length-1] += 1;
        int s = digits[digits.length-1];
            i = digits.length-1;
        while(s>=10)
        {
            digits[i] = 0;
            digits[i-1] += 1;
            s = digits[i-1];
            i--;
        }

        for(i=0;i<digits.length;i++)
        {
            System.out.print(digits[i]+" ");
        }
    }
}
