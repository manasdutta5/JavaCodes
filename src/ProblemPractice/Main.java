package ProblemPractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String s1 = sc.next();

        System.out.println("Enter second string");
        String s2 = sc.next();

        System.out.println("Enter third string");
        String s3 = sc.next();

        printCrazyLetter(s1,s2,s3);
    }

    public static void printCrazyLetter(String s1, String s2, String s3)
    {
        //printing first string in all caps using s.toUpperCase() method
        System.out.print(s1.toUpperCase());

        //printing letters in reverse using string builder class
        //and reversing the string using built in method

        StringBuilder reversed = new StringBuilder();

        // append a string into StringBuilder reversed
        reversed.append(s2);

        // reverse StringBuilder reversed
        reversed.reverse();

        // print reversed String stored in reversed string builder
        System.out.print(reversed);

        //now print last string each char separated by space
        for(int i =0;i<s3.length();i++)
        {
            System.out.print(s3.charAt(i)+" ");
        }
    }
}
