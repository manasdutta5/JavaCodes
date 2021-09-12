package RecursionLevel1;

import java.util.Scanner;

public class AllSubsetOfAString {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String to find a subset");
        String str = scanner.nextLine();
        String cur="";
        int start=0;
        int end=str.length();
        Subset(str,cur,start,end);

    }

    private static void Subset(String str,String cur,int start , int end) {
        if (start == end) {
            System.out.println(cur);
            return;
        }
        Subset( str,cur, start + 1, end);

        Subset(str,cur + str.charAt(start), start + 1, end);

    }

}
