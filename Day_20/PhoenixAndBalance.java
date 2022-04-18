/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.Scanner;
public class PhoenixAndBalance {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] ar = new int[31];
        for (int i = 1; i < 31; i++) {
            ar[i] = (int)Math.pow(2, i);
        }
        int[] diff = new int[31];   diff[2] = 2;
        for (int i = 4; i < diff.length; i+=2) {
            int el1 = 0, el2 = 0;
            for (int j = 1; j <= i; j++) {
                if(j < (i/2)){  el1 += ar[j];}
                else if(j == i) {   el1 += ar[j];}
                else{ el2+= ar[j];}
            }diff[i] = el1 - el2;
        }
        int count = 0, testCase = s.nextInt(),n;
        while(count < testCase){
            n = s.nextInt();    System.out.println(diff[n]);    ++count;
        }   s.close();
    }    
}
