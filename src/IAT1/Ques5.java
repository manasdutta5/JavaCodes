package IAT1;

enum Dishes{
    DOSA(60),BIRIYANI(210),PASTA(50),COFFEE(21);

    private int price;
    Dishes(int p){
        price = p;
    }

    int getPrice(){
        return price;
    }
}

public class Ques5 {
    public static void main(String[] args) {
        for(Dishes d : Dishes.values())
        {
            System.out.println(d + " costs "+ d.getPrice());
        }
    }
}
