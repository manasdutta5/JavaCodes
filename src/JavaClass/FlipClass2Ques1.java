package JavaClass;
import java.util.*;

public class FlipClass2Ques1 {
    public static void main(String[] args) {
        Vector<Integer> vt = new Vector<>(3,2);


        System.out.println("vt.capacity() :"+vt.capacity());
        vt.add(3);vt.add(5);vt.add(8);
        System.out.println("vt.capacity() :"+vt.capacity());
        vt.add(9);
        System.out.println("vt.capacity() "+vt.capacity());
        System.out.println("vt.firstElement() :"+vt.firstElement());
        System.out.println("vt.lastElement() :"+ vt.lastElement());

        for(Integer i: vt) System.out.println(i);

        Enumeration en = vt.elements();
        while(en.hasMoreElements()) System.out.println(en.nextElement());

        vt.removeElement(4);
        vt.removeElement(3);

        System.out.println("vt.elementAt(1) :"+vt.elementAt(1));

        Stack<Integer> st = new Stack<Integer>();
        st.push(4); st.push(23); st.push(48);
        System.out.println(st);
        st.pop();
        st.pop();

        Hashtable<String,Double> ht = new Hashtable<String,Double>();
        ht.put("1CRCS147", 78.4);
        ht.put("1CRCS149", 88.9);
        ht.put("1CRCS145", 44.2);

        // Enumeration en already defined above
        en = ht.elements();
        while(en.hasMoreElements()) System.out.println(en.nextElement());






    }


}
