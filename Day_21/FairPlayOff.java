/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
*/
import java.util.Scanner;
import static java.lang.Math.max;
import static java.lang.Math.min;
public class FairPlayOff {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, testCase = s.nextInt(),a,b,c,d;
        while(count < testCase){
            a=s.nextInt(); b=s.nextInt(); c=s.nextInt(); d=s.nextInt();
            if(max(a,b) < min(c,d) || max(c,d) < min(a,b)){System.out.println("NO");}
            else{System.out.println("YES");}    ++count;
        }   
    }
}
