package ProblemPractice;

import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] ch = new int[n];

        for(int i=0;i<n;i++){
            ch[i]=sc.nextInt();
        }
        System.out.println(totalParents(n,x,ch));
    }

    static int totalParents(int input1, int input2, int[] input3){
        HashMap<Integer,Integer> ht = new HashMap<>();

        for(int i=0;i<input1 ; i++)
        {
            if(ht.containsKey(input3[i]))
            {
                ht.put(input3[i],ht.get(input3[i])+1);
            }
            else
            {
                ht.put(input3[i],1);
            }
        }

       int c=0;
        for(Integer i:ht.values())
        {
            if(i>=input2) c++;
        }
        return c;
    }
}
