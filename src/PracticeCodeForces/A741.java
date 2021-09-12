package PracticeCodeForces;

import java.util.*;

public class A741 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T>0)
        {
            long l = sc.nextLong();
            long r = sc.nextLong();
            if(r%2!=0) {
                if ((r / 2) >= l)
                {
                    System.out.println( r - (int)(r / 2)-1);

                }
                else System.out.println(r - l);
            }
            else
            {
                if ((r / 2) >= l) System.out.println((int) r - (r / 2)-1);
                else System.out.println(r - l);
            }

            T--;
        }


    }
}