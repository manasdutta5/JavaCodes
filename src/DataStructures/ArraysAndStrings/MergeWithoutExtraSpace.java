package DataStructures.ArraysAndStrings;

import java.util.Arrays;

public class MergeWithoutExtraSpace {

    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {0,2,6,8,9};

        int n = 4;
        int m = 5;

        merge(arr1,arr2,n,m);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<m;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }

    public static void merge(int[] arr1,int[] arr2,int n,int m)
    {
        int i=0,j=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(arr1[i] > arr2[j])
                {
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
                Arrays.sort(arr2);
            }
        }
    }
}
