/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-24
*/
import java.util.Scanner;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import java.math.BigInteger;
public class RoadToZero {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, testCase = s.nextInt(),x,y,x1,y1,a,b;
        BigInteger step1,result; 
        while(count < testCase){
            x = s.nextInt(); y = s.nextInt(); a = s.nextInt(); b = s.nextInt();
            step1 = BigInteger.valueOf(0); result = BigInteger.valueOf(0);
            if(x <=0 && y <=0){ x = abs(x); y = abs(y); }
            if( (x >=0 && y >=0) ){
                y1 = max(x,y); x1 = min(x,y);   step1 = step1.add(BigInteger.valueOf(a));
                y1 -= x1;   step1 = step1.multiply(BigInteger.valueOf(y1));
                if(b/a >= 2){
                    result = result.add(BigInteger.valueOf(2*a));   result = result.multiply(BigInteger.valueOf(x1));
                    result = result.add(step1);    
                }else{
                    result = result.add(BigInteger.valueOf(b)); result = result.multiply(BigInteger.valueOf(x1));
                    result = result.add(step1);
                }
            }else{
                x = abs(x); y = abs(y);
                step1 = step1.add(BigInteger.valueOf(x));   step1 = step1.multiply(BigInteger.valueOf(a));
                result = result.add(BigInteger.valueOf(y)); result = result.multiply(BigInteger.valueOf(a));
                result = result.add(step1);
            } 
            System.out.println(result); ++count;
        }s.close();    
    }
}
