
// Working program with FastReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;
import java.lang.*;

public class Codechef{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static int testwin(char c,char m[][])
    {
        int win=0;
        //replace all _ with c
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
            {
                if(m[i][j]=='_') m[i][j]=c;
            }

        // row wise match resulted in win

        for(int i=0;i<3;i++)
        {
            if(m[i][0]==c && m[i][1]==c && m[i][2]==c ) win++;
        }

        // column wise win
        for(int i=0;i<3;i++)
        {
            if(m[0][i]==c && m[1][i]==c && m[2][i]==c ) win++;
        }

        // diagonal wise win
        if(m[0][0]==c && m[1][1]==c && m[2][2]==c) win++;
        if(m[0][2]==c && m[1][1]==c && m[2][0]==c) win++;

        // return total winning cases for character c on current state of tic tac toe board
        return win;
    }

    public static int countwin(char c,char m[][])
    {
        int win=0;

        // row wise match resulted in win

        for(int i=0;i<3;i++)
        {
            if(m[i][0]==c && m[i][1]==c && m[i][2]==c ) win++;
        }

        // column wise win
        for(int i=0;i<3;i++)
        {
            if(m[0][i]==c && m[1][i]==c && m[2][i]==c ) win++;
        }

        // diagonal wise win
        if(m[0][0]==c && m[1][1]==c && m[2][2]==c) win++;
        if(m[0][2]==c && m[1][1]==c && m[2][0]==c) win++;

        // return total winning cases for character c on current state of tic tac toe board
        return win;
    }

    public static void main(String[] args)
    {
        FastReader sc = new FastReader();
        int T = sc.nextInt();
        while(T-->0)
        {
            char[][] m = new char[3][3];
            String str;
            int i=0,j=0;
            for(i=0;i<3;i++)
            {
                str = sc.next();
                str.getChars(0,3,m[i],0);
            }

            // store count of X,count of O in cx, co respectively

            int cx=0,co=0,winx=0,wino=0;
            for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                    if(m[i][j]=='X') cx++;
                    else if(m[i][j]=='O') co++;
                }
            }

            // store win of o and win of x in wino and winx respectively
            wino = countwin('O',m);
            winx = countwin('X',m);

            // test if x or y has any chancess of winning or it's a draw
            int newWinO = testwin('O',m);
            int newWinX = testwin('X',m);

            // if both X and O wins, or any one wins more than once, invalid case
            // if cx and co has difference more than 1, invalid case
//            System.out.println(winx+" "+wino);

            if((wino+winx>1) || Math.abs(cx-co)>1) System.out.println("3");
            else if((wino>0 || winx>0)) System.out.println("1");
            else if((newWinO>wino && co<cx) || (newWinX>winx && cx==co)) System.out.println("1");
            else System.out.println("2");
//            else (cx+co<9) System.out.println("2");

        }


    }
}