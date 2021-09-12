package JavaClass;

public class FlipClass3Question1 {
    public static void main(String[] args) {
        String s = "\u2022 Questions Strings \u20df\u20df ";
        System.out.println("Character at position 0  is "+s.charAt(0));
        System.out.println("Character at position 8  is "+s.charAt(8));
        System.out.println("Unicode point at 0 is "+s.codePointAt(0));
        System.out.println("Unicode point before index 5 is "+s.codePointBefore(5));
        System.out.println("Number of unicode points from 0 to 5 is "+s.codePointCount(0,5));
        String s1 = "1CR12CS018 Kumar", s2 = "1cr12CS019 Anju", s3 = "1CR12CS019 anju";
        if(s1.compareTo(s2)<0)
            System.out.println(s1+" is lesser than "+s2);
        if(s2.equalsIgnoreCase(s3))
            System.out.println(s2+" is equal to (ignore case) "+s3);
        String string1="Key";
        String string2="Board";
        System.out.println("String 1: "+string1);
        System.out.println("String 2: "+string2);
        System.out.println("Concatenated String "+string1+string2);
        String orgstr="Elaborate";
        System.out.println("Original String: "+orgstr);
        System.out.println("Does Elaborate contain the sequence (lab)?"+orgstr.contains("lab"));
        String myStr="Hello";
        System.out.println("Value of myStr: "+myStr);
        System.out.println("Unique identifier for String myStr is "+myStr.hashCode());
        System.out.println("Index of 'a' within Elaborate :"+orgstr.indexOf('a'));
        System.out.println("Last index of 'a' within Elaborate :"+orgstr.lastIndexOf('a'));
        String str1="Elaborate";
        String str2="The elaborate plan";
        System.out.println("String 1 :"+str1);
        System.out.println("String 2: "+str2);
        boolean res1=str1.substring(5,8).equals(str2.substring(9,12));
        boolean res2=str1.substring(0,4).equals(str2.substring(9,12));
        System.out.println("str1[5 - 8] == str2[9-12]?"+res1);
        System.out.println("str1[0 - 4] == str2[9-12]?"+res2);

    }
}
