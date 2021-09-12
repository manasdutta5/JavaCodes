package ProblemPractice;

import java.util.Scanner;

    public class EuroMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] m = new int[n][n];

        for(int i=0; i<n;i++)
            for(int j=0; j<n;j++)
                m[i][j] = sc.nextInt();

            printSum(m,n,n);
    }

    //other function

        static void printSum(int mat[][], int k,int n)
        {

            if (k > n) return;

            for (int i = 0; i < n-k+1; i++)
            {

                for (int j = 0; j < n-k+1; j++)
                {

                    int sum = 0;
                    for (int p = i; p < k+i; p++)
                        for (int q = j; q < k+j; q++)
                            sum += mat[p][q];

                    System.out.print(sum+ " ");
                }

                System.out.println();
            }
        }




    }
