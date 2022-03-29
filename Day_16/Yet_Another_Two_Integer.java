import java.util.Scanner;
public class Yet_Another_Two_Integer {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int rem = 0, num = 0, count = 0, testCase = s.nextInt(), a, b;
        while(count < testCase){
            a = s.nextInt();    b = s.nextInt();
            if(a < b ){
                int t = a;  a = b; b = t;
            }
            rem = a - b;
            if(rem == 0){
                System.out.println(0);
            }else if(rem < 10){  
                System.out.println(1);
            }else{
                if(rem % 10 == 0){
                    num = rem/10;
                    System.out.println(num);
                }else{
                    num = (rem/10)+1;
                    System.out.println(num);
                }
            }
            ++count;
        } 
    }
}
