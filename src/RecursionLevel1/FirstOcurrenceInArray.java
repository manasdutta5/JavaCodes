package RecursionLevel1;

import java.util.Scanner;

public class FirstOcurrenceInArray {
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
        System.out.println("First occurance is at index :"+(firstOccur(a,ele,0)));

    }

    public static int firstOccur(int[] a,int ele,int i)
    {
        if(i==a.length) return -1;
        if(a[i]==ele) return i;
        else return firstOccur(a,ele,i+1);
    }
}
