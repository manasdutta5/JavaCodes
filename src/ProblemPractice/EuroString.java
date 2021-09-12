package ProblemPractice;

import java.util.*;
public class EuroString {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        String s3 = s2.substring(0,s2.length()-1);

        int index = s1.indexOf(s3);
        if(index == -1){
            System.out.print("no matches found");
        }
        else{
            System.out.println(s1.substring(index));
        }
    }
}
