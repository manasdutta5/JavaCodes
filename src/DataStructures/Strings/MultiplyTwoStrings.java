package DataStructures.Strings;

/*
// Probllem Link: https://practice.geeksforgeeks.org/problems/multiply-two-strings/1/?company[]=Amazon&company[]=Amazon&problemStatus=unsolved&problemType=functional&page=2&sortBy=submissions&query=company[]AmazonproblemStatusunsolvedproblemTypefunctionalpage2sortBysubmissionscompany[]Amazon
// Video solution: https://youtu.be/5NdhK3tZViQ
 */


import java.util.Scanner;

public class MultiplyTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(multiplyStrings(s1,s2));
    }

    public static String multiplyStrings(String str1, String str2)
    {
        boolean sign = true;
        if(str1.equals("0") || str2.equals("0")) return "0";
        if(str1.charAt(0)=='-' && str2.charAt(0)=='-')
        {
            sign = true;
        }
        else if(str1.charAt(0) == '-')
        {
            sign = false;
        }
        else if(str2.charAt(0)=='-')
        {
            sign = false;
        }

        String s1="";
        String s2 = "";
        if(str1.charAt(0)=='-')
        {
            s1 += str1.substring(1,str1.length());
        }else s1 += str1;
        if(str2.charAt(0)=='-')
        {
            s2 += str2.substring(1,str2.length());
        }else s2 += str2;

        //System.out.println(s1+" "+s2);
        int len1 = s1.length();
        int len2 = s2.length();

        int[] res = new int[len1 + len2];

        int i = len1-1;
        int k=len1+len2-1;
        int pf = 0;

        while(i>=0)
        {
            int num1 = s1.charAt(i)-'0';
            int carry = 0;
            int j = len2-1;
            k = len1+len2-1-pf;

            while(j>=0 || carry !=0)
            {
                //System.out.println("------i = "+i+" j = "+j+"------------");
                if(j>=0)
                {
                    int num2 = s2.charAt(j)-'0';
                    //System.out.println("num1 = "+num1+ ", num2 = "+num2);
                    int product = num1*num2 + carry + res[k];
                    //System.out.println("product = "+product);
                    res[k] = product%10;
                    carry = product/10;
                }
                else
                {
                    res[k] += carry;
                    //System.out.println("product = "+res[k]);
                    carry = 0;
                }

                k--;
                j--;
            }
            pf++;
            i--;
        }
        String resStr = "";
        if(!sign) resStr +="-";
        boolean flag = false;
        for(int h=0;h<res.length;h++)
        {
            if(res[h]!=0)flag = true;
            if(flag) resStr += res[h];

        }

        return resStr;
    }
}
