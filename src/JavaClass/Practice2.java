package JavaClass;
enum Subject {
    SSC(4), CGV, WTA, AJJ, MAD;
    int credits; // instance variable
    Subject() {
        credits = 0;
    }

    Subject(int c) {
        credits = c;
    }

    public int getCredits() {
        return credits;
    }
}
    public class Practice2 {

        public static void main(String[] args) {
            for(Subject s: Subject.values()){
                System.out.println(s+"."+s.ordinal());
            }

            Subject sj,sj2,sj3;
            sj = Subject.SSC;
            sj2 = Subject.AJJ;
            sj3 = Subject.MAD;


            System.out.println(sj.compareTo(sj2));
            System.out.println(sj2.compareTo(sj));

        }
    }
