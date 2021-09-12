package Algorithm.Sorting;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size :");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements :");
        int[] arr = new int[n];

        for(int i=0; i<n ;i++){
            arr[i] = sc.nextInt();
        }

        mergesort(arr,0,n-1);
    }

    static void mergesort(int[] arr,int l,int r){
        if(l<r){
            int mid = (l+r)/2;
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,r);

            //merge the two sorted halves now
            merge(arr,l,mid,r);
        }
    }

    static void merge(int[] arr, int l, int mid,int r){

        int[] res = new int[r-l];  /* result array containing merged result of two sorted subarrays*/

        int i = l;      /* starting index of second sorted subarray */
        int j = mid+1;  /* starting index of second sorted subarray */
        int k = l;      /* strarting index of sorted result array */

        /*
        // USe a while loop to pick and place
        // appropriate elements in array res till any
        // one of the subarrays exhausts.
        */

        while(i<mid && j<r){

        }

    }
}
