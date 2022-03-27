import java.util.Scanner;

public class Wrong_Subtraction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), k = s.nextInt(),i=0;
        while(i < k){
            if(n%10 == 0){
                n = n /10;
            }else{
                n--;
            }i++;
        }
        System.out.println(n);
    }
}
