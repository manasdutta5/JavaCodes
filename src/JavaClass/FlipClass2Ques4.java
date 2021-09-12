package JavaClass;
import java.util.*;

public class FlipClass2Ques4 {


    public static void quiz()
    {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        Properties capitals = new Properties();

        capitals.put("Karnataka","Bengaluru");
        capitals.put("Kerela","Thiruvananthapuram");
        capitals.put("Bihar","Patna");
        capitals.put("Maharshtra","Mumbai");
        capitals.put("Mizoram","Aizwal");
        capitals.put("Rajasthan","Jaipur");
        capitals.put("Sikkim","Gangtok");
        capitals.put("Uttarakhand","Dehradun");
        capitals.put("Goa","Panaji");
        capitals.put("Andhra Pradesh","Amaravati");

        Set<?> states = capitals.keySet();
        ArrayList<String> state= new ArrayList<String>(); //to use Collections.shuffle on states name

        for(Object name: states)
            state.add((String)name);

        Collections.shuffle(state);

        String response="no";
        for(int i=4;i>=0;i--)
        {

            System.out.println("What is the capital of "+state.get(i) +" ?");
            response = sc.next();

            if((capitals.getProperty(state.get(i))).equals(response))
            {
                System.out.println("Right answer!");
                score++;
            }
            else
                System.out.println("Wrong answer!");

        }

        System.out.println("Total Score: "+score);

    }

    public static void main(String[] args) {
        quiz();
    }
}
