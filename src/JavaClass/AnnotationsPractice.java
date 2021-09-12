package JavaClass;
import java.util.*;


public class AnnotationsPractice {
    public static void main(String[] args) {
        String s = "Java-Python-JSP-C#-";
        System.out.println(Arrays.toString(s.split("-",0)));
        System.out.println(Arrays.toString(s.split("-",-500)));
        System.out.println(Arrays.toString(s.split("-",2)));
         }
}
