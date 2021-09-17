package ProblemPractice;

public class Practice_1 {
    public static void main(String[] args) {
        int[] arr = {12,-3,14,-56,77,13};
        System.out.println(func(arr));
    }

    static int func(int[] arr){
        int l = arr.length;
        float c=0;
        int i;
        for(i=0;i<l;i++){
            if(arr[i]>0) c++;
        }

        c= (int) Math.ceil(c/2);
        int temp_count=0;
        for(i=0;i<l;i++){
            if(arr[i]>0) {
                temp_count++;
            }
            if(temp_count == c)
            {
                break;
            }
        }

        return arr[i];
    }
}
