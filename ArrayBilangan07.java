import java.util.Scanner;

public class ArrayBilangan07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] bil = new int[4];

        bil[0] = 5;
        bil[1] = 12867;
        bil[2] = -7;
        bil[3] = 200000;

       for(int i = 0; i <= 4; i++){
        System.out.println(bil[i]);
       }
    }
}