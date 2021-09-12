package JavaClass;
import java.util.*;

enum Answers{
    MAYBE, NO, YES, LATER,SOON,NEVER;
}

class Question{
    Random num = new Random();
    Answers ask(){
        int probability = (int)(num.nextDouble()*100);

        if(probability < 15) return Answers.MAYBE;
        else if(probability<30) return Answers.NO;
        else if(probability<60) return Answers.YES;
        else if(probability<98) return Answers.SOON;
        else return Answers.NEVER;
    }
}
public class FlipClass1
{
    public static void main(String[] args) {
        System.out.println("Is it going to rain ?");
        Question q = new Question();
        System.out.println(q.ask());
    }
}
