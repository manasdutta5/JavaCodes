package PracticeCodeForces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class IntegerDiversity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0)
        {
            ArrayList<Integer> arr = new ArrayList<>();
            int n;

            n = sc.nextInt();
            for(int i=0;i<n;i++)
            {
                int temp = sc.nextInt();
                arr.add(temp);
            }

            System.out.println(solve(arr,n));
        }
    }

    public static int solve(ArrayList<Integer> arr, int n){
        HashMap<Integer,Integer> map = new HashMap();
        int count = 0;
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr.get(i)))
            {
                count++;
                map.put(arr.get(i),1);
            }
            else
            {
                if(!map.containsKey(arr.get(i)*(-1)))
                {
                    map.put(arr.get(i)*(-1),1 );
                    count++;
                }
            }
        }


        return count;
    }
}
