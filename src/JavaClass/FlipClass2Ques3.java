package JavaClass;
import java.util.*;

public class FlipClass2Ques3 {

    static Hashtable<String, Integer> items = new Hashtable<>();

    public static void add(String name, int quantity)
    {
        if(items.get(name)==null)
        {
            items.put(name,quantity);
        }
        else
            items.put(name, items.get(name) + quantity);
    }

    public static void get(String name, int quantity)
    {
        if(items.get(name)==null)
        {
            System.out.println(name+" item not found");
        }
        else if(items.get(name)<quantity)
        {
            System.out.println(name+" required Stock not available.");
        }
        else
        {
            items.put(name, items.get(name) - quantity);
        }

    }

    public static void display()
    {
        System.out.println("Items\t\t\tQuantity");
        for(Object name: items.keySet())
        {
            System.out.println(name+"\t\t\t"+items.get(name));
        }
    }

    public static void main(String[] args)
    {
        add("Pencil",10); add("Sharpener",50);add("Eraser", 50);
        add("Stapler", 45);add("ruler",10);add("Pencil",15);
        add("Stapler",20);
        display();
        get("ruler",10); get("Pencil", 5); get("ruler", 5);
        get("notebook",4);
        display();
    }
}
