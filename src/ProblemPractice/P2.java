package ProblemPractice;

import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {
        //creating scanner object to read user input
        Scanner sc = new Scanner(System.in);

        //creating an int variable to store
        //initial velocity
        int V0;

        //asking the user to enter V0
        System.out.print("Enter initial velocity :");
        V0 = sc.nextInt();

        //creating object of Trajectory class
        Trajectory tj = new Trajectory();

        //calling calculateMaxHeight by passing V0 as parameter
        double maxHeight = tj.calculateMaxHeight(V0);

        //printing the result
        System.out.printf("Max height attained is : %.2f meters",maxHeight);
    }
}

class Trajectory {
    private double G = 9.8;

    public double calculateMaxHeight(int V0)
    {
        return (V0*V0)/(2*G);
    }
}
