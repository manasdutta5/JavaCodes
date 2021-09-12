package ProblemPractice;

import java.util.*;

public class Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[] start=new int[M];
        int[] end=new int[M];

        for(int i=0;i<M;i++){
            start[i] = sc.nextInt();
        }

        for(int i=0;i<M;i++){
            end[i] = sc.nextInt();
        }

        System.out.println(check(N,M,start,end));
    }

    static int check(int N, int M, int[] start, int[] end){
        HashMap<Integer,Integer> ht = new HashMap<>();

        for(int i=0;i<M ;i++){
            if(ht.containsKey(end[i])==true){
                ht.put(end[i], ht.get(end[i])+1);
            }
            else
            {
                ht.put(end[i],1);
            }
        }

        int c=0;
        for(Integer val: ht.values()){
            if(val > c) c=val;
        }


//        System.out.println(ht);
//        System.out.println(c);

        Arrays.sort(start);
        Arrays.sort(end);

        if(start.equals(end)) return 3;
        else if(c==4) return 2;
        else if(c==2) return 3;
        else if(c==1) return 1;
        else return -1;
    }
}
