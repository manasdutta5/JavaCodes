package RecursionLevel1;

import java.util.Scanner;

public class LastOccuranceInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        System.out.println("Enter element to find:");
        int ele = sc.nextInt();
        System.out.println("Last occurance is at index :"+(lastOccur(a,ele,a.length-1)));

    }

    public static int lastOccur(int[] a,int ele,int i)
    {
        if(i==-1) return -1;
        if(a[i]==ele) return i;
        else return lastOccur(a,ele,i-1);
    }
}
