package Interfaces;

public class User {
    public static void main(String[] args){
        SBI bank = new SBI();
        System.out.println("Interest rate is "+bank.getInterest());
    }
}
