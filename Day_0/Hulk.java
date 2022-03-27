import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),i=1;
        String a1 = "I hate ",a2 = "I love ",a3 = "that ",a4 = "it";
        System.out.print(a1); i++;
        if(i > 0){
            while(i <= n){
                System.out.print(a3);
                if(i % 2 == 0) System.out.print(a2);
                else System.out.print(a1); i++;
            }
            System.out.print(a4);
        }else System.out.print(a4);
    }
}
