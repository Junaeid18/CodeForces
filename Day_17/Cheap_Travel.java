import java.util.Scanner;
public class Cheap_Travel {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int minSumCase1 = 0,minSumCase2 =0, rem, n = s.nextInt(), m = s.nextInt(), a = s.nextInt(), b = s.nextInt();
        if(((double)b/m) <(double)a){
            rem =  n % m;
            minSumCase1 = ((n-rem)/m) * b + rem * a;
            minSumCase2 = ((n-rem)/m) * b + b;
            if(minSumCase1 < minSumCase2){
                System.out.println(minSumCase1);
            }else{
                System.out.println(minSumCase2);
            }
        }else{
            minSumCase1 = n * a;
            System.out.println(minSumCase1);
        }
    }    
}
