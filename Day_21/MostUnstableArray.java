/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.Scanner;
public class MostUnstableArray {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, testCase = s.nextInt(),n,m; long res;
        while(count < testCase){
            n = s.nextInt(); m = s.nextInt();
            if(n < 3){
                res = (n==1)? 0 : m;    System.out.println(res);
            }else{
                res = m*2;  System.out.println(res);
            }   ++count;
        }
    }    
}
