package RecursionLevel1;

import java.lang.reflect.Array;
import java.util.*;

public class GetSubsequenceOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        String s = sc.next();
        ArrayList<String> result = getSubSeq(s, k);
        Collections.sort(result);

        int c = 0;
        System.out.println(result);
        for(String b: result){
            if(b.length() == k)
            {
                for(int i=0;i<b.length();i++){
                    if(b.charAt(i) == 'b')
                        c++;
                    if(c==k)
                    {
                        System.out.println(b);
                        return;
                    }
                }
            }
        }
    }

    public static ArrayList<String> getSubSeq(String s,  int k)
    {
        if(s.length()==0)
        {
            ArrayList<String> ans_for_empty_string = new ArrayList<>();
            ans_for_empty_string.add("");
            return ans_for_empty_string;
        }

       char firstChar = s.charAt(0);
       ArrayList<String> ans_for_substr = getSubSeq(s.substring(1),k);

       ArrayList<String> result = new ArrayList<>();
       for(String ele: ans_for_substr)
       {
           if(ele.length()==k)
               result.add(""+ele);
           result.add(firstChar+ele);
       }
       return result;
    }
}
