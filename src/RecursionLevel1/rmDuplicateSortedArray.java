package RecursionLevel1;
// Remove duplicate element from a sorted array and return array and length
// No extra space, rmDuplicate function takes array and size as parameter

import java.util.*;

public class rmDuplicateSortedArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter size of the array :");
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        int i;
        for(i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        remDuplicate(arr,n);
    }

    public static void remDuplicate(int[] arr,int n)
    {
        int i,c=0,j=0;
        int[] a=new int[n];
        for(i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                a[j++]=arr[i];
                c++;
            }
        }
        a[j]=arr[arr.length-1];
        c++;

        System.out.println("Array size is :"+c);

        for(i=0;i<c;i++)
        {
            System.out.println(a[i]);
        }
    }
}
