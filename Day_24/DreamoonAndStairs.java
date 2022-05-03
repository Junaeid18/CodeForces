/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-24
*/
import java.util.Scanner;
public class DreamoonAndStairs {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt(),i; s.close();
        boolean stat = false;
        if(n/m > 0){
            if(n%2==0){
                i = n/2;
                for (; i <= n; i++) {
                    if(i%m == 0){System.out.println(i); stat = true; break;}
                }
            }else{
                i = n/2 + 1;
                for (; i <= n; i++) {
                    if(i%m == 0){System.out.println(i); stat = true; break;}
                }
            }
            if(!stat){System.out.println(-1);}
        }else{System.out.println(-1);}
    }
}