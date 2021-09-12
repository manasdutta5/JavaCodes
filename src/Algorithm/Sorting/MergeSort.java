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
        //printing unsorted array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        //calling merge sort function
        mergesort(arr,0,n-1);

        System.out.println();
        //printing sorted array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
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

        int[] res = new int[arr.length];  /* result array containing merged result of two sorted sub-arrays*/

        int i = l;      /* starting index of second sorted sub-array */
        int j = mid+1;  /* starting index of second sorted sub-array */
        int k = l;      /* starting index of sorted result array */

        /*
        // USe a while loop to pick and place
        // appropriate elements in array res till any
        // one of the sub-arrays exhausts.
        */

        while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
                res[k++] = arr[i++];
            }else{
                res[k++] = arr[j++];
            }
        }

        if(i<=mid){
            while(i<=mid){
                res[k++] = arr[i++];
            }
        }else{
            while(j<=r){
                res[k++] = arr[j++];
            }
        }

        for(int index=l;index<=r;index++){
            arr[index] = res[index];
        }

    }
}
