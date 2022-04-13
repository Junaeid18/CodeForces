import java.util.Scanner;
public class BachgoldPrbolem {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count, n = s.nextInt();
        if(n % 2 == 0){
            count = n/2;
            System.out.println(count);
            for (int i = 0; i < count; i++) {
                System.out.print(2+" ");
            }
            System.out.println();
        }else{
            count = (n - 3) /2;
            System.out.println(count+1);
            System.out.print(3+" ");
            for (int i = 0; i < count; i++) {
                System.out.print(2+" ");
            }
            System.out.println();
        }
    }
}
