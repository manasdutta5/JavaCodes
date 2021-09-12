package JavaClass;
import java.util.*;

public class FlipClass2Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter expression :");
        str = sc.next();
        if(isBalanced(str)) System.out.println("Balanced");
        else System.out.println("Not Balanced");

    }

    public static boolean isBalanced(String s)
    {
        Stack st = new Stack<>();

        for(int i = 0; i < s.length(); i++) {

            Character ch = s.charAt(i);

            if(!st.isEmpty() && ch == '}' && (char)st.peek() == '{') {
                st.pop();

            } else if(!st.isEmpty() && ch == ')' && (char)st.peek() == '(') {
                st.pop();

            } else if(!st.isEmpty() && ch == ']' && (char)st.peek() == '[') {
                st.pop();

            } else {
                st.push(ch);
            }

        }

        if(st.isEmpty()) {
            return true;
        }
        else
             return false;
    }

}
