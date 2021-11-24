package ProblemPractice;

import java.util.*;

public class Random {
    public static void main(String[] args) {

        System.out.println(minSets("1234",4,4));

    }

    static int minSets(String input1, int input2,int input3)
    {
        String s = input1;
        int y = input2;
        int cnt = 0;
        int num = 0;

        int l = s.length();
        boolean f = false;

        for (int i = 0; i < l; i++)
        {
            num = num * 10 + (s.charAt(i) - '0');
            if (num <= y)
                f = true;
            else
            {
                if (f)
                    cnt += 1;
                num = s.charAt(i) - '0';
                f = false;

                if (num <= y)
                    f = true;
                else
                    num = 0;
            }
        }

        if (f == true)
            cnt += 1;
        return cnt;
    }
}
