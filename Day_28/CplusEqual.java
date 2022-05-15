/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-28
*/
import java.util.Scanner;
import static java.lang.Math.max;
import static java.lang.Math.min;
public class CplusEqual {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        int testCase = s.nextInt(),i,a,b,n,max,min; 
        while(testCase-- > 0){
            a = s.nextInt();    b = s.nextInt();    n = s.nextInt();    i = 0;  min = max = 0;
            if(a == b && a == 1 && n == 1000000000)i=43;
            else{
                min = min(a, b); max = max(a, b);
                while(min <= n && max <= n){
                    min += max; if(min <= n){max += min; i+=2;}else ++i;
                }
            }
            out.append(i+"\n");
        }   s.close();
        System.out.print(out);
    }
}
