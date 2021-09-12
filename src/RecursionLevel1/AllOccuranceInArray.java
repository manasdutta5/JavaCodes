package RecursionLevel1;

import java.util.Scanner;

public class AllOccuranceInArray {
    static int c=0;
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
        int[] res = AllOccur(a,ele,0,0);
        if(res.length==0)
        {
            System.out.println("No element found.");
        }
        else
        {
            for(int i=0;i<res.length;i++)
            {
                System.out.print(res[i]);
            }
            System.out.println();
        }

    }

    public static int[] AllOccur(int[] a,int ele,int i,int count)
    {

        if(i==a.length){
            return new int[count];
        }

        if(a[i]==ele){
            int res[] =  AllOccur(a,ele,i+1,count+1);
            res[count] = i;
            return res;
        }
       else
        {
            int res[] = AllOccur(a,ele,i+1,count);
            return res;
        }
    }
}
