import java.util.Scanner;
public class Problem1374B{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0, n = s.nextInt(),num,var1,var2;
        while(count < n){
            num = s.nextInt();  var1 = var2 = 0;
            while(num % 2 == 0){
                num /= 2;   ++var1;
            }
            while(num % 3 == 0){
                num /= 3;   ++var2;
            }
            if(num == 1 && var1 <= var2){
                System.out.println((2*var2)-var1);
            }else{  System.out.println(-1);}
            ++count;
        }
        s.close();
    }
}