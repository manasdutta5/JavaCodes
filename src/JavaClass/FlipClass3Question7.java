package JavaClass;

public class FlipClass3Question7 {
    public static void main(String[] args) {
        String s = "it 15 is25 a 20string";
        System.out.println("The given string is: "+s);
        String snum=s.replaceAll("[^\\d+]"," ");
        String ssum=snum.replaceAll("[\\s]+"," ").trim();
        String[] strarray = ssum.split(" ");
        int sum=0;
        for(int i=0;i<strarray.length;i++)
        {
            sum+=Integer.parseInt(strarray[i]);
        }
        System.out.println(sum);

    }
}
