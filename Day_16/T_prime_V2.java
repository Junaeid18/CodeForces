import java.util.Scanner;
import java.util.ArrayList;
public class T_prime_V2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Long> list = new ArrayList<>();
        int limit = (int)1e6;
        int[] ar = new int[limit];
        list.add((long)4);
        for (int i = 3; i <= limit; i+=2) {
            if(ar[i] == 0){
                list.add((long)i*i);
                for (int j = i; j < ar.length; j+=i) {
                    ar[j] = 1;
                }
            }
        }
        int count = 0, testCase = s.nextInt();
        while(count < testCase){
            long test = s.nextLong();
            long test1 = (int)Math.sqrt(test);
            if(test == 1){
                System.out.println("NO");
            }else if(test1* test1 == test){
                if(list.contains(test)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");    
                }
            }else{
                System.out.println("NO");
            }
            ++count;
        }
    }
}
