package JavaClass;
import java.util.*;
public class Module2 {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.removeIf(n -> (n % 2 == 0));
        for (int i : a) {
            System.out.println(i);
        }
    }
}
