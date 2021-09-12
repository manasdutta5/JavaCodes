package IAT1;
import java.util.*;

public class Ques7 {

    public static int sum(Integer[] a, int n)
    {
        if (n == 0)
            return a[n];
        else
            return a[n] + sum(a, n - 1);
    }

    public static void main(String[] args) {
        Integer s=0;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println("Displaying the elements :");
        System.out.println(nums);

        System.out.println("Displaying the sum of elements :");
        Integer a[] = new Integer[nums.size()];
        nums.toArray(a);
        s = sum(a,a.length-1);
        System.out.println(s);

        System.out.println("Average of elements is:");
        System.out.println(s/a.length);
    }

}
