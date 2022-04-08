import java.util.Scanner;
public class Candies {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0,n,innerC,x, testCase = s.nextInt();
        boolean found;
        while(count < testCase){
            n = s.nextInt();    innerC = 2;    found = false;   x = 0;
            while(!found){
                int var = (int) Math.pow(2, innerC) - 1;
                if(n % var == 0){   x = n / var; found = true; } else {  innerC++;}
            }
            System.out.println(x);
            count++;
        }
    }
}
