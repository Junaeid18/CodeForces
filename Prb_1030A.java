import java.util.Scanner;

public class Prb_1030A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),i=0,j=0,k=0;
        while (i<n){
            j = s.nextInt();
            if(j == 1) k=1; i++;
        }
        if(k == 1) System.out.println("HARD");
        else System.out.println("EASY");
    }
}
