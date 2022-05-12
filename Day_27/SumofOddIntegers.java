/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-27
*/
import java.util.Scanner;
import static java.lang.Math.sqrt;
public class SumofOddIntegers {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        int testCase = s.nextInt(), n,k,max,sqrtTemp; 
        while(testCase-- > 0){
            n = s.nextInt();    k = s.nextInt();
            sqrtTemp = (int) sqrt(n);
            if(sqrtTemp%2 == 0){
                if(n%2 == 0)max = sqrtTemp; else max = sqrtTemp - 1;
            }else{
                if(n%2 == 1)max = sqrtTemp; else max = sqrtTemp - 1;
            }
            if((max >= k) && (max%2 == k%2))out.append("YES"+"\n");
            else out.append("NO"+"\n");
        }
        System.out.print(out);
    }
}
