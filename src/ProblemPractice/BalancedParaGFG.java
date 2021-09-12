package ProblemPractice;

//Momo sent to check

import java.util.Scanner;
        import java.util.Stack;

public class BalancedParaGFG {
    public static  void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> stck=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '{' || s.charAt(i) == '[' ||s.charAt(i)=='(')
            {
                stck.push(s.charAt(i));
            }
            else
            {
                if(stck.isEmpty()==true)
                {
                    stck.push('N');
                    break;
                }
                else if(isMatching(stck.peek(),s.charAt(i))!=true)
                {
                    System.out.println(stck.peek()+" "+s.charAt(i));
                    stck.push('N');
                    break;
                }
                else
                    stck.pop();
            }
        }
        if(stck.isEmpty()==true)
        {
            System.out.println("Balanced Parenthesis");
        }
        else
            System.out.println("Not a balanced parenthesis");
    }

    private static boolean isMatching(Character a, char b) {
        if((a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']'))
            return  true;
        else
            return false;
    }
}