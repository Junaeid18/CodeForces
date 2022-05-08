/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-25
*/
import java.util.Scanner;
import static java.lang.Math.max;
import static java.lang.Math.min;
public class Who_sOpposite {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        int testCase = s.nextInt(),mid,diff,limit,a,b,c,max,min; 
        while(testCase-- > 0){
            a = s.nextInt(); b = s.nextInt(); c = s.nextInt();
            max = max(a, b);    min = min(a,b);
            if(max >= (min*2)){
                diff = max - min;   limit = 2 * diff;   mid = limit/2 + 1;
                if(c > limit)out.append(-1+"\n");
                else{
                    if(c == mid)out.append(1+"\n");
                    else if(c < mid)out.append((c+diff)+"\n");
                    else out.append((c-diff)+"\n");
                }
            }else out.append(-1+"\n");
        }   s.close();
        System.out.print(out);
    }
}
