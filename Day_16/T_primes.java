import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;
public class T_primes {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<Double>();
        boolean b; 
        double limit = 1000000;
        double testNum;
        for (double i = 2; i <= limit; i++) {
            b = false;
            for (double j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0){
                    b = true;
                } 
            }
            if(b == false){
                System.out.println(i);
                list.add(i);  
            } 
        }
        int count = 0 , testCase = s.nextInt(); 
        while(count < testCase){
            testNum = s.nextDouble();
            testNum = Math.sqrt(testNum);
            System.out.println(testNum);
            if(list.contains(testNum)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            ++count;
        }
    }    
}


/* 
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

*/