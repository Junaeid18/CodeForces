/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-23
*/
import java.util.Scanner;
public class PanoramixPrediction {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        boolean ans = false;
        int[] ar = new int[51];             
        for (int i = 3; i < ar.length; i++) {
            if(ar[i] == 0){
                for (int j = i*i; j < ar.length; j = j+i) {
                    ar[j] = 1;
                }
            }
        }   int n = s.nextInt(), m = s.nextInt();
        if(m%2==0){System.out.println("NO");}
        else{
            n+=2;
            while(n < m && !ans){
                if(ar[n] == 0){ans = true;  System.out.println("NO");}  n+=2;
            }   
            if(!ans){
                if(ar[m]==0){System.out.println("YES");}
                else{System.out.println("NO");}
            }
        }
    }
}
