package RecursionLevel1;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairsPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getStairPath(n));
    }

    public static ArrayList<String> getStairPath(int n){
        if(n == 0){
            ArrayList<String> part0 = new ArrayList<>();
            part0.add("");
            return part0;
        }
        else if(n < 0){
            ArrayList<String> partNeg = new ArrayList<>();
            return partNeg;
        }

        ArrayList<String> path1 = getStairPath(n-1);
        ArrayList<String> path2 = getStairPath(n-2);
        ArrayList<String> path3 = getStairPath(n-3);
        ArrayList<String> AllPaths = new ArrayList<>();

        for(String paths : path1){
            AllPaths.add(1+paths);
        }

        for(String paths : path2){
            AllPaths.add(2+paths);
        }

        for(String paths : path3){
            AllPaths.add(3+paths);
        }

        return AllPaths;


    }
}
