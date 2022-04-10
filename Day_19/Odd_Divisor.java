import java.util.Scanner;
public class Odd_Divisor {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, testCase = s.nextInt();
        long n,num; boolean b;
        while( count < testCase){
            n = s.nextLong();   b = false;
            if(n >= 3){
                if( n % 2 != 0){    System.out.println("YES");}
                else{
                    num = n;
                    while(!b && num >=3){
                        num = num / 2;    if(num % 2 == 1 && num >=3) {System.out.println("YES"); b = true;}
                    }
                    if(!b) {System.out.println("NO");}
                }
            }else{  System.out.println("NO");}
            ++count;
        }
    }
}
