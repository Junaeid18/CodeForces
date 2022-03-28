import java.lang.Math;
import java.util.Scanner;
public class T_primes {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0,divisor, num = s.nextInt();
        long testNum;
        while(count < num){
            testNum = s.nextLong();
            divisor = 0;
            for(long i = 2; i <= Math.sqrt(testNum); ++i){
                if(testNum % i == 0){
                    if(testNum / i == i){
                        ++divisor;
                    }else{
                        divisor += 2;
                    }
                }
                if(divisor > 1) break;
            }
            if(divisor == 1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            ++count;
        }
    }    
}
