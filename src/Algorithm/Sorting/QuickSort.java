package Algorithm.Sorting;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size :");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements :");
        int[] arr = new int[n];

        for(int i=0; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        //printing unsorted array
        System.out.println("Unsorted array is :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        //calling quick sort function
        quicksort(arr,0,n-1);

        System.out.println();
        //printing sorted array
        System.out.println("Sorted array is :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void quicksort(int[] arr,int l, int h){
        if(l<h){
            int pivot = partition(arr,l,h);
            quicksort(arr,l,pivot-1);
            quicksort(arr,pivot+1,h);
        }
    }

    static int partition(int[] arr,int l,int h){
        int pivot = arr[l];
        int i = l+1;
        int j = h;

        while(i<j){
            while(arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;
            if(i<j)
                swap(arr,i,j);
        }
        swap(arr,l,j);

        //return pivot position
        return j;
    }

    static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
