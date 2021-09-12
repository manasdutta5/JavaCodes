package ProblemPractice;
import java.util.*;
public class MagicStick {

    public static int main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int[] input2 = new int[n];
        int[] input3 = new int[n];

        int med = 0;
        for(int i=0;i<n;i++)
        {
            input2[i] = sc.nextInt();
            med+= input2[i];
        }

        med/=input1;

        for(int i=0;i<input1;i++)
        {
            input3[i] = sc.nextInt();
        }

        int c=0;
        for(int i=0;i<input1;i++)
        {
            c += (Math.abs(med-input2[i])*input3[i]);
        }
        return c;
    }
}
