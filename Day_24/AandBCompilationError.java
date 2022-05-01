/*
    Junaeid As Jknight
    Somoy paile dekha koiro
    alap-adda-gopposob hobe
    cha or coffee er sathe.
------<<<<<<*>>>>>>>>-----
D-24
*/
import java.math.BigInteger;
import java.util.Scanner;
public class AandBCompilationError {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, n = s.nextInt();
        BigInteger sum = BigInteger.valueOf(0),sum1 = BigInteger.valueOf(0),sum2 = BigInteger.valueOf(0),num1,num2;    
        while(count < n){
            sum = sum.add(s.nextBigInteger());  ++count;
        } n--;  count = 0;
        while(count < n){
            sum1 = sum1.add(s.nextBigInteger());  ++count;
        } n--;  count = 0;
        while(count < n){
            sum2 = sum2.add(s.nextBigInteger());  ++count;
        }   
        num1 = sum.subtract(sum1);  num2 = sum1.subtract(sum2);
        System.out.println(num1);   System.out.println(num2);   s.close();
    }
}
