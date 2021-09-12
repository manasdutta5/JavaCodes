package JavaClass;

public class FlipClass3Question8 {
    public static void main(String[] args) {
        String s = "The alarm went off at 3.00. The man  stepped out  in the rain";
        String[] strarray = s.trim().split(" ");
        int c=0;
        for(int i=0;i<strarray.length;i++)
        {

            int k=strarray[i].length();
            if(k<=0)
                continue;
            if(strarray[i].charAt(k-1)=='m'||strarray[i].charAt(k-1)=='n')
                c++;
        }
        System.out.println("The number of words ending in m or n is "+c);
    }
}
