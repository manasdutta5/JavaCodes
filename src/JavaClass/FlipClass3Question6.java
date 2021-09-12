package JavaClass;

public class FlipClass3Question6 {
    public static void main(String[] args) {
        String s = "gibblegabbler";

        System.out.println("The given string is: "+s);

        int flag=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                    flag=1;
            }
            if(flag==0)
            {
                System.out.println("The first non repeated character in String is: "+s.charAt(i));
                break;
            }
            flag=0;
        }
    }
}
