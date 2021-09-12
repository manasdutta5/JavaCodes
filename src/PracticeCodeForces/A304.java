package PracticeCodeForces;

import java.util.Scanner;

// Soldiers and Banana
public class A304 {

    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         long k,n,w;
         k = sc.nextLong();
         n = sc.nextLong();
         w = sc.nextLong();

         long price = 0;

         price = k*( (w*(w+1))/2  );
         if(price>n)
            System.out.print(price-n);
         else
             System.out.print("0");
    }
}
