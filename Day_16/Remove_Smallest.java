import java.util.Scanner;
import java.util.Arrays;
public class Remove_Smallest {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, testCase = s.nextInt(), innerCount;
        boolean b;
        while(count < testCase){
            int n = s.nextInt();    innerCount = 0;     b = true;    
            int[] ar = new int[n];
            while(innerCount < n){
                ar[innerCount] = s.nextInt();   ++innerCount;
            }
            Arrays.sort(ar);
            //System.out.println(Arrays.toString(ar));
            for (int i = 0; i < n-1; i++) {
                if(ar[i] > ar[i+1]){
                    if((ar[i] - ar[i+1]) > 1){
                        b = false;  break;
                    }
                }else{
                    if((ar[i+1] - ar[i]) > 1){
                        b = false;  break;
                    }
                }
            }
            if(b){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            ++count;
        }
    }
}
