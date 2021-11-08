package ProblemPractice;

import java.util.*;

class Question {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount :");
        int amt = sc.nextInt();
        if (amt <= 2) {
            System.out.println("Actual amount " + amt);
            System.out.println("Error amount " + amt);
        }

        if (amt > 2 && amt <= 5) {
            System.out.println("Actual amount " + amt);
            System.out.println("Error amount " + amt + amt * 0.05);
        }

        if (amt > 5 && amt <= 10) {
            System.out.println("Actual amount " + amt);
            System.out.println("Error amount " + amt + amt * 0.1);
        }
    }
}
