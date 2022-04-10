import java.util.Scanner;
import java.util.Arrays;
public class Honest_Coach {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0,n,diff,minD, testCase = s.nextInt();
        while(count < testCase){
            n = s.nextInt();  int[] ar = new int[n];  
            for (int i = 0; i < n; i++) {
                ar[i] = s.nextInt();
            } Arrays.sort(ar);  minD = diff = ar[1] - ar[0];
            if(diff == 0){
                System.out.println(0);
            }else{
                for (int i = 1; i < n-1; i++) {
                    diff = ar[i+1] - ar[i]; minD = Math.min(minD, diff); 
                }
                System.out.println(minD);
            }
            count++;
        }
    }
}
    