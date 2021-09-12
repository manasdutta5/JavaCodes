package JavaClass;

import java.util.*;

public class Module3 {

    public static void  main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String a = sc.nextLine();
        a = a.toLowerCase();
        String t[] = a.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(String temp: t)
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        System.out.println(map);
        sc.close();
    }
    
}