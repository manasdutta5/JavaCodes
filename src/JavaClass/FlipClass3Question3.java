package JavaClass;

public class FlipClass3Question3 {
    public static void main(String[] args) {

        String s = "Jack and jill tom and jerry will and tom";
        String s2 = "and";
        int c=0;
        while(s.length()-s2.length()>=0)
        {
            int i=s.indexOf(s2);
            if(i>=0)
            {
                c++;
            }
            s=s.substring(i+s2.length());
        }
        System.out.println("The number of occurrences of s2  in s is : "+c);
    }
}
