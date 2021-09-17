package RecursionLevel1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Knapsack_0_1_recursive {

   static class Item{
       int value,weight;

       Item(int weight, int value){
           this.weight = weight;
           this.value = value;
       }

   }

   static class SortByValueByWeight implements Comparator<Item>{
       @Override
       public int compare(Item o1, Item o2) {
           double ratio1 = o1.value/o1.weight;
           double ratio2 = o2.value/o2.weight;

           return (int) (ratio2-ratio1);
       }
   }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter capacity of the knapsack :");
        int W = sc.nextInt();

        System.out.print("Enter number of items :");
        int n = sc.nextInt();
        int weight,value;
        Item[] items = new Item[n];

        for(int i=0; i<n ;i++){
            System.out.println("Enter weight and value of "+i+" item :");
            items[i] = new Item(sc.nextInt(),sc.nextInt());
        }
        System.out.println(findValue(items,n,W));
    }

    static int findValue(Item[] items,int n, int W){
       if(n==0 || W==0) return 0;
       if(items[n-1].weight<=W){
           return Math.max(items[n-1].value + findValue(items,n-1,W-items[n-1].weight), findValue(items,n-1,W) );
       }
       else
           return findValue(items,n-1,W);
    }
}
