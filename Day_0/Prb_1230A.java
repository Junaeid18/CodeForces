import java.util.Arrays;
import java.util.Scanner;

public class Prb_1230A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i=0; int[] ar = new int[4];
        while(i<4){
            ar[i] = s.nextInt(); i++;
        }
        Arrays.sort(ar);
        if(ar[0]+ar[1]+ar[2] == ar[3]){
            System.out.println("YES");
        }else if(ar[1]+ar[2] == ar[3]+ar[0]){
            System.out.println("YES");
        }else if(ar[0]+ar[1] == ar[2]+ar[3]){
            System.out.println("YES");
        }else if (ar[0]+ar[2] == ar[1]+ar[3]){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
