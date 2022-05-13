/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-27
*/
import java.util.Scanner;
public class FedorAndNewGame {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt(), k = s.nextInt(),xorRes,count = 0, ar[] = new int[m+1];  
        for (int i = 0; i < ar.length; i++) {
            ar[i] = s.nextInt();
        }
        for (int i = 0; i < ar.length - 1; i++) {
            xorRes = ar[i] ^ ar[m];
            if(Integer.bitCount(xorRes) <= k)++count;
        }   s.close();
        System.out.println(count);
    }
}
