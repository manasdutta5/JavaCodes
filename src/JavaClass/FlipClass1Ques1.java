package JavaClass;
import java.util.*;
enum ROOM{SINGLE("Single room",4.5,10), DOUBLE("Double room",3,5), DELUXE("Deluxe room", 4.0,10), SUITE("Suite",5,15);
    double rating;
    private int tot_num;
    private String types;
    ROOM() {
        rating = 0;
        types="Not specified";
        tot_num=0;
    }
    ROOM(String ty,double t,int tn ){
        types=ty;
        rating=t;
        tot_num=tn;

    }
    public double getRating(){
        return rating;
    }
    public String getType(){
        return types;
    }
    public double getTotalavl(){
        return tot_num;
    }
}

public class FlipClass1Ques1 {
    public static void main(String[]args){
        ROOM R[]=ROOM.values();
        for(ROOM k:R){
            System.out.println(k);
        }

        System.out.println("_____");
        String room="DELUXE";
        ROOM delu=ROOM.valueOf(room);
        System.out.println(delu);
        System.out.println("_____");

        ROOM r;
        r=ROOM.SINGLE;
        if (r==ROOM.SINGLE){
            System.out.println(r);
        }
        System.out.println("_____");


        switch(r){
            case SUITE:System.out.println(ROOM.SUITE.getType()+" "+ROOM.SUITE.getRating()+" "+ROOM.SUITE.getTotalavl());

                break;
            case DELUXE:System.out.println(ROOM.DELUXE.getType()+" "+ROOM.DELUXE.getRating()+" "+ROOM.DELUXE.getTotalavl());

                break;
            case DOUBLE:System.out.println(ROOM.DOUBLE.getType()+" "+ROOM.DOUBLE.getRating()+" "+ROOM.DOUBLE.getTotalavl());

                break;
            case SINGLE: System.out.println(ROOM.SINGLE.getType()+" "+ROOM.SINGLE.getRating()+" "+ROOM.SINGLE.getTotalavl());

                break;
        }

    }
}