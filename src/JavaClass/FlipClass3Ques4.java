package JavaClass;

import java.util.Scanner;

public class FlipClass3Ques4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("The given string is:");
        String s=sc.nextLine();
        String[] strarray = s.split(" ");
        System.out.print("\nThe new string after reversed the words:");
        for(int i=strarray.length-1;i>=0;i--)
        {
            System.out.print(strarray[i]+" ");
        }
    }
}
