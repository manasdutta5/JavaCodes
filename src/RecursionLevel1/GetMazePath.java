/*              Position is at (0,0)
                To reach (max row, max column) i.e, last cell
                Can move either one cell  horizontal - h or one cell down - v
                Given n - number of rows and m - number of columns
                To print ArrayList of all paths like - hhvv, hvhv etc
                https://youtu.be/ox3TswFFKDI (Problem link)
 */

package RecursionLevel1;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath {
    static int row,column;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt(); // number of total rows
        m = sc.nextInt();// number of total columns
        row = n;
        column = m;

        System.out.println(getMazePath(1,1));
    }

    public static ArrayList<String> getMazePath(int n,int m){


        if(n == row && m == column){
            ArrayList<String> OnePath= new ArrayList<>();
            OnePath.add("");
            return OnePath;
        }
        else if(n > row || m > column){
            ArrayList<String> NoPath= new ArrayList<>();
            return NoPath;
        }


        ArrayList<String> horizontalPaths = getMazePath(n,m+1);
        ArrayList<String> verticalPaths = getMazePath(n+1,m);
        ArrayList<String> AllPaths = new ArrayList<>();

        for(String paths: verticalPaths){
            AllPaths.add("v"+paths);
        }

        for(String paths: horizontalPaths){
            AllPaths.add("h"+paths);
        }

        return AllPaths;
    }
}
