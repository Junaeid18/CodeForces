import java.util.Scanner;
public class Balanced_Array {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, test = s.nextInt();
        long num;
        while(count < test){
            num = s.nextLong();
            if(num %2 == 0){
                num /= 2;
                if(num%2 == 0){
                    System.out.println("YES");
                    for (long i = 1; i <= num; i++) {
                        System.out.print( 2 * i+" ");
                    }
                    for (long i = 1; i < num; i++) {
                        System.out.print((2 * i ) - 1+" ");
                    }
                    System.out.println((3 * num) - 1);
                }else{
                    System.out.println("NO");    
                }
            }else{
                System.out.println("NO");
            }
            count++;
        }
    }    
}
