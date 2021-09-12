package JavaClass;

import java.util.*;

public class FlipClass3Question2 {
    public static void main(String[] args) {
        String s1 = "Programming in Java for professionals";
        String s = s1.toLowerCase();
        int lenBefore=0,lenAfter=0;

        System.out.println("Character\t\tfrequency\n");
        displayCharFreq(s);

    }

    public static void displayCharFreq(String s)
    {
        if(s.length()==0)
        {
            return;
        }
        int lenBefore=0,lenAfter=0;
        String firstChar = s.substring(0,1);
        lenBefore = s.length();
        String s1 = s.replace(firstChar,"");
        lenAfter = s1.length();
        System.out.println(firstChar+"\t\t\t\t"+(lenBefore-lenAfter));
        displayCharFreq(s1);
    }


}
